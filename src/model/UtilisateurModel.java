package model;
/*import java.util.List;
import bdd.TableUtilisateur;
import bean.Utilisateur;*/
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import services.GestionConnexion;
import bean.Utilisateur;
public class UtilisateurModel extends ModelDao{
/*
	//methodes du model
	public boolean isIdentifier(String loginForm, String passwordForm){
		//on récupère la liste dans la base de données (ici en dur)
		TableUtilisateur currentListe=new TableUtilisateur();
		List<Utilisateur> malist=currentListe.creationList();
		//on parcour la liste et on teste les entrées de formulaire 
		for (int i=0; i<malist.size(); i++){
		if(loginForm.equalsIgnoreCase(malist.get(i).getIdentifiant()) && passwordForm.equalsIgnoreCase(malist.get(i).getMdp())){
				return true;
			}
		}
		return false;
	}*/
	//-------------------------------------------------------------
		// Attributs
		//-------------------------------------------------------------
	 
		/**
		 * initilisation de la connection
		 */
		Connection connexion = null;
	 
		/**
		 * initialisation du resultSet
		 */
		ResultSet resultat = null;
	 
		/**
		 * initialisation du PreparedStatement
		 */
		PreparedStatement requete=null;
	 
		/**
		 * initialisation du bean utilisateur
		 */
		Utilisateur utilisateur=null;
	 
		//-------------------------------------------------------------
		// Methodes du model
		//-------------------------------------------------------------	
	 
		/**
		 * Méthode de mapping Objet/relationnel pour l'Utilisateur
		 * @param resultat
		 * @return Utilisateur
		 */
		public Utilisateur mappingUtilisateur(ResultSet resultat)
		{
	 
			// on instancie un nouvel utilisateur
			Utilisateur utilisateur = new Utilisateur();
	 
			try 
	 
			{					
				// ---------------
	 
				if (resultat.getString("identifiant") == null)
				{
					utilisateur.setIdentifiant("");
				}
				else
				{
					utilisateur.setIdentifiant(resultat.getString("identifiant"));
				}
	 
				// ---------------
				if (resultat.getString("mdp") == null)
				{
					utilisateur.setMdp("");
				}
				else
				{
					utilisateur.setMdp(resultat.getString("mdp"));
				}
			}
			catch (Exception e)
			{
				utilisateur=null;
				System.out.println("erreur de mapping :" + e);
			}
	 
			return utilisateur;
		}	
	 
		/**
		 * Methode d'accès aux données de l'utilisateur
		 * @param loginForm
		 * @param passwordForm
		 * @return
		 */
		public Utilisateur Identifier(String loginForm,String mdp) {
	 
			// initialisation de la requete
			String requeteString=null;
			Utilisateur utilisateur=null;
	 
			try
			{
				// ouverture connexion
				connexion=super.getConnection();
	 
				// creation requète
				requeteString = "SELECT * FROM clients WHERE identifiant='"+loginForm+"' AND mdp='"+mdp+"'";
	 
				// preparation requête
				requete=connexion.prepareStatement(requeteString);
				
					 
				// éxécution requête
				resultat= requete.executeQuery();
	 
				// On stocke le resultat dans l'objet utilisateur
				if(resultat!=null)
				{
					if(resultat.next())
					{
						// mapping des attributs &lt;=&gt; champs Sql
						utilisateur=mappingUtilisateur(resultat);
					}
				}
			}
			catch(Exception e)
			{
				utilisateur=null;
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
	 
			return utilisateur;
		}
		
		public Utilisateur IdentifierLogin(String loginForm) {
			 
			// initialisation de la requete
			String requeteString=null;
			Utilisateur utilisateur=null;
	 
			try
			{
				// ouverture connexion
				connexion=super.getConnection();
	 
				// creation requète
				requeteString = "SELECT * FROM clients WHERE identifiant='"+loginForm+"' ";
	 
				// preparation requête
				requete=connexion.prepareStatement(requeteString);
				
					 
				// éxécution requête
				resultat= requete.executeQuery();	 	
				if(resultat!=null)
				{
					if(resultat.next())
					{
						// mapping des attributs &lt;=&gt; champs Sql
						utilisateur=mappingUtilisateur(resultat);
					}
				}
			}
			catch(Exception e)
			{
				utilisateur=null;
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
	 
			return utilisateur;
		}

		public void connecter(String loginForm, String mdp) {
			String requeteString=null;
			
			 
			try
			{
				// ouverture connexion
				connexion=super.getConnection();
				// creation requète
				requeteString = "UPDATE clients SET connecte='oui' WHERE identifiant='"+loginForm+"' AND mdp='"+mdp+"' ";
				
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
