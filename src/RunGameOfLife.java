import java.util.Scanner;

public class RunGameOfLife {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("\n*** Welcome to the Game of Life! ***\n");
		System.out.print("Give the grid's height: ");
		int height = scan.nextInt();
		System.out.print("\nGive the grid's width: ");
		int width = scan.nextInt();
		while (height < 1 || width < 1) {
			System.out.println("\nGrid dimensions should be greater than 0.");
			System.out.print("\nHeight: ");
			height = scan.nextInt();
			System.out.print("\nWidth: ");
			width = scan.nextInt();
		}
		System.out.print("\nGive the number of generations: ");
		int generations = scan.nextInt();
		while (generations < 1) {
			System.out.println("\nNumber of generations should be greater than 0.");
			System.out.print("\nNumber of generations: ");
			generations = scan.nextInt();
		}
		GameOfLife gol = new GameOfLife(height, width);
		System.out.println("\nThe initial grid:");
		gol.printGrid();
		for (int i = 1; i <= generations; i++) {
			gol.nextGeneration();
			System.out.println("\nGeneration " + i + ":");
			gol.printGrid();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n*** End of the Game of Life! ***\n\n");
		scan.close();
	}
}
