package services;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.sql.DataSource;

//service de connection SGBD
//configurer notre écouteur (DatasourceListener.java) , chargé de récupéré la dataSource
public class DatasourceListener implements ServletContextListener{
 
	Context context=null;
 
	//fonction appelée lors de la création du lanceur
	public void contextInitialized(ServletContextEvent servletContextEvent)
	{
		ServletContext servletContext=servletContextEvent.getServletContext();
 
		System.out.println("récupération du ServletContext" + servletContext);
 
		String dataSourceJNDI=servletContext.getInitParameter("dataSource");
 
		System.out.println("récupération de la dataSourceJNDI" + dataSourceJNDI);
 
		try
		{
			context=new InitialContext();
			DataSource dataSource=(DataSource)context.lookup(dataSourceJNDI);
			if(dataSource==null)
			{
				System.out.println("Echec lors de la récupèration de la datasource");
			}
			else
			{
				System.out.println("DataSource chargée");
			}
			servletContext.setAttribute("dataSource", dataSource);
		}
		catch(NamingException e)
		{
			throw new RuntimeException();
		}
		finally
		{
			try
			{
				//fermer le context
				if(context!=null)
				{
					context.close();
				}
			}
			catch(Exception e)
			{
				System.out.println("Erreur lors de initCtx !");
			}
		}
	}
 
	//fonction appelée lors de la destruction du lanceur
	public void contextDestroyed(ServletContextEvent servletContextEvent)
	{
		try
		{
			//fermer le context
			if(context!=null)
			{
				context.close();
			}
		}
		catch(Exception e)
		{
			System.out.println("Erreur lors de initCtx !");
		}
	}
}
