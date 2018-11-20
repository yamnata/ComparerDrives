package beanAction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//import model.AfficherModel;
import bean.Drive;
import bean.Produit;
import bean.Utilisateur;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AfficherAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
    private Produit produit=null;
    private Drive driveC=null, driveU=null;
    /**
     * l'utilisateur
     */
    private Utilisateur utilisateur;  	


	 // Liste de produits de deux drives qu'on veut les afficher 
   private List<Produit>    listeCasino=null;
   private List<Produit>    listeCourseU=null;
   
   // Accesseurs      
     
    public Utilisateur getUtilisateur() {
    	return utilisateur;
    }
   
    public Drive getDriveC() {
		return driveC;
	}
    public Drive getDriveU() {
		return driveU;
	}
	
    public Produit getProduit() {
		return produit;
	}
    public List<Produit> getListCasino() {
        return listeCasino;
    }
    public List<Produit> getListCourseU() {
        return listeCourseU;
    }
     // Mutateurs    
     
    public void setUtilisateur(Utilisateur utilisateur) {
    	this.utilisateur = utilisateur;
    }	
    public void setDriveC(Drive driveC) {
		this.driveC = driveC;
	}
	public void setDriveU(Drive driveU) {
		this.driveU = driveU;
	}
    public void setProduit(Produit produit) {
		this.produit = produit;
	}    
 
    public void setListCasino(List<Produit> listeCasino) {
        this.listeCasino = listeCasino;
    }
    public void setListCourseU(List<Produit> listeCourseU) {
        this.listeCourseU = listeCourseU;
    }
	
    /**
     * @return @struts ERROR or SUCCESS
     *             l'action qui va utilisée dans struts.xml
     */ 
	public String afficherProduit(){
		String login=utilisateur.getIdentifiant();	
		String nom=produit.getNom();
		String nomU=driveU.getNom();
		String codeCasino=driveC.getCode();
		String codeCourseU=driveU.getCode();
        String action = "error";
       
	    /**
	    * on déclarre la map de session
	    */
	
	    Map<String, Object> session = ActionContext.getContext().getSession();
	    // on renseigne la session
	    
	    session.put("loginUtilisateur",login);
	    session.put("codeCasino", codeCasino);
	    session.put("codeCourseU", codeCourseU);
       try{
			
			// Instantiate CookieManager;
	        // make sure to set CookiePolicy
			CookieManager ckman = new CookieManager();
			
			CookieHandler.setDefault(ckman);
			  
			// get content from URLConnection;
	        // cookies are set by web site
			URL adress1=new URL("http://www.mescoursescasino.fr/ecommerce/GC-catalog/fr/"+codeCasino+"/?moderetrait=Z2");
			URL adress2=new URL("http://www.mescoursescasino.fr/ecommerce/recherche/"+codeCasino+"/Acheter/"+nom);
			URLConnection connection1 = adress1.openConnection();
			URLConnection connection2 = adress2.openConnection();
	 		connection1.getContent();
		    connection2.getContent();
			//recuperer le code source en fichier texte
			BufferedReader in = new BufferedReader(
					new InputStreamReader(connection2.getInputStream()));
			String line;
			String prix = null, prix_unit = null, img=null, n=null, pr;
			int index1, index2;
			listeCasino = new ArrayList<Produit>();
			
            while ((line=in.readLine())!=null){
            	
            	if(line.contains("class=\"img POP_open")==true && line.contains(nom) && (line.contains("fruits")||line.contains("legumes"))&& line.contains("terre")==false){
					// on crée une instance du Produit
            		Produit p=new Produit(n,prix,prix_unit,img);
					// on cherche le nom, prix, prix unitaire et l'image du produit
            		line=in.readLine();line=in.readLine();
					index1=line.indexOf("src=");
					index2=line.indexOf(".jpg");
					img=line.substring(index1+5, index2+4);
					line=in.readLine();
					index1=line.indexOf("=\"");
					index2=line.indexOf("\">");
					n=line.substring(index1+2, index2);
					
					if(n.indexOf(nom)==1){
						p.setNom(n);
						p.setImage(img);
						while(line.contains("class=\"POP_open")==false)line=in.readLine();
						while(line.contains("<span class=\"info")==false)line=in.readLine();
						line=in.readLine();						
						prix_unit=line.replaceAll("&euro;", "€");
						while(line.contains("<div class=\"prix")==false)line=in.readLine();
					    line=in.readLine();
						prix=(line.replaceAll("&euro;", "€ "));
						
						p.setPrix(prix);
						p.setPrix_unitaire(prix_unit);
						//on stocke l'objet p dans listeCasino
						listeCasino.add(p);						
						
					}
				}
            }
            
            /**connection courseU drive*/
            
			// Instantiate CookieManager;
	        // make sure to set CookiePolicy
			CookieManager ckmanU = new CookieManager();
			
			CookieHandler.setDefault(ckmanU);
			  
			// get content from URLConnection;
	        // cookies are set by web site
			URL adress3=new URL("http://www.coursesu.com/"+codeCourseU+"/AccueilMagasin/_mag");
			URL adress4=new URL("http://www.coursesu.com/produits-frais/"+nomU);
			URLConnection connection3 = adress3.openConnection();
			URLConnection connection4 = adress4.openConnection();
			connection3.getContent();
		    connection4.getContent();
			//**recuperer le code html en fichier texte
			BufferedReader inU = new BufferedReader(
					new InputStreamReader(connection4.getInputStream()));
			
			listeCourseU = new ArrayList<Produit>();
			
            while ((line=inU.readLine())!=null){
            	
            	if(line.contains("img height=\"156")==true){
            		Produit p=new Produit(n,prix,prix_unit,img);
            		index1=line.indexOf("static/wlpdatas");
            		index2=line.indexOf(".jpg");   		
            		        		
            		           		
            		if(index1==-1)img="http://www.coursesu.com/static/images/produits/156x156.jpg";
            		else{
            			img=line.substring(index1, index2+4);
            			img="http://www.coursesu.com/".concat(img);
            		}
            		p.setImage(img);
            		index1=line.indexOf("\" class=\"link-img");            		
            		if(index1==-1){
            			index1=line.indexOf("/></a><div");
            			n=line.substring(index2+11, index1-1);
            		}
            		else n=line.substring(index2+11, index1-1);
            		if(n.contains(nom)){
            			p.setNom(n);
            			while (line.contains("unitary-price")==false) 
            				line=inU.readLine();
            		    
            		    	index1=line.indexOf("unitary-price");
            		    	index2=line.indexOf("</span></div><div");
            		
            		    if(index1==-1){
            			    index1=line.indexOf("new-price");                		
                		    prix_unit=(line.substring(index1+11, index2)).replaceAll("â", "€");
            		    }
            		   else prix_unit=(line.substring(index1+15, index2)).replaceAll("â", "€");
            		   p.setPrix_unitaire(prix_unit);
            		   index1=line.indexOf("right price");            	
            		
            		   if(index1==-1){
            			   index1=line.indexOf("product-price");                		
                		   prix=(line.substring(index1+15, index1+20)).replaceAll("â", "€");
            		   }
            		   else prix=(line.substring(index1+19, index1+24)).replaceAll("â", "€");
            		   p.setPrix(prix);          
            		   listeCourseU.add(p); 
            		}
            		    
            	}
						      
            }	
		            
		}
 
		catch(IOException e){
			System.err.println("error connecting to server.");
			e.printStackTrace();
		}
       	// on stocke les listes de produits pour pouvoir afficher dans la page web jsp
		 session.put("liste1", listeCasino);
		 session.put("liste2", listeCourseU);
		 action=SUCCESS;
		 
		 return action;
	}

}
