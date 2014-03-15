import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// TODO écrire le commentaire
/**
 * lance une partie de jeu Memory
 * @author roumieau
 *
 */
public class LanceurDeMemory
{
	// TODO compléter le commentaire
/**
 * Point d'entrée de l'application
 * @param args les arguments de la ligne de commande (aucun ici)
 */
	public static void main(String[] args)
	{
		System.out.println("creation d'une partie de Memory");

		int nombreDeCartes = DemanderNombreCarte();
		System.out.println(nombreDeCartes);
		List<Carte> PacketCartes = CreerJeuDeCarte(nombreDeCartes);
		for (int j=0; j < PacketCartes.size(); j++)
		{
			Carte C = PacketCartes.get(j);
			System.out.println(C.obtenirNumero());
		}
		List<Carte> PacketCartesMelange = MelangerPaquerCartes(PacketCartes);
		Grille grille = new Grille(PacketCartesMelange, 3,4);
		
	}
	/**
	 * Demande le nombre de Carte pour jouer au joueur 
	 * @return nombre de carte
	 */
	private static int DemanderNombreCarte()
	{
		System.out.println("Avec combien de cartes voulez-vous jouer?");
		Scanner ScanerNombreCartes = new Scanner(System.in);
		return ScanerNombreCartes.nextInt();
	}
	
	/**
	 * créer une liste de carte grace au nombre de carte demander précédament
	 * @param nombreDeCarte
	 * @return liste de carte
	 */
	private static List<Carte> CreerJeuDeCarte(int nombreDeCarte)
	{
		List<Carte> JeuDeCarte = new ArrayList<Carte>();
		for (int i=0; i<nombreDeCarte; i++)
		{
			JeuDeCarte.add(new Carte(i));
			JeuDeCarte.add(new Carte(i));
		}
		return JeuDeCarte;
	}
	
	/**
	 * Mélange les cartes du packet de cartes
	 * @param packetCartes
	 * @return packet de cartes mélangé
	 */
	private static List<Carte> MelangerPaquerCartes(List<Carte> packetCartes)
	{
		return packetCartes;
	}
	
}

