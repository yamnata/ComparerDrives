package beanAction;

//import java.util.Locale;

import java.util.Map;

import model.EnregistrerModel;
import model.UtilisateurModel;

//import org.apache.commons.validator.EmailValidator;
//import org.apache.commons.validator.routines.IntegerValidator;

import bean.Utilisateur;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
public class EnregistrerAction extends ActionSupport{
	public static final long serialVersionUID = 1L;
	/**
	 * l'utilisateur
	 */
	private Utilisateur utilisateur;
	
	/**
	 * Instanciation du model
	 */
	EnregistrerModel modelEnregistrer = new EnregistrerModel();
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
    
	// methode pour valider les login et mot de passe
	public void validate() {

        if ((utilisateur.getIdentifiant()).length()<2) {
                addFieldError("utilisateur.identifiant", "login au moins 2 caractères");
        }
        if ((utilisateur.getMdp()).length()<2) {
                addFieldError("utilisateur.mdp", "mot de passe au moins 2 caractères");
        }
        else {
        addActionMessage(utilisateur.getIdentifiant());
        }
	}
	/**
	 * methode principale pour enregistrer l'utilisateur dans la base  
	 * @return @struts Input or SUCCESS
	 */	
	
	 public String execute (){
		// on recupere les données du formulaire
		   
			String login = utilisateur.getIdentifiant();
			String mdp=utilisateur.getMdp();
			
			Utilisateur authUser = modelUtilisateur.IdentifierLogin(login);
			
		 String action = "input";
		 
		 /**
			 * on déclarre la map de session
			 */
		 Map<String, Object> session = ActionContext.getContext().getSession();
		 if(authUser==null){
			     //enregistrer le nouveau utilisateur dans la base de données
			 modelEnregistrer.enregistre(login,mdp);
							 
				// on renseigne la session
			 session.put("etat","true");
			 session.put("loginUtilisateur",login);
			 session.put("connexion", "Utilisateur enregistré");
			 action=SUCCESS;
		 }	 
		 else
			{   		
				
				// on renseigne la session
				session.put("etat","false");
				session.put("connexion", "utilisateur existe dejà, entrer un autre login");

				action="input";
			}
		 
		 
		 return action;
	 }
}


