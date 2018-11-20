package beanAction;
import java.util.*;

import model.AjouterDriveModel;
import bean.Utilisateur;
import bean.Drive;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
public class AjouterDriveAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
    private Drive driveC, driveU;
    private String codeC, codeU ;   
    private Utilisateur utilisateur;

    
     //-------------------------------------------------------------
     // Getters et setters
     //-------------------------------------------------------------		
    public Drive getDriveC() {
		return driveC;
	}
    public Drive getDriveU() {
		return driveU;
	}
	public void setDriveC(Drive driveC) {
		this.driveC = driveC;
	}
	public void setDriveU(Drive driveU) {
		this.driveU = driveU;
	}
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
    /**
     * Instanciation du model
      */
    AjouterDriveModel modelDrive = new AjouterDriveModel();
	
	/**
     * @return @struts ERROR or SUCCESS 
     *         action sera utilisée dans struts.xml   
     */ 
	public String execute(){
		String login=utilisateur.getIdentifiant();	
		String nomC=driveC.getNom();
		String nomU=driveU.getNom();
		
        String action = "error";
        
	    /**
	    * on déclarre la map de session
	    */
	
	    Map<String, Object> session = ActionContext.getContext().getSession();
	    // on renseigne la session
	    
	    session.put("loginUtilisateur",login);
	    
	    switch (Integer.parseInt(nomC)) {
        case 1:  codeC = "WE75327";
                 nomC = "Géant Casino PARIS Massena (13 PLACE DE VENETIE 75113 PARIS)";
                 break;
        case 2:  codeC = "WE75922";
                 nomC = "Supermarché Casino PARIS Flandre (77 AVENUE DE FLANDRE 75119 PARIS)";
                 break;
        case 3:  codeC = "WE75385";
         		 nomC= "Supermarché Casino PARIS Grand Pavois (352 RUE LECOURBE 75015 PARIS 15)";
                 break;
        case 4:  codeC = "WE75167";
                 nomC= "Supermarché Casino PARIS Menilmontant (28-30-34 RUE DE MENILMONTANT 75020 PARIS 20)";
                 break;
        case 5:  codeC = "WE75370";
                 nomC= "Supermarché Casino PARIS Montparnasse (30-32 BOULEVARD DE VAUGIRARD 75015 PARIS 15)";
                 break;
        case 6:  codeC = "WE75272";
                 nomC="Supermarché Casino PARIS Saint-Didier (16 RUE DES BELLES FEUILLES 75116 PARIS)";
                 break;
	    }
	    driveC.setCode(codeC);driveC.setNom(nomC);
	    session.put("codeCasino", driveC.getCode());
	    session.put("nomCasino", driveC.getNom());
	    switch (Integer.parseInt(nomU)) {
        case 1:  codeU = "paris";
                 nomU= "Super U Paris (103 AVENUE DE CLICHY 75017 PARIS)";
        	
                 break;
        case 2:  codeU = "parisorfila";
                 nomU= "U Express Paris Orfila (50 RUE ORFILA 255 RUE DES PYRENNEES 75020 PARIS)";
                 break;
        case 3:  codeU = "parisjemmapes";
                 nomU= "U Express Paris Jemmapes (64 quai de Jemmapes 75010 Paris)";
                 break;
	    }
		driveU.setCode(codeU);driveU.setNom(nomU);
		session.put("codeCourseU", driveU.getCode());
		session.put("nomCourseU", driveU.getNom());
		 //modelDrive.ajouter(login,nom1,nom2,code1,code2);
		 action=SUCCESS;
		 
		 return action;
	}
	
}	