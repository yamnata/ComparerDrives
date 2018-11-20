package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import services.GestionConnexion;

public class DeconnexionModel extends ModelDao{
	/**
	 * initilisation de la connection
	 */
	 Connection connexion;
 
	/**
	 * initialisation du resultSet
	 */
	ResultSet resultat ;
 
	/**
	 * initialisation du PreparedStatement
	 */
	
 
	PreparedStatement requete=null ;
	 
		//-------------------------------------------------------------
		// Methodes du model
		//-------------------------------------------------------------	
	 
		/**
		 * Méthode de mapping Objet/relationnel pour l'Utilisateur
		 * @param resultat
		 * @return Utilisateur
		 */
		
			
		public void modifie(String login)
		{
			// initialisation de la requete
			String requeteString=null;
			
	 
			try
			{
				// ouverture connexion
				connexion=super.getConnection();
				// creation requète
				requeteString = "UPDATE clients SET connecte='non' WHERE identifiant='"+login+"'";
				
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

