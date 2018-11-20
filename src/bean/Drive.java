package bean;

public class Drive {
	private String nom;
	
	private String code;
	
	//Constructeur par defaut
	
	public Drive(){
		this("","");
	}
	
	//Constructeur avec paramètres
	public Drive(String n, String c) {
		this.setNom(n);
		
		this.setCode(c);
	}

	// getters et setters
	public String getNom(){
		return nom;
	}

	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	
	public String getCode() {
		return code;
	}

	
	public void setCode(String code) {
		this.code = code;
	}
	

}
