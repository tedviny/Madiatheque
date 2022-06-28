import java.util.Scanner;

public class Main {
	
	static private Mediatheque mediatheque = new Mediatheque();
	static private Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("*********Bienvenu dans la mediatheque**********");
		accueil();
		
	}
	
	public static void accueil() {
		System.out.println("[1] - Entrer un nouvel ouvrage");
		System.out.println("[2] - Afficher les ouvrages de la m�diath�que");
		System.out.println("[3] - Sortir de la m�diath�que");
		
		int choix = sc.nextInt();
		
		switch(choix) {
		case 1: entreeUnNouvelOuvrage();
			break;
		case 2: mediatheque.showOuvrage();
			System.out.println();
			accueil();
			break;
		case 3:
			System.out.println("Au revoir et � bientot !");
			break;
		default:
			System.out.println("Votre choix entre 1 et 3 :");
			break;
		}
	}
	
	public static void entreeUnNouvelOuvrage() {
		System.out.println("Merci de faire un choix entre: ");
		System.out.println("[1] - Livre (Livre) ");
		System.out.println("[2] - CD (Compact Disc)");
		System.out.println("[3] - DVD (Digital Versatil Disc) ");
		
		int choix11 = sc.nextInt();
		
		switch(choix11) {
		case 1: addLivre();
			break;
		case 2: addCD();
			break;
		case 3:addDVD();
			break;
		default:
			System.out.println("Saisissez 1,2 ou 3 :");	
			break;
		}
	}
	
	static boolean convert(String s) {
		  if(s=="oui") {return true;}
		  else {return false;}
	}
	public static void addLivre() {
		System.out.println("********** Saisie d'un Livre (Livre) ***********");
   		System.out.println("Pour abandonner la saisie, saisissez un champ");
   		System.out.println("Quel est le libelle");
   		String libelle=sc.nextLine(); 
   		System.out.println("Quel est le titre du Livre ?");
   		String titre=sc.nextLine(); 
   		System.out.println("Qui est l'auteur du Livre ?");
   		String auteur=sc.nextLine();
   		System.out.println("Quel est l'identifiant du Livre ?");
   		String identifiant=sc.nextLine();
   		System.out.println("Veuillez saisir 'oui' ou 'non' ");
   		System.out.println("Le CD est t-il disponible ?");
		boolean disponible=convert(sc.nextLine());
   		System.out.println("Quelle est la date de sortie du Livre?");
   		String dateDeSortie=sc.nextLine();
   		System.out.println("Quelle est la date de retour du Livre?");
   		String dateDeRetour=sc.nextLine(); 
   		mediatheque.addLivre(libelle, auteur, titre, identifiant, disponible, dateDeSortie, dateDeRetour);
   		System.out.println ("La saisie du Livre a bien �t� enregistr�.");
   		accueil();
	}
	public static void addCD() {
		System.out.println("********** Saisie d'un CD (Compact Disc) ***********");
   		System.out.println("Pour abandonner la saisie, saisissez un champ");
   		System.out.println("Quel est le libelle ?");
   		String libelle=sc.nextLine(); 
   		System.out.println("Quel est le titre du CD ?");
   		String titre=sc.nextLine(); 
   		System.out.println("Qui est l'auteur du CD ?");
   		String auteur=sc.nextLine();
   		System.out.println("Quel est l'identifiant du CD ?");
   		String identifiant=sc.nextLine();
   		System.out.println("Veuillez saisir 'oui' ou 'non' ");
   		System.out.println("Le CD est t-il disponible ?");
		boolean disponible=convert(sc.nextLine());
   		System.out.println("Quelle est la date de sortie du CD?");
   		String dateDeSortie=sc.nextLine();
   		System.out.println("Quelle est la date de retour du CD?");
   		String dateDeRetour=sc.nextLine(); 
   		mediatheque.addCD(libelle, auteur, titre, identifiant, disponible, dateDeSortie, dateDeRetour);
   		System.out.println ("La saisie du CD a bien �t� enregistr�.");
   		accueil();
	}
	public static void addDVD() {
		System.out.println("********** Saisie d'un DVD (Digital Video Disc) ***********");
   		System.out.println("Pour abandonner la saisie, saisissez un champ");
   		System.out.println("Quel est le libelle");
   		String libelle=sc.nextLine(); 
   		System.out.println("Quel est le titre du DVD");
   		String titre=sc.nextLine(); 
   		System.out.println("Qui est l'auteur du DVD");
   		String auteur=sc.nextLine();
   		System.out.println("Quel est l'identifiant du DVD");
   		String identifiant=sc.nextLine();
   		System.out.println("Veuillez saisir 'oui' ou 'non' ");
   		System.out.println("Le CD est t-il disponible ?");
		boolean disponible=convert(sc.nextLine());
   		System.out.println("Quelle est la date de sortie du DVD");
   		String dateDeSortie=sc.nextLine();
   		System.out.println("Quelle est la date de retour du DVD");
   		String dateDeRetour=sc.nextLine(); 
   		mediatheque.addDVD(libelle, auteur, titre, identifiant, disponible, dateDeSortie, dateDeRetour);
   		System.out.println ("La saisie du DVD a bien �t� enregistr�.");
   		accueil();
	}
	
}
