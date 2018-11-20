package bean;

public class Produit {
	
	private String nom=null;
	private String prix=null;
	private String prix_unitaire=null;
    private String image=null;
	public Produit() {
		// TODO Auto-generated constructor stub
		this("", "", "","");
	}
	
	public Produit(String n,String p,String pu,String img) {
		this.setNom(n);
		this.setPrix(p);
		this.setPrix_unitaire(pu);
		this.setImage(img);
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prix
	 */
	public String getPrix() {
		return prix;
	}

	/**
	 * @param prix the prix to set
	 */
	public void setPrix(String prix) {
		this.prix = prix;
	}

	/**
	 * @return the prix_unitaire
	 */
	public String getPrix_unitaire() {
		return prix_unitaire;
	}

	/**
	 * @param prix_unitaire the prix_unitaire to set
	 */
	public void setPrix_unitaire(String prix_unitaire) {
		this.prix_unitaire = prix_unitaire;
	}
	/**
	 * @return the URL Image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @param nom the URL Image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}

}
