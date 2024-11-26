package hamsterprogram;

public class Map {
	
	// Attributes
	private char wall;
	private char corn;
	private Hamster hamster;
	public char[][] grid = { { }, { } };
	
	// Constructor
	public Map () {
		this.hamster = new Hamster('<', new Position(1, 1));
		this.grid = new char[][] {
			{'#', '#', '#', '#', '#', '#', '#'},
            {'#', ' ', '*', ' ', '*', ' ', '#'},
            {'#', '#', ' ', '#', ' ', '*', '#'},
            {'#', '*', '#', ' ', ' ', '#', '#'},
            {'#', ' ', '*', ' ', ' ', ' ', '#'},
            {'#', ' ', '#', '#', '*', ' ', '#'},
            {'#', ' ', '*', ' ', ' ', ' ', '#'},
            {'#', ' ', ' ', ' ', '#', '*', '#'},
            {'#', '#', '#', '#', '#', '#', '#'}
		};
		this.hamster.getPosition();
		this.grid[this.hamster.getPosition().getY()][this.hamster.getPosition().getX()] = this.hamster.getDirection();
	}
	
	// Getters and Setters
	public Hamster getHamster() {
		return hamster;
	}
	
	public char getWall() {
		return wall;
	}

	public void setWall(char wall) {
		this.wall = '#';
	}

	public char getCorn() {
		return corn;
	}

	public void setGrain(char corn) {
		this.corn = '*';
	}

	public void setHamster(Hamster hamster) {
		this.hamster = hamster;
	}
	

	// Methods

	
	public void displayMap() {
		this.grid[this.hamster.getPosition().getY()][this.hamster.getPosition().getX()] = this.hamster.getDirection();

		// iterate through two dimensional array
		for (int y = 0; y < grid.length; y++) {
			for (int x = 0; x < grid[y].length; x++) {
				// ? how do i display the hamster?
				//
				
				System.out.print(grid[y][x]);
			}
			System.out.println();
		}
	}
	
	

}
