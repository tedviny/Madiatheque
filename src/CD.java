
public class CD extends AOuvrage {

	public CD(String libelle, String auteur, String titre, String identifiant, boolean disponible, String dateDeSortie,
			String dateDeRetour) {
		super(libelle, auteur, titre, identifiant, disponible, dateDeSortie, dateDeRetour);
	}
	
	public void information() {
		System.out.println("********** CD (Compact Disc) ***********");
		super.information();
	}

}
