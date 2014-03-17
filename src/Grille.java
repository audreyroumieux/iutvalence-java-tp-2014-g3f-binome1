import java.util.Random;
import java.util.RandomAccess;

/**
 * représente une grille composées de cartes face caché, attendent une
 * instruction d'un des joureurs pour retourner l'une des cartes (Chaque paire
 * de carte a un dessins différents)
 * 
 * @author roumieau
 * 
 */
public class Grille
{
	/**
	 * constante du nombre de ligne par défaut
	 */
	public static final int NOMBRE_DE_LIGNES_PAR_DEFAUT = 3;
	/**
	 * constante du nombre de colone par défaut
	 */
	public static final int NOMBRE_DE_COLONNES_PAR_DEFAUT = 4;

	/**
	 * nombre de ligne de la grille
	 */
	private final int nombreDeLignes;
	/**
	 * nombre de colone de la grille
	 */
	private final int nombreDeColonnes;

	/**
	 * valeur de nombre de cartes posees sur la grille lors de sa création
	 */
	private int nombreDeCartesPosees;

	/**
	 * tableau représentent la grille
	 */
	private Carte[][] grilleDeCartes;

	/**
	 * crée un jeu de 6 paires de cartes par defaut
	 */
	public Grille()
	{
		this.nombreDeLignes = NOMBRE_DE_LIGNES_PAR_DEFAUT;
		this.nombreDeColonnes = NOMBRE_DE_COLONNES_PAR_DEFAUT;
		
		this.nombreDeCartesPosees = 0;
		this.grilleDeCartes = new Carte[this.nombreDeLignes][this.nombreDeColonnes];
		placerCartes();
		melangerCartes();
	}


	// TODO compléter le commentaire
	/**
	 * crée une grille en fonction du nombre de lignes et de colones
	 * @return
	 */
	public Grille(int nombreDeLignes, int nombreDeColonnes)
	{
		this.nombreDeLignes = nombreDeLignes;
		this.nombreDeColonnes = nombreDeColonnes;
		
		this.nombreDeCartesPosees = 0;
		this.grilleDeCartes = new Carte[this.nombreDeLignes][this.nombreDeColonnes];
		placerCartes();
		melangerCartes();
	}
	
	/**
	 * place une carte sur la grille qui lui corespond
	 */
	private void placerCartes()
	{
		for (int nombreDeLigne = 0; nombreDeLigne <this.nombreDeLignes; nombreDeLigne++)
		{
			for (int nombreDeColonne = 0; nombreDeColonne < nombreDeColonne; nombreDeColonne++)
			{
				this.grilleDeCartes[nombreDeLigne][nombreDeColonne] = new Carte(this.nombreDeCartesPosees / 2);
				this.nombreDeCartesPosees = this.nombreDeCartesPosees + 1;
			}
		}
	}
	/**
	 * permutation N fois de deux carte pur melanger les cartes qui posé sur la grille
	 * N correspond au nombre total de permutation
	 */
	private void melangerCartes()
	{
		// TODO Auto-generated method stub

		 int nombreDePermutationsAEffectuer = this.nombreDeLignes * this.nombreDeColonnes;
		 int numeroDeLigneSource;
		 int numeroDeColonneSource;
		 int numeroDeLigneDestination;
		 int numeroDeColonneDestination;

		 Carte carteAEchanger;
		 
		for(int permutation = 0; permutation < nombreDePermutationsAEffectuer; permutation++ )
		{
			numeroDeLigneSource = 0 + (int)(Math.random()*this.nombreDeLignes);
			numeroDeColonneSource =  0 + (int)(Math.random()*this.nombreDeColonnes);
			numeroDeLigneDestination =  0 + (int) (Math.random()*this.nombreDeLignes);
			numeroDeColonneDestination = 0 + (int) (Math.random()*this.nombreDeColonnes);
			
			carteAEchanger = this.grilleDeCartes[numeroDeLigneSource][numeroDeColonneSource];
			this.grilleDeCartes[numeroDeLigneSource][numeroDeColonneSource] = this.grilleDeCartes[numeroDeLigneDestination][numeroDeColonneDestination];
			this.grilleDeCartes[numeroDeLigneDestination][numeroDeColonneDestination] = carteAEchanger;
		}
	}

	
}
