package beanAction;
import java.util.Map;

import bean.Utilisateur;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class NaviguerAction extends ActionSupport{

	/**
	 * serial version
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * l'utilisateur
	 */
	private Utilisateur utilisateur;
	/**
	 * Accesseur
	 * @return  utilisateur
	 */
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	/**
	 * Mutateur
	 * @param utilisateur 
	 *          l'objet utilisateur
	 */
	

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	/**
     * @return @struts SUCCESS
     *            
     */ 
	public String execute(){
		// on recupere les données du formulaire
		   
					String login = utilisateur.getIdentifiant();
					
				 String action = SUCCESS;
				 
				 /**
					 * on déclarre la map de session
					 */
				 Map<String, Object> session = ActionContext.getContext().getSession();
				 
					 session.put("loginUtilisateur",login);
					return action;
	}

}