package fr.iutvalence.java.memory;

/**
 * Représente une position sur une grille
 * 
 * @author roumieau
 * 
 */
public class Position
{
	/**
	 * Le numéro de ligne
	 */
	private final int numeroDeLigne;

	/**
	 * Le numéro de colonne
	 */
	private final int numeroDeColonne;

	/**
	 * Création d'une nouvelle position
	 * 
	 * @param numeroDeLigne
	 *            le numero de ligne
	 * @param numeroDeColonne
	 *            le numéro de colonne
	 */
	public Position(int numeroDeLigne, int numeroDeColonne)
	{
		this.numeroDeLigne = numeroDeLigne;
		this.numeroDeColonne = numeroDeColonne;
	}

	/**
	 * Obtention du numéro de ligne
	 * 
	 * @return le numéro de ligne
	 */
	public int obtenirNumeroDeLigne()
	{
		return this.numeroDeLigne;
	}

	/**
	 * Obtention du numéro de colonne
	 * 
	 * @return le numéro de colonne
	 */
	public int obtenirNumeroDeColonne()
	{
		return this.numeroDeColonne;
	}

}
