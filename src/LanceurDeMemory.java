// TODO écrire le commentaire
/**
 * lance une partie de jeu Memory.
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

		Memory partieDeMemory = new Memory();
		
		System.out.println("Demarrage de la partie");
		partieDeMemory.jouer();
		System.out.println("Fin de la partie");
	}
}

