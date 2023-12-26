package problemSet;

import acm.program.ConsoleProgram;

public class Problem58 extends ConsoleProgram {
	
	public void run() {
		int[][] matrix1 = {
				{1, 2, 3},
				{9, 7, 8},
				{4, 5, 6}};
		println("is magic: " + isMagicMatrix(matrix1));
	}

	private boolean isMagicMatrix(int[][] matrix) {
		int n = matrix.length;
		int h = matrix[0].length;
		
		if (n != h) {
			return false;
		}
		
		
		for (int k = 1; k <= n * n; k++) {			
			if (!containsNumber(matrix, k)) {
				return false;
			}
		}
		return true;
	}
	
	private boolean containsNumber(int[][] matrix, int num) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] == num) {
					return true;
				}
			}
		}
		return false;
	}
}