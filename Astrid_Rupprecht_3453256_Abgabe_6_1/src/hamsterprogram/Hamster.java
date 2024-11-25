package hamsterprogram;

public class Hamster {
	
	private String direction; // <, >, ^, v
	private Position position;
	private int cornEaten;
	
	// Constructor
	public Hamster(String startDirection, Position position) {
		this.direction = startDirection;
		this.position = position;
		this.cornEaten = 0;
	}
	
	// Methods
	public void turnLeft() {
		switch(direction) {
		case "^": 
			direction = "<";
			break;
		case "<":
			direction = "v";
			break;
		case "v":
			direction = ">";
			break;
		case ">":
			direction = "^";
			break;
		}
	}
	
	public void turnRight() {
		switch(direction) {
		case "^": 
			direction = ">";
			break;
		case ">":
			direction = "v";
			break;
		case "v":
			direction = "<";
			break;
		case "<":
			direction = "^";
			break;
		}
		
	}
	
	public void walkForward() {
		// if direction is ...
		// position will change to..
		switch(direction) {
		case "^": 
			position.step(0, 1);
			break;
		case "<":
			position.step(-1, 0);
			break;
		case "v":
			position.step(0, -1);
			break;
		case ">":
			position.step(0, 1);
			break;
		
		}
			
	}

	public void eatCorn(Position position) {
		int x = position.getX();
		int y = position.getY();
	}
	

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
	
	
	
	
}
