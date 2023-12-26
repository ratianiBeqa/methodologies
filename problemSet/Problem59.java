package problemSet;

import acm.program.ConsoleProgram;

public class Problem59 extends ConsoleProgram {
	
	public void run() {
		int[][] matrix = {
	        {0, 1, 1, 0, 0, 1, 0, 0},
	        {0, 1, 1, 1, 1, 1, 0, 0},
	        {0, 0, 1, 1, 1, 1, 0, 0},
	        {0, 0, 1, 1, 1, 1, 0, 0}
	    };
		
		println(biggestRect(matrix));
	}

	private int biggestRect(int[][] matrix) {
		int max = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				for (int i1 = i; i1 < matrix.length; i1++) {
					for (int j1 = j; j1 < matrix[0].length; j1++) {
						if (hasJustOnes(matrix, i, j, i1, j1)) {
							int area = (i1 - i + 1) * (j1 - j + 1);
							if (area > max) {
								max = area;
								println(max);
							}
						}
						
					}
				}
			}
		}
		
		return max;
	}
	
	private boolean hasJustOnes(int[][] matrix, int i, int j, int i1, int j1) {
		for (int k = i; k <= i1; k++) {
			for (int s = j; s <= j1; s++) {
				if (matrix[k][s] == 0) {
					return false;
				}
			}
		}
		return true;
	}
}