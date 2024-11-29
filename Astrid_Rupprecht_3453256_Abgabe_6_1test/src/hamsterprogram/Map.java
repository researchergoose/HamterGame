package hamsterprogram;

public class Map {
	
	// Attributes
	private int totalCorn;
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
		
		// total corn
        this.totalCorn = 0;
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[y].length; x++) {
                if (grid[y][x] == '*') {
                    totalCorn++;
                }
            }
        }
	}
	
	// Getters and Setters
	public Hamster getHamster() {
		return hamster;
	}
	
	public int getTotalCorn() {
        return totalCorn;
    }

	// Methods

	public void displayMap() {
		// add hamster
		this.grid[this.hamster.getPosition().getY()][this.hamster.getPosition().getX()] = this.hamster.getDirection();

		// iterate through two dimensional array
		for (int y = 0; y < grid.length; y++) {
			for (int x = 0; x < grid[y].length; x++) {
				
				System.out.print(grid[y][x]);
			}
			System.out.println();
		}
	}
    
	

}