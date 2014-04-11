import java.util.Random;

// TODO déplacer la classe dans un paquetage
// TODO écrire un commentaire
public class Memory
{
	/**
	 * ensemble de paires de cartes disposé face caché alléatoirement devant les joueur 
	 */
	private Grille grille;

	/**
	 * Premier joueur
	 */
	private Joueur joueur1;

	/**
	 * 2ème joueur
	 */
	private Joueur joueur2;

	/** Initialisation:
	 * Les joueurs sont présent pour débuter la partie
	 * la grille où sont disposés les cartes est initialiser (les cartes sont face caché)
	 */
	public Memory(int lignes, int colonnes)
	{
		this.grille = new Grille(lignes, colonnes);
		this.joueur1 = new Joueur();
		this.joueur2 = new Joueur();
	}

	public void jouer()
	{
		// TODO Auto-generated method stub
		System.out.println(this.grille);
		
		private boolean gagner = false;
		
		while (gagner =! true)
		{
			if('click')
			Grille	retournerCarteAleatoirement = new retournerCarteAleatoirement();
			else
				retournerCarte();
			this.fin();
		}
		
	}
	
	public void fin()
	{
		
	}
	
}
