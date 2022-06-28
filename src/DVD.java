
public class DVD extends AOuvrage {

	public DVD(String libelle, String auteur, String titre, String identifiant, boolean disponible, String dateDeSortie,
			String dateDeRetour) {
		super(libelle, auteur, titre, identifiant, disponible, dateDeSortie, dateDeRetour);
	}
	
	public void information() {
		System.out.println("********** DVD (Digital Video Disc) ***********");
		super.information();
	}
}
