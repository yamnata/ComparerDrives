package bean;

public class Utilisateur {
	//-------------------------------------------------------------
		// Properties
		//-------------------------------------------------------------

		String identifiant;
		String mdp;
		//-------------------------------------------------------------
		// Constructeur(s)
		//-------------------------------------------------------------	

		/**
		 * Constructeur vide
		 */
		public Utilisateur() {
			// vide
		}	

		/**
		 * Constructeur qualifie
		 
		 */
		public Utilisateur(String identifiant, String mdp) {
			super();
			this.identifiant = identifiant;
			this.mdp=mdp;
		}

		//-------------------------------------------------------------
		// Getters et setters
		//-------------------------------------------------------------	

		
		public String getIdentifiant() {
			return identifiant;
		}

		
		public void setIdentifiant(String identifiant) {
			this.identifiant = identifiant;
		}
		public String getMdp() {
			return mdp;
		}

		
		public void setMdp(String mdp) {
			this.mdp = mdp;
		}
		
}
