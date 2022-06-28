
public enum TypeOuvrage {
	Livre("Livre"), 
	CD("Compac tDisc"), 
	DVD("Digital Video Disc");

	protected String libelle; 
	TypeOuvrage(String libelle){
		this.libelle=libelle;
	}
}
