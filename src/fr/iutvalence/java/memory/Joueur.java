package fr.iutvalence.java.memory;
import java.util.Random;

/**
 * représente un joueur
 */
public class Joueur
{
	private final int nombreDeLignes;

	private final int nombreDeColonnes;

	/**
	 * un joueur doit donner un numero de ligne et un numero de colonne pour designer une carte 
	 * @param nombreDeLignes
	 * @param nombreDeColonnes
	 */
	public Joueur(int nombreDeLignes, int nombreDeColonnes)
	{
		this.nombreDeLignes = nombreDeLignes;
		this.nombreDeColonnes = nombreDeColonnes;
	}
/**
 * crer deux positions de carte a retourner
 * @return
 */
	public Position[] demanderPositionsDesCartesARetourner() 
	{
		Position[] positions = new Position[2];
		positions[0] = this.positionAleatoire();
		positions[1] = this.positionAleatoire();
		return positions;
	}
	/**
	 * donne une position (un numero de ligne et de colonne) alléatoirement 
	 * @return
	 */
	private Position positionAleatoire()
	{
		Random generateurNombresAleatoire = new Random();
		
		int numeroDeLigne = generateurNombresAleatoire.nextInt(this.nombreDeLignes);
		int numeroDeColonne = generateurNombresAleatoire.nextInt(this.nombreDeColonnes);
		
		return new Position(numeroDeLigne, numeroDeColonne);
	}
}
