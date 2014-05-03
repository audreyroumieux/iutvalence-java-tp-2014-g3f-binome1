package fr.iutvalence.java.memory;

/**
 * lance une partie de jeu Memory
 * @author roumieau
 *
 */
public class LanceurDeMemory
{
/**
 * Point d'entrée de l'application
 * @param args les arguments de la ligne de commande (aucun ici)
 * 
 * demande le nombre de carte pour jouer
 */
	public static void main(String[] args)
	{
		System.out.println("Creation d'une partie de Memory");
		Memory memory = new Memory(3,4);
		System.out.println("Début de la partie de Memory");
		memory.jouer();
		System.out.println("fin de la partie de Memory");
	}
}

