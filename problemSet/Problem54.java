package problemSet;

import acm.program.ConsoleProgram;

public class Problem54 extends ConsoleProgram {

	public void run() {
		int n = readInt("enter n: ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = readInt("enter num: ");
		}
		
		findMaxes(arr);
	}
	
	private void findMaxes(int[] arr) {
		int firstMax = -999999999;
		int secondMax = -999999999;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > firstMax) {
				firstMax = arr[i];
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > secondMax && arr[i] != firstMax) {
				secondMax = arr[i];
			}
		}
		
		println(firstMax);
		println(secondMax);
	}
}