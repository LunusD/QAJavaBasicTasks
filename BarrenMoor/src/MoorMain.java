import java.util.Scanner;

public class MoorMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int menuChoice = 0;
		MoorManager moorMan = new MoorManager();
		moorMan.startGame();
		Person player = (Person) moorMan.moorCreatures.get(0);
		System.out.println("Welcome to Barren Moor.");

		while (menuChoice != 4) {
			System.out.println("What would you like to do?");
			System.out.println("1. Move");
			System.out.println("2. Look");
			System.out.println("3. Show Inventory");
			System.out.println("4. Quit");
			menuChoice = sc.nextInt();

			switch (menuChoice) {
			case 1:
				System.out.println("Please enter the direction you would like to move (North, East, South, West)");
				String moveDirection = sc.next();
				System.out.println("How many meters would you like to walk?");
				int moveValue = sc.nextInt();
				moorMan.move(moveDirection, moveValue);
				break;
			case 2:
				moorMan.look();
				break;
			case 3:
				for (int i = 0; i < player.getInventory().size(); i++) {
					System.out.println(player.getInventory().get(i).toString());
				}
				break;
			case 4:
				System.out.println("Better luck next time");
				break;
			default:
				System.out.println("That is not a valid input.");
				break;
			}

			if (!player.isAlive()) {
				System.out.println("The enemies of this world were too much for you. You succumb to your wounds and die in the moor,"
						+ " your body providing sustenance to the surrounding wildlife.");
				break;
			}
			
			for(int i = 0; i < player.getInventory().size(); i++) {
				if(player.getInventory().get(i).getType() == "Treasure") {
					System.out.println("Congratulations! You have braved the moor and found the lost treasure. You return to the world"
							+ " a richer man, but something sinister remains inside you.");
					menuChoice = 4;
				}
			}
		}
		
		sc.close();
	}

}
