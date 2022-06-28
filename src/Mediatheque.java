import java.util.ArrayList;

public class Mediatheque {
	
	private ArrayList <AOuvrage> listeOuvrage;
	
	public Mediatheque() {
		this.listeOuvrage = new ArrayList<AOuvrage>();
	}
	
	
	
	public void addCD(String libelle, String auteur, String titre, String identifiant, boolean disponible, String dateDeSortie,
			String dateDeRetour){
		listeOuvrage.add(new CD(libelle,auteur,titre,identifiant,disponible,dateDeSortie,dateDeRetour));

		} 
	public void addDVD(String libelle, String auteur, String titre, String identifiant, boolean disponible, String dateDeSortie,
			String dateDeRetour){
		listeOuvrage.add(new DVD(libelle,auteur,titre,identifiant,disponible,dateDeSortie,dateDeRetour));

		} 
	public void addLivre(String libelle, String auteur, String titre, String identifiant, boolean disponible, String dateDeSortie,
			String dateDeRetour){
		listeOuvrage.add(new Livre(libelle,auteur,titre,identifiant,disponible,dateDeSortie,dateDeRetour));

		}
	
	public ArrayList<AOuvrage> getListeOuvrage() {
		return listeOuvrage;
	}
	
	public void setListeOuvrage(ArrayList<AOuvrage> listeOuvrage) {
		this.listeOuvrage = listeOuvrage;
	} 
	public void showOuvrage() {
		for(var i : listeOuvrage) {
			i.information();
		}
	}
	
}
