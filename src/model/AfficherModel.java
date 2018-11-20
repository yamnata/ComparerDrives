package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import services.GestionConnexion;

public class AfficherModel extends ModelDao{
	/**
	 * initilisation de la connection
	 */
	Connection connexion = null;
	
	
	/**
	 * initialisation du resultSet
	 */
	ResultSet resultat1 = null;
	ResultSet resultat2 = null;
	/**
	 * initialisation du PreparedStatement
	 */
	PreparedStatement requete1=null;
	PreparedStatement requete2=null;
	
	public String afficherCasino(String login){
		String code1 = null;
		// initialisation de la requete
					String requeteString=null;
					
					try
					{
						// ouverture connexion
						connexion=super.getConnection();
			 
						// creation requète
						requeteString = "SELECT code FROM drive WHERE identifiant='"+login+"' AND nomDrive='casino'";
			 
						// preparation requête
						requete1=connexion.prepareStatement(requeteString);
						// éxécution requête
						resultat1= requete1.executeQuery();
			 
							code1=resultat1.getString(1);
						
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
							if(resultat1!=null)
							{
								GestionConnexion.closeResulset(resultat1);
							}
							if(requete1!=null)
							{
								GestionConnexion.closeRequest(requete1);
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
			 
					return code1;
						
	}
	
	public String afficherCourseU(String login){
		String code2 = null;
		// initialisation de la requete
					String requeteString=null;
					
					try
					{
						// ouverture connexion
						connexion=super.getConnection();
			 
						// creation requète
						requeteString = "SELECT code FROM drive WHERE identifiant='"+login+"' AND nomDrive='courseU'";
			 
						// preparation requête
						requete2=connexion.prepareStatement(requeteString);
							 
						// éxécution requête
						resultat2= requete2.executeQuery();			 
						
						
							code2=resultat2.getString(1);
						
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
							if(resultat2!=null)
							{
								GestionConnexion.closeResulset(resultat2);
							}
							if(requete2!=null)
							{
								GestionConnexion.closeRequest(requete2);
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
			 
					return code2;
						
	}

}
