package hamsterprogram;

public class Position {
	private int y, x; // y = rows, x = columns
	
	// Constructor
	public Position(int y, int x) {
		this.y = y;
		this.x = x;
	}
	
	// Getters
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	// Setters
	public void setX(int x) {
	    this.x = x;
	}

	public void setY(int y) {
	    this.y = y;
	}
	// Methods
	/*
	//update position
	public void step(int stepX, int stepY) {
	    this.x += stepX; // x = x +- step
	    this.y += stepY; // y = y +- step
	}
	*/
}
