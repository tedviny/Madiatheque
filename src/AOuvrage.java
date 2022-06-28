
public abstract class AOuvrage {
	private String libelle="";
	private String auteur="";
	private String titre="";
	private String identifiant="";
	private boolean disponible=false;
	private String dateDeSortie="";
	private String dateDeRetour="";
	

	public AOuvrage(String libelle, String auteur, String titre, String identifiant, boolean disponible, String dateDeSortie,
			String dateDeRetour) {
		// TODO Auto-generated constructor stub
		this.libelle=libelle;
		this.auteur=auteur;
		this.titre=titre;
		this.identifiant=identifiant;
		this.disponible=disponible;
		this.dateDeSortie=dateDeSortie;
		this.dateDeRetour=dateDeRetour;
	}
	
	

	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	public String getAuteur() {
		return auteur;
	}


	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public String getIdentifiant() {
		return identifiant;
	}


	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}


	public boolean isDisponible() {
		return disponible;
	}


	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}


	public String getDateDeSortie() {
		return dateDeSortie;
	}


	public void setDateDeSortie(String dateDeSortie) {
		this.dateDeSortie = dateDeSortie;
	}


	public String getDateDeRetour() {
		return dateDeRetour;
	}


	public void setDateDeRetour(String dateDeRetour) {
		this.dateDeRetour = dateDeRetour;
	}
	
	public void information() {
		System.out.println("|Titre  : "+titre);
		System.out.println("|De  : "+auteur);
		System.out.println("|Identifiant  : "+identifiant);
		System.out.println("|Disponible  : "+disponible);
		System.out.println("|Date de sortie  : "+dateDeSortie);
		System.out.println("|Date de retour  : "+dateDeRetour);
	}
	
}
