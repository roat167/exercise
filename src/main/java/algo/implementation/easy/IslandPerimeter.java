package algo.implementation.easy;

public class IslandPerimeter {
	
	public static int islandPerimeter(int[][] grid) {
		// find number of land
		// deduce twice amount of connected land
		// with cell connected with both land
		int r = grid.length;
		int c = grid[0].length;
		int cl = 0; // lands
		int ng = 0; // neighbor
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				int n = grid[i][j];
				if (n == 1) {
					cl++;
					// neighbor on the top
					if ((i != 0) && grid[i - 1][j] == 1) { 
						ng++;
					}
					// neighbor on the left
					if ((j != 0) && grid[i][j - 1] == 1) {
						ng++;
					}
				}
			}
		}
		return cl * 4 - (2 * ng);
	}
	
	public static void main(String[] args) {
		int[][] grid = { { 0, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 }, { 1, 1, 0, 0 } };
		System.out.println(IslandPerimeter.islandPerimeter(grid)); //expected 16
	}
}
