package hamsterprogram;

public class Hamster {
	
	private char direction; // <, >, ^, v
	private Position position;
	private int cornEaten;
	
	// Constructor
	public Hamster(char startDirection, Position position) {
		this.direction = startDirection;
		this.position = position;
		this.cornEaten = 0;
	}
	
	// Getters
	public char getDirection() {
		return direction;
	}

	public Position getPosition() {
		return position;
	}

	public int getCornEaten() {
		return cornEaten;
	}
	
	
	// Methods
	public void turnLeft() {
		switch(direction) {
		case '^': 
			direction = '<';
			break;
		case '<':
			direction = 'v';
			break;
		case 'v':
			direction = '>';
			break;
		case '>':
			direction = '^';
			break;
		}
	}
	
	public void turnRight() {
		switch(direction) {
		case '^': 
			direction = '>';
			break;
		case '>':
			direction = 'v';
			break;
		case 'v':
			direction = '<';
			break;
		case '<':
			direction = '^';
			break;
		}
		
	}
	
	public void walkForward(Map map) {
	
		int newX = position.getX();
		int newY = position.getY();

		switch(direction) {
		case '^': 
			newY -= 1;
			break;
		case '<':
			newX -= 1;
			break;
		case 'v':
			newY += 1;
			break;
		case '>':
			newX += 1;
			break;
		}
		
		if (map.grid[newY][newX] == '#') { 			// Wall #
			System.out.println("cant walk – wall");
		} else {									// No Wall
			if (map.grid[newY][newX] == '*') {		// Corn *
				System.out.println("Corn – yummy");
				cornEaten++;
			}
			map.grid[position.getY()][position.getX()] = ' '; // take hamster away
			// put hamster on the grid with new position
			position.setY(newY); 
			position.setX(newX);
			
		} 		
	}
	
	
	
	
}