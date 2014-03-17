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
	// TODO écrire un commentaire
	public static final int NOMBRE_DE_LIGNES_PAR_DEFAUT = 3;

	// TODO écrire un commentaire
	public static final int NOMBRE_DE_COLONNES_PAR_DEFAUT = 4;
	
	// TODO écrire un commentaire
	public static final int NOMBRE_DE_PAIRE_DE_CARTES = 6;

	// TODO écrire un commentaire
	private final int nombreDeLignes;
	
	// TODO écrire un commentaire
	private final int nombreDeColonnes;
	
	// TODO écrire un commentaire
	private final int nombrePaireDeCarte;
	
	// TODO écrire un commentaire
	// TODO initialiser l'attribut dans le constructeur
	private final int nombreDeCartePosee =0;
	
	// TODO écrire un commentaire
	private Carte[][] grilleDeCartes;
	
	/**
	 * crée un jeu de 6 paires de cartes par defaut
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
	
	// TODO compléter le commentaire
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
	 * récupère le nombre de lignes et de collones de cartes maximal pour se rapprocher d'une disposition des cartes en forme de carré
	 * @return
	 */
	// TODO attention : le type de retour n'est pas compatible avec ce qui est renvoyé
	public int getNombreLigneEtColonneDeCartes()
	{
		return ("il y a",this.nombreDeLignes, "de ligne et il y a", this.nombreDeColonnes , "colonnes");
	}
}
