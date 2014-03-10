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
	public static final int NOMBRE_DE_LIGNES_PAR_DEFAUT = 3;
	public static final int NOMBRE_DE_COLONNES_PAR_DEFAUT = 4;
	public static final int NOMBRE_DE_PAIRE_DE_CARTES = 6;

	private final int nombreDeLignes;
	private final int nombreDeColonnes;
	private final int nombrePaireDeCarte;
	
	private final int nombreDeCartePosee =0;
	
	private Carte[][] grilleDeCartes;
	
	/**
	 * crée un jeu de 6 paires de cartes par defaux
	 */
	public Grille()
	{
		this.nombreDeLignes = NOMBRE_DE_LIGNES_PAR_DEFAUT;
		this.nombreDeColonnes = NOMBRE_DE_COLONNES_PAR_DEFAUT;
		this.nombrePaireDeCarte = NOMBRE_DE_PAIRE_DE_CARTES;
		
		this.grilleDeCartes = new Carte [this.nombreDeLignes][this.nombreDeColonnes];
		
		this.creerCartes();
			for(int nombreDeLigne=0; nombreDeLigne < NOMBRE_DE_LIGNES_PAR_DEFAUT; nombreDeLigne++)
		{ 
			for(int nombreDeColonne=0; nombreDeColonne <NOMBRE_DE_COLONNES_PAR_DEFAUT; nombreDeColonne++)
			{
				if ( nombrePaireDeCarte)
				{
					this.Carte[nombreDeLigne][nombreDeColonne] = new Carte();
					nombreDeCartePosee = nombreDeCartePosee + 1;
				}
			}
		}					
		this.melangerCartes();
	

	}
	
	
	/**
	 * crée un jeux de cartes en fonction du nombre de paire de cartes demandé
	 * @return
	 */
	public Grille (int nombreDeLignes, int nombreDeColonnes)
	{
		
		this.grilleDeCartes = new Carte [this.nombreDeLignes][this.nombreDeColonnes];
		
		for(int nombreDeLigne=0; nombreDeLigne < NOMBRE_DE_LIGNES_PAR_DEFAUT; nombreDeLigne++)
		{ 
			for(int nombreDeColonne=0; nombreDeColonne <NOMBRE_DE_COLONNES_PAR_DEFAUT; nombreDeColonne++)
			{
			}
		}
	}
	/**
	 * récupaire le nombre de lignes et de collones de cartes maximal pour se rapprocher d'une disposition des cartes en forme de carré
	 * @return
	 */
	public int getNombreLigneEtColonneDeCartes()
	{
		return ("il y a",this.nombreDeLignes, "de ligne et il y a", this.nombreDeColonnes , "colonnes");
	}
}
