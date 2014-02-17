
public class LanceurDeMemory
{
/**
 * 
 * @param args
 */
	public static void main(String[] args)
	{
		System.out.println("creation d'une partie de Memorie");

		Memory partiedeMemory = new Memory();
		
		System.out.println("Demarage de la partie");
		partiedeMemory.jouer();
		System.out.println("Fin de la partie");
	}
}

