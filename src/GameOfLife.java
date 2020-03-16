import java.util.Random;

public class GameOfLife {

	private int height, width;
	private int grid[][]; // true = alive, false = dead

	public GameOfLife(int height, int width) {
		this.height = height;
		this.width = width;
		grid = new int[height][width];
		Random random = new Random();
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				grid[i][j] = random.nextInt(2);
			}
		}
	}

	public void printGrid() {
		System.out.print(" ");
		for (int i = 0; i < width; i++) {
			System.out.print("__");
		}
		System.out.println();
		for (int i = 0; i < height; i++) {
			System.out.print("| ");
			for (int j = 0; j < width; j++) {
				if (grid[i][j] == 1) {
					System.out.print("# ");
				} else {
					System.out.print("- ");
				}
			}
			System.out.println("|");
		}
		System.out.print(" ");
		for (int i = 0; i < width; i++) {
			System.out.print("__");
		}
		System.out.println();
	}

	public void nextGeneration() {
		int[][] newGrid = new int[height][width];
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				int neighbors = countNeighbors(i, j);
				// Any live cell with two or three neighbors survives.
				if (grid[i][j] == 1 && (neighbors == 2 || neighbors == 3)) {
					newGrid[i][j] = 1;
					// Any dead cell with three live neighbors becomes a live cell.
				} else if ((grid[i][j] == 0) && (neighbors == 3)) {
					newGrid[i][j] = 1;
					// All other live cells die in the next generation. Similarly, all other dead
					// cells stay dead.
				} else {
					newGrid[i][j] = 0;
				}
			}
		}
		grid = newGrid;
	}

	private int countNeighbors(int x, int y) {
		int count = 0;
		for (int i = -1; i <= 1; i++) {
			for (int j = -1; j <= 1; j++) {
				if (notOutOfBounds(x + i, y + j) && grid[x + i][y + j] == 1)
					count++;
			}
		}
		count -= grid[x][y];
		return count;
	}

	private boolean notOutOfBounds(int x, int y) {
		return (x >= 0 && y >= 0 && x < height && y < width);
	}

}
