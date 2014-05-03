package fr.iutvalence.java.memory;

/**
 * Représente une partie de Memory
 * 
 */
public class Memory
{
	public final static int NOMBRE_DE_JOUEURS = 2;

	/**
	 * Grille de cartes
	 */
	private Grille grille;

	/**
	 * Les joueurs
	 */
	private Joueur[] joueurs;

	/**
	 * Création d'une nouvelle partie de Memory.
	 * 
	 * @param nombreDeLignes
	 *            le nombre de ligne de la grille
	 * @param nombreDeColonnes
	 *            le nombre de colonnes de la grille
	 */
	public Memory(int nombreDeLignes, int nombreDeColonnes)
	{
		this.grille = new Grille(nombreDeLignes, nombreDeColonnes);
		this.joueurs = new Joueur[NOMBRE_DE_JOUEURS];
		this.joueurs[0] = new Joueur(nombreDeLignes, nombreDeColonnes);
		this.joueurs[1] = new Joueur(nombreDeLignes, nombreDeColonnes);
	}

	/**
	 * Jouer la partie
	 * 
	 */
	public void jouer()
	{
		System.out.println(this.grille);
		int numeroDuJoueur = 0;
		// boucle infinie
		while (true)
		{
			Position[] positionsDesCartesAretourner = this.joueurs[numeroDuJoueur]
					.demanderPositionsDesCartesARetourner();
			boolean possible = this.grille
					.retournerCartes(positionsDesCartesAretourner);
		}

	}

}
