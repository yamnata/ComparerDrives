package beanAction;

import com.opensymphony.xwork2.ActionSupport;

import model.DeconnexionModel;
import bean.Utilisateur;

public class DeconnexionAction extends ActionSupport{
	public static final long serialVersionUID = 1L;
	/**
	 * l'utilisateur
	 */
	private Utilisateur utilisateur;
	
	/**
	 * Instanciation du model
	 */
	DeconnexionModel modelDeconnexion = new DeconnexionModel();



	//-------------------------------------------------------------
	// Getters et setters
	//-------------------------------------------------------------		

	/**
	 * Accesseur
	 * @return l' utilisateur
	 */
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	
	 // Mutateur
	 
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	/**
     * @return @struts SUCCESS
     *            action sera utilisée dans struts.xml
     */ 
	 public String executer (){
		// on récupère le login
		 String login = utilisateur.getIdentifiant();
		//on appelle la fonction pour modifier le statut à la base de données
		 		
		 modelDeconnexion.modifie(login);
		 		
		 return SUCCESS;
	 }
}
