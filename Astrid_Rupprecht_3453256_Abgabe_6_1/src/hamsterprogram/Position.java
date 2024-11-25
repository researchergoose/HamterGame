package hamsterprogram;

public class Position {
	private int x, y;
	
	// Constructor
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// Getters
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	// Methods
	
	//update position
	public void step(int stepX, int stepY) {
	    this.x += stepX; // x = x +- step
	    this.y += stepY; // y = y +- step
	}
}
