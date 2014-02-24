// TODO écrire le commentaire
/**
 * représente une grille composées de cartes face caché,
 * attendent une instruction d'un des joureurs pour retourner l'une des cartes
 * (Chaque paire de carte a un dessins différents)
 * @author roumieau
 *
 */
public class Grille
{
	public final int NombrePaireDeCartes = n ;
	
	/**
	 * crée un jeu de 6 paires de cartes par defaux
	 */
	public Grille()
	{
		final int NombreDeLigneGrille=3;
		final int NombreDeColloneGrille=3;
		
		this.Grille = new Carte [NombreDeColloneGrille][NombreDeLigneGrille];
		
		for(int ValeurAxeY=0; ValeurAxeY<NombreDeLigneGrille; ValeurAxeY++)
		{ 
			for(int ValeurAxeX=0; ValeurAxeX<NombreDeColloneGrille; ValeurAxeX++)
			{
				this
			}
		}
		
	}
	
	/**
	 * crée un jeux de cartes en fonction du nombre de paire de cartes demandé
	 * @return
	 */
	public Grille(int NombrePaireDeCartes)
	{
		
		final int NombreDeColloneGrille=?;
		final int NombreDeLigneGrille=?;
		
		this.Grille = new Carte [NombreDeLigneGrille][NombreDeColloneGrille];

		for(int ValeurAxeY=0; ValeurAxeY<NombreDeLigneGrille; ValeurAxeY++)
		{ 
			for(int ValeurAxeX=0; ValeurAxeX<NombreDeColloneGrille; ValeurAxeX++)
			{
				
			}
		}
	}
	/**
	 * récupaire le nombre n de paire de cartes
	 * @return
	 */
	public int getNombrePaireDeCartes()
	{
		return this.n ;
	}
}
