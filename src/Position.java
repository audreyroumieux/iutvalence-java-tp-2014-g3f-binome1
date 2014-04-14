import java.util.Random;

/**
 * Donne la position des cartes sur la grille
 * @author roumieau
 *
 */
public class Position
{
 /**
  *  2 attributs pour la ligne/colonne
  */
	private final int numeroDeLigne;
	
	private final int numeroDeColonne;

	/**
	 *  un constructeur avec parametre ligne/colonne
	 * @param ligne
	 * @param colonne
	 */
	public Position(final int ligne, final int colonne)
	{
		this.numeroDeLigne=ligne;
		this.numeroDeColonne=colonne;
	}	
	
	/**
	 *  methodes pour obtnir séparement la ligne et la colonne
	 * @return
	 */
	public int obtenirNumeroDeLigne()
	{
		return this.numeroDeLigne;
	}
	public int obtenirNumeroDeColonne()
	{
		return this.numeroDeColonne;
	}
	
}
