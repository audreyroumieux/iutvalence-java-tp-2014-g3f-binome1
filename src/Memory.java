// TODO déplacer la classe dans un paquetage
public class Memory
{
	// TODO écrire le commentaire de manière plus concise et à la fois plus
	// précise
	/**
	 * grille est un ensemble de paires de cartes face cacher disposer
	 * alléatoirement. Chaque paire de carte a un dessins différents
	 */
	private Grille grille;

	// TODO écrire le commentaire de manière plus concise et à la fois plus
	// précise
	/**
	 * joueur1 est le premier joueur a désigner deux cartes si les deux cartes
	 * ont le même dessins, le joueur1 peut recomencer, sinon il s'arrete
	 */
	private Joueur joueur1;

	// TODO écrire le commentaire de manière plus concise et à la fois plus
	// précise
	/**
	 * joueur2 peut désigner deux cartes après que le joueur1 se soit arreter
	 */
	private Joueur joueur2;

	// TODO écrire le commentaire de manière plus précise
	/**
	 * une partie de memory est composé d'une grille et est jouer par deux
	 * joueurs
	 */
	public Memory()
	{
		this.grille = new Grille();
		this.joueur1 = new Joueur();
		this.joueur2 = new Joueur();
	}

	// TODO écrire le commentaire de manière plus précise
	/**
	 * méthode pour jouer au Memory
	 */
	public void jouer()
	{

	}

}
