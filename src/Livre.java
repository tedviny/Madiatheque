
public class Livre extends AOuvrage {

	public Livre(String libelle, String auteur, String titre, String identifiant, boolean disponible,
			String dateDeSortie, String dateDeRetour) {
		super(libelle, auteur, titre, identifiant, disponible, dateDeSortie, dateDeRetour);
	}
	
	public void information() {
		System.out.println("********** Livre (Livre) ***********");
		super.information();
	}
}
