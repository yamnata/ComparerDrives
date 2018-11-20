package model;
import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletContext;
import javax.sql.DataSource;
 
import org.apache.struts2.ServletActionContext;
public class ModelDao implements Dao{
	
	/* initialisation du context	 */
	Context ctx=null;
	/**
	 * La source de données 
	 */
	DataSource dataSource=null;

	/**
	 * La Connection
	 */

	
	public Connection getConnection() throws NamingException
	{

		ServletContext servletContext=ServletActionContext.getServletContext();
		if(this.dataSource==null)
		{
			dataSource=(DataSource)servletContext.getAttribute("dataSource");
		}
		Connection connection=null;
		if(dataSource!=null)
		{
			try
			{
				connection=dataSource.getConnection();
			}
			catch(SQLException e)
			{
				System.out.println(e);
			}
		}
		return connection;
	}

	/**
	 * @param dataSource
	 */
	public void setConnection(DataSource dataSource)
	{
		this.dataSource=dataSource;
	}

}

