package model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import services.GestionConnexion;


public class AjouterDriveModel extends ModelDao{
	/**
	 * initilisation de la connection
	 */
	//Connection connexion1 = null;
	//Connection connexion2 = null;
	Connection connexion = null;
	//Connection connexion4 = null;
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
	PreparedStatement requete3=null;
	PreparedStatement requete4=null;
	
    
	//-------------------------------------------------------------
	// Methodes du model
	//-------------------------------------------------------------	
 
	/**
	 * Méthode de mapping Objet/relationnel pour l'Utilisateur
	 * @param resultat
	 * @return Utilisateur
	 */
	public void ajouter(String login, String nom1, String nom2, String code1, String code2)
	{
		// initialisation de la requete
		
		String requeteString3=null;
		String requeteString4=null;
		try
		{
			// ouverture connexion
			connexion=super.getConnection();
			
			requeteString3 = "INSERT INTO drive (identifiant, nomDrive, numero, code ) VALUES ('"+login+"', 'casino', '"+nom1+"', '"+code1+"' )";
			
			requete3=connexion.prepareStatement(requeteString3);
			
			requete3.executeUpdate();
			// ouverture connexion
			//connexion4=super.getConnection();
			requeteString4 = "INSERT INTO drive (identifiant, nomDrive, numero, code ) VALUES ('"+login+"', 'courseU', '"+nom2+"', '"+code2+"' )";
			requete4=connexion.prepareStatement(requeteString4);
			requete4.executeUpdate();
			
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
				
					GestionConnexion.closeResulset(resultat1);
					GestionConnexion.closeResulset(resultat2);
					GestionConnexion.closeRequest(requete1);
					GestionConnexion.closeRequest(requete2);					
					GestionConnexion.closeRequest(requete3);
					GestionConnexion.closeRequest(requete4);
				
					GestionConnexion.closeConnection(connexion);
			}
			catch(Exception errorConnection)
			{
				System.out.println("La fermeture de la connexion a provoqué une erreur " + errorConnection);
			}
		}
 

	}
}

