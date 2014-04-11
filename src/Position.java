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
	private final int ligne;
	private final int colonne;

	/**
	 * attributs pour
	 */
		private int minColonne;
		private int minLigne;
		private int maxLignes;
		private int maxolonne;
	
	// un constructeur avec parametre ligne/colonne
	public Position(int ligne, int colonne)
	{
		this.ligne=ligne;
		this.colonne=colonne;
	}
	
	// un constructeur qui prend en parametre minLigne, maxLigne, minColonne, maxColonne -> alea retourner carte
	public Position(int minLigne, int minColonne,int maxLigne, int maxColonne)
	{
		Random generateurNombresAleatoire = new Random();
		int numeroDeLigne;
		int numeroDeColonne;
		
		for (int ligne=0 ; (minLigne <= ligne) && (ligne <= maxLigne); ligne++)
			for(int colonne=0; (minColonne <= colonne) && (colonne <= maxColonne); colonne++)
			{
				numeroDeLigne=generateurNombresAleatoire.nextInt(this.ligne);
				numeroDeColonne=generateurNombresAleatoire.nextInt(this.colonne);
			}
		this.Position(numeroDeLigne, numeroDeColonne);
	}
	
	// methodes pour obtnir séparement la ligne et la colonne
	public int obtenirLigne()
	{
		return this.ligne;
	}
	public int obtenirColonne()
	{
		return this.colonne;
	}
	
}
