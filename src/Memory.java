// TODO déplacer la classe dans un paquetage
public class Memory
{
	// TODO 
	/**
	 * ensemble de paires de cartes disposé face caché alléatoirement devant les joueur 
	 */
	private Grille grille;

	// TODO
	/**
	 * Premier joueur
	 */
	private Joueur joueur1;

	// TODO
	/**
	 * 2ème joueur
	 */
	private Joueur joueur2;

	// TODO
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

}
