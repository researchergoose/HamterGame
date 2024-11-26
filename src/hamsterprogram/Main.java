package hamsterprogram;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Game initialize
		Map firsthamtergame = new Map();
		Scanner sc = new Scanner(System.in);
		
		boolean game = true;
		while (game == true) {
			// Map
			firsthamtergame.displayMap();
			
			// Welcome messages
			System.out.println("Welcome to HAMTER: \nThe Eternal Suffering of Sisyphus the Hamster");
			System.out.println("Enter commands:\n"
					+ "'l':turn left 'r':turn right 'c':corn eaten 'q':quit game");
			
			// User commands
			char command = sc.next().charAt(0);
			
			switch (command) {
			case 'l':
				firsthamtergame.getHamster().turnLeft();
				break;
				
			case 'r':
				firsthamtergame.getHamster().turnRight();
				break;
				
			case 'c':
				System.out.println("Corn Eaten:" + firsthamtergame.getHamster().getCornEaten());
				break;
				
			case 'f':				
				firsthamtergame.getHamster().walkForward(firsthamtergame);
				break;
				
			// user ends game
			case 'q':
				System.out.println("Game Over – User invoked");
				game = false;
				break;
			}
		}
		
		// The End
	    /*System.out.println("Game Over!\n"
	    		+ "At least for you (Sisyphus is still trapped inside the maze... waiting to be put out of his misery\n"
	    		+ "Corn eaten: " + getCornEaten());*/
	    sc.close();
	}

}
