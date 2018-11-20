package model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import services.GestionConnexion;
public class EnregistrerModel extends ModelDao{
	 
		
	/**
	 * initilisation de la connection
	 */
	 Connection connexion;
 
	/**
	 * initialisation du resultSet
	 */
	ResultSet resultat ;
 
	/**
	 * initialisation du PreparedStatement qui contient une instruction sql deja compilé
	 */
	
 
	PreparedStatement requete=null ;
	
	
	 
		//-------------------------------------------------------------
		// Methodes du model
		//-------------------------------------------------------------	
	
			
		public void enregistre(String login,String mdp)
		{
			// initialisation de la requete
			String requeteString=null;
			
	 
			try
			{
				// ouverture connexion
				connexion=super.getConnection();
				// creation requète
				requeteString = "INSERT INTO clients (identifiant, mdp, connecte) VALUES ('"+login+"','"+mdp+"', 'oui')";
				
				requete=connexion.prepareStatement(requeteString);
				
				requete.executeUpdate();
								
				
			}
			catch(Exception e)
			{
				System.out.println("erreur");
			}
			finally
			{
				try
				{
					// Fermeture de la connexion
					if(resultat!=null)
					{
						GestionConnexion.closeResulset(resultat);
					}
					if(requete!=null)
					{
						GestionConnexion.closeRequest(requete);
					}
					if(connexion!=null)
					{
						GestionConnexion.closeConnection(connexion);
					}
				}
				catch(Exception errorConnection)
				{
					System.out.println("La fermeture de la connexion a provoqué une erreur " + errorConnection);
				}
			}
	 
	
		}
}
