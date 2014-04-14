import java.util.Random;

// TODO déplacer la classe dans un paquetage
// TODO écrire un commentaire
public class Memory
{
	public final static int NOMBRE_DE_JOUEURS = 2;
	/**
	 * ensemble de paires de cartes disposé face caché alléatoirement devant les joueur 
	 */
	private Grille grille;

	/**
	 * Les joueurs
	 */
	private Joueur[] joueurs;

	
	/** Initialisation:
	 * Les joueurs sont présent pour débuter la partie
	 * la grille où sont disposés les cartes est initialiser (les cartes sont face caché)
	 */
	public Memory(int nombreDeLignes, int nombreDeColonnes)
	{
		this.grille = new Grille(nombreDeLignes, nombreDeColonnes);
		this.joueurs = new Joueur[NOMBRE_DE_JOUEURS];
		this.joueurs[0] = new Joueur(nombreDeLignes, nombreDeColonnes);
		this.joueurs[1] =  new Joueur(nombreDeLignes, nombreDeColonnes);
	}
/** Jouer:
 * La grille avec les cartes s'affiche permetant au premier joueur de donner une position de carte a retourner
 * On verifie si la position donner est possible (ne sort pas de la grille de carte)
 * puis le joueur donne une deuxieme position de carte, que l'on verifiera egalement.
 * 
 */
	public void jouer()
	{
		System.out.println(this.grille);
		int numeroDuJoueur = 0;
		// boucle infinie
		while (true)
		{
			Position[] positionsDesCartesAretourner = this.joueurs[numeroDuJoueur].demanderPositionsDesCartesARetourner();
			boolean possible = this.grille.retournerCartes(positionsDesCartesAretourner);
		}
		
	}
	
}
