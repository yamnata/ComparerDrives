package services;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
 
public class GestionConnexion
{
 
	// ferme le ResultSet
	public static void closeResulset(ResultSet resultat)
	{
		if(resultat!=null)
		{
			try
			{
				System.out.println("Resultset fermé avec succès");
				resultat.close();
			}
 
			catch(Exception e)
			{
				System.out.println("Erreur de fermeture du Resultset");
			}
		}
	}
 
	// Ferme une requête
	public static void closeRequest(Statement requete)
	{
		if(requete!=null)
		{
			try
			{
				System.out.println("requete fermée avec succès");
				requete.close();
			}
			catch(Exception e)
			{
				System.out.println("Erreur de fermeture d'une requète");
			}
		}
	}
 
	// Ferme une connexion
	public static void closeConnection(Connection connexion)
	{
		if(connexion!=null)
		{
			try
			{
				System.out.println("connexion fermée avec succès");
				connexion.close();
			}
 
			catch(Exception e)
			{
				System.out.println("Erreur de fermerture d'une connexion");
			}
		}
	}
 
}

