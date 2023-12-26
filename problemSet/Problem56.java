package problemSet;

import java.util.Arrays;

import acm.program.ConsoleProgram;

public class Problem56 extends ConsoleProgram {

	public void run() {
		int n = readInt("enter n: ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = readInt("enter num: ");
		}

		println(Arrays.toString(sorted(arr)));
	}

	private int[] sorted(int[] arr) {
		int[] sortedArr = Arrays.copyOf(arr, arr.length);
		for (int i = 0; i < sortedArr.length; i++) {
			println(Arrays.toString((sortedArr)));
			for (int j = i; j < sortedArr.length; j++) {
				if (sortedArr[i] > sortedArr[j]) {
					int temp = sortedArr[j];
					sortedArr[j] = sortedArr[i];
					sortedArr[i] = temp;
				}
			}
		}
		
		return sortedArr;
	}
}