package fr.iutvalence.java.memory;
/**
 * représente une carte
 * @author roumieau
 *
 */
public class Carte
{
	/**
	 *le numero de chaque carte ne doit pas pouvoir etre changé
	 */
	private final int numero;

	/**
	 * crée une carte que l'on peut identifier grace à un numero
	 * @param numero le numéro de la carte
	 */
	public Carte (int numero)
	{
		this.numero = numero;
	}
	
	/**
	 * fonction pour obtenir le numero de la carte
	 * @return le numero de la carte
	 */
	public int obtenirNumero()
	{
		return this.numero;
	}


}
