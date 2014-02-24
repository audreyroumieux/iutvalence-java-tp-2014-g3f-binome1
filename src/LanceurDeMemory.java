// TODO écrire le commentaire
public class LanceurDeMemory
{
	// TODO compléter le commentaire
/**
 * 
 * @param args
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

