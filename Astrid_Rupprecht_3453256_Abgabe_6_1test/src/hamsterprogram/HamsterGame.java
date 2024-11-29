package hamsterprogram;

import java.util.Scanner;

public class HamsterGame {
    private Map map;
    private Scanner sc;
    private char command;

    public HamsterGame() {
        this.map = new Map();
        this.sc = new Scanner(System.in);
    }
    
    public void start() {
    	boolean playAgain = true;
    	
    	while (playAgain) {
    		this.map = new Map();
    		boolean game = true;	
    		
    		// Welcome messages
            System.out.println("Welcome to HAMTER:\n"
            		+ "The Eternal Suffering of Sisyphus the Hamster");
            
            while (game == true) {
    			// Map
    			map.displayMap();
    			
    			
    			// Game Controls overview
    			System.out.println("Enter commands:\n"
    					+ "'l':turn left 'r':turn right 'f':walk forward 'c':corn eaten 'q':quit game");
    			
    			// User commands
    			command = sc.next().charAt(0);
    			switch (command) {
    			case 'l':
    				map.getHamster().turnLeft();
    				break;
    				
    			case 'r':
    				map.getHamster().turnRight();
    				break;
    				
    			case 'c':
    				System.out.println("Corn Eaten:" + map.getHamster().getCornEaten());
    				break;
    				
    			case 'f':				
    				map.getHamster().walkForward(map);
    				// if all corn is collected user WINS
    				if (map.getHamster().getCornEaten() == map.getTotalCorn()) {
                        System.out.println("Congratulations! You collected all the corn. The game is over!...\n"
                        		+ "At least for you\n"
                        		+ "(Sisyphus is still trapped inside the maze... waiting to be put out of his misery\n"
                        		+ "Corn eaten: " + map.getHamster().getCornEaten());
                        game = false;
                    }
    				break;
    				
    			// User ends game
    			case 'q':
    				System.out.println("Game Over – User invoked");
    				game = false;
    				break;
    				
    			default:
                    System.out.println("Invalid command!");
    			}
    		} 
            
            // End messages
            System.out.println("Thank you for playing\n"
            		+ "HAMTER:"
            		+ "\nThe Eternal Suffering of Sisyphus the Hamster");
            System.out.println("Would you like to play again or read a backstory of Sisyphus the Hamster?\n"
                    + "'p': play again\n's': read story\n'q': quit");
            
            char restartCommand = sc.next().charAt(0);
            switch (restartCommand) {
                case 'p':
                    // back to outer loop to restart game
                    break;

                case 's': // display story and exit game
                    System.out.println(">be me\n"
                    		+ ">small fluffy hamster, best life\n"
                    		+ ">spend days in The Cage™\n"
                    		+ ">the same endless grid, four walls, no escape\n"
                    		+ ">must. collect. corn."
                    		+ ">human controls me \"turn left. no – right!\"\n"
                    		+ ">load cheeks to max capacity,victory *squeak*\n"
                    		+ ">but wait...\n"
                    		+ ">game.start();"
                    		+ ">back in The Cage™\n"
                    		+ ">eternal grind begins again\n"
                    		+ ">repeat for hours endlessly\n"
                    		+ ">no escape just eternal suffering\n"
                    		+ ">help me anon");
                    playAgain = false; 
                    break;

                case 'q': // quit
                    System.out.println("Quitting");
                    playAgain = false;
                    break;

                default:
                    System.out.println("Invalid command – bye.");
                    playAgain = false;
            }
    	}
        
		sc.close(); 
    }
	    
}
