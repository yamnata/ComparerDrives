package beanAction;

import java.util.Map;

import model.UtilisateurModel;
import bean.Utilisateur;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/** 
Action Classe : UtilisateurAction
*/

public class UtilisateurAction extends ActionSupport {

	
	/**
	 * Description :
	 * long serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
  
	
	/**
	 * l'utilisateur
	 */
	private Utilisateur utilisateur;
	
	/**
	 * Instanciation du model
	 */
	UtilisateurModel modelUtilisateur = new UtilisateurModel();



	//-------------------------------------------------------------
	// Getters et setters
	//-------------------------------------------------------------		

	/**
	 * Accesseur
	 * @return the utilisateur
	 */
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	/**
	 * Mutateur
	 * @param utilisateur the utilisateur to set
	 */
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}


	//-------------------------------------------------------------
	// Others methods
	//-------------------------------------------------------------	


	/**
	 * Methode
	 * Description : Permet d'identifier un utilisateur en fonction de son mot de passe et login.
	 * @return @struts Error or SUCCESS
	 */

	public String identifierUtilisateurs()  {
      
		// on récupère les données du formulaire
		String loginForm = utilisateur.getIdentifiant();
		String mdp=utilisateur.getMdp();
		
		// pointer
		String action = "error";
		
		// on récupère l'utilisateur correspondant en base s'il existe
		Utilisateur authUser = modelUtilisateur.Identifier(loginForm,mdp);
		/**
		 * on déclarre la map de session
		 */
		
		Map<String, Object> session = ActionContext.getContext().getSession();
		if (authUser != null) {
			
			// on renseigne la session
			session.put("etat","true");
			session.put("loginUtilisateur",authUser.getIdentifiant());
			session.put("connexion", "Vous etes connecté");
          modelUtilisateur.connecter(loginForm,mdp);
			action=SUCCESS;			
		}
		else
		{   
			// on renseigne la session
			session.put("etat","false");
			session.put("connexion", "Erreur d'authentification");
			
			action=ERROR;
		}
		return action;
	}
}