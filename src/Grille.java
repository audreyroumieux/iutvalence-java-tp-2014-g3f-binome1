import java.util.Random;
import java.util.RandomAccess;

/**
 * représente une grille composées de cartes face caché, attendent une
 * instruction d'un des joureurs pour retourner l'une des cartes (Chaque paire
 * de carte a un dessins différents)
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
		
		this.placerCartes();
		this.melangerCartes();
	}

	/**
	 * crée une grille en fonction du nombre de lignes et de colones choisi par le joueur
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
		for (int numeroDeLigne = 0; numeroDeLigne <this.nombreDeLignes; numeroDeLigne++)
		{
			for (int numeroDeColonne = 0; numeroDeColonne < this.nombreDeColonnes; numeroDeColonne++)
			{
				this.grilleDeCartes[numeroDeLigne][numeroDeColonne] = new Carte(this.nombreDeCartesPosees / 2);
				this.nombreDeCartesPosees = this.nombreDeCartesPosees + 1;
			}
		}
	}
	/**
	 * permutation N fois de deux carte pour melanger les cartes qui sont posé sur la grille
	 * N correspond au nombre total de permutation
	 */
	private void melangerCartes()
	{
		// TODO Auto-generated method stub
		 Random generateurDeNombresAleatoires = new Random();
		 
		 int nombreDePermutationsAEffectuer = this.nombreDeLignes * this.nombreDeColonnes;
		 int numeroDeLigneSource;
		 int numeroDeColonneSource;
		 int numeroDeLigneDestination;
		 int numeroDeColonneDestination;

		 Carte carteAEchanger;
		 
		for(int permutation = 0; permutation < nombreDePermutationsAEffectuer; permutation++ )
		{
			/*
			 * on fait un rendome (prend une valeur au hazard) entre 0 et le nob de ligne ou de colone (8) que l'on a
			 */
			numeroDeLigneSource = generateurDeNombresAleatoires.nextInt(this.nombreDeLignes);
			numeroDeColonneSource = generateurDeNombresAleatoires.nextInt(this.nombreDeColonnes);
			numeroDeLigneDestination = generateurDeNombresAleatoires.nextInt(this.nombreDeLignes);
			numeroDeColonneDestination = generateurDeNombresAleatoires.nextInt(this.nombreDeColonnes);
			
			carteAEchanger = this.grilleDeCartes[numeroDeLigneSource][numeroDeColonneSource];
			this.grilleDeCartes[numeroDeLigneSource][numeroDeColonneSource] = this.grilleDeCartes[numeroDeLigneDestination][numeroDeColonneDestination];
			this.grilleDeCartes[numeroDeLigneDestination][numeroDeColonneDestination] = carteAEchanger;
		}
	}

	public String toString()
	{
		String MemoryAsciiArt = "------------------------------------------------\n";
		for (int numeroDeLigne = 0; numeroDeLigne <nombreDeLignes; numeroDeLigne++)
		{
			for (int numeroDeColonne = 0; numeroDeColonne < nombreDeColonnes; numeroDeColonne++)
			{
				if (this.grilleDeCartes[numeroDeLigne][numeroDeColonne] != null)
					MemoryAsciiArt += "x";
				else
					MemoryAsciiArt += "_";
			}
			MemoryAsciiArt +="\n";
		}
		 MemoryAsciiArt += "\n------------------------------------------------\n";
		return MemoryAsciiArt;
	}
		
}
