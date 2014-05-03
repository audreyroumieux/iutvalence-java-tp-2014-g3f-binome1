package fr.iutvalence.java.memory;
import java.util.Random;

/**
 * représente une grille de cartes 
 * @author roumieau
 * 
 */
public class Grille
{
	/**
	 * Nombre de lignes par défaut
	 */
	public static final int NOMBRE_DE_LIGNES_PAR_DEFAUT = 3;
	/**
	 * Nombre de colonnes par défaut
	 */
	public static final int NOMBRE_DE_COLONNES_PAR_DEFAUT = 4;
	
	/**
	 * nombre de lignes
	 */
	private final int nombreDeLignes;
	/**
	 * nombre de colonnes
	 */
	private final int nombreDeColonnes;

	/**
	 * Nombre de cartes posees sur la grille
	 */
	private int nombreDeCartesPosees;

	/**
	 * les cartes
	 */
	private Carte[][] grilleDeCartes;

	/**
	 * Création d'une grille de taille par défaut, avec des cartes placées aléatoirement
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
	 * Création d'une grille de taille donnée, avec des cartes placées aléatoirement
	 * @param nombreDeLignes le nombre de lignes
	 * @param nombreDeColonnes le nombre de colonnes
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
	 * Placer les cartes (dans l'ordre) sur la grille
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
	 * Mélanger (par permutation) les cartes 
	 */
	private void melangerCartes()
	{
		 Random generateurDeNombresAleatoires = new Random();
		 
		 int nombreDePermutationsAEffectuer = this.nombreDeLignes * this.nombreDeColonnes;

		 Carte carteAEchanger;
		 
		for(int permutation = 0; permutation < nombreDePermutationsAEffectuer; permutation++ )
		{
			/*
			 * on fait un rendome (prend une valeur au hazard) entre 0 et le nob de ligne ou de colone (8) que l'on a
			 */
			int numeroDeLigneSource = generateurDeNombresAleatoires.nextInt(this.nombreDeLignes);
			int numeroDeColonneSource = generateurDeNombresAleatoires.nextInt(this.nombreDeColonnes);
			int numeroDeLigneDestination = generateurDeNombresAleatoires.nextInt(this.nombreDeLignes);
			int numeroDeColonneDestination = generateurDeNombresAleatoires.nextInt(this.nombreDeColonnes);
			
			carteAEchanger = this.grilleDeCartes[numeroDeLigneSource][numeroDeColonneSource];
			this.grilleDeCartes[numeroDeLigneSource][numeroDeColonneSource] = this.grilleDeCartes[numeroDeLigneDestination][numeroDeColonneDestination];
			this.grilleDeCartes[numeroDeLigneDestination][numeroDeColonneDestination] = carteAEchanger;
		}
	}  
	
	/**
	 * retourne une carte en fonction de sa position
	 * @param positions
	 */
	public void retournerCartes(Position[] positions)
	{
		int numero1, numero2;
		
		int numeroDeLigneCarte1 = positions[0];
		int numeroDeColonneCarte1 = positions[0];
		int numeroDeLigneCarte2 = positions[1];
		int numeroDeColonneCarte2 = positions[1];
		
		numero1 = this.grilleDeCartes[numeroDeLigneCarte1][numeroDeColonneCarte1].obtenirNumero();
		numero2 = this.grilleDeCartes[numeroDeLigneCarte2][numeroDeColonneCarte2].obtenirNumero();
		
		if (numero1 == numero2)
		{
			this.grilleDeCartes[numeroDeLigneCarte1][numeroDeColonneCarte1]=null;
			this.grilleDeCartes[numeroDeLigneCarte2][numeroDeColonneCarte2]=null;
		}
	}
	
/**
 * affichage des cartes font on a pas trouver la paire par un "x", sinon par un "_"
 */
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
