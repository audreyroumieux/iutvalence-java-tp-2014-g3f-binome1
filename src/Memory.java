// TODO déplacer la classe dans un paquetage
public class Memory
{
	// TODO écrire le commentaire de manière plus concise et à la fois plus
	// précise
	/**
	 * ensemble de paires de cartes disposé face caché alléatoirement devant les joueur. 
	 */
	private Grille grille;

	// TODO écrire le commentaire de manière plus concise et à la fois plus
	// précise
	/**
	 * Premier joueur
	 */
	private Joueur joueur1;

	// TODO écrire le commentaire de manière plus concise et à la fois plus
	// précise
	/**
	 * 2ème joueur
	 */
	private Joueur joueur2;

	// TODO écrire le commentaire de manière plus précise
	/** Initialisation:
	 * Les joueurs sont présent pour débuter la partie
	 * la grille où sont disposés les cartes est initialiser (les cartes sont face caché)
	 */
	public Memory()
	{
		this.grille = new Grille();
		this.joueur1 = new Joueur();
		this.joueur2 = new Joueur();
	}

	// TODO écrire le commentaire de manière plus précise
	/**
	 * demare le jeu memory et se termine lors qu'il n'y a plus de carte face caché
	 */
	public void jouer()
	{

	}

}
