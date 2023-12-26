package problemSet;

import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Problem60 extends ConsoleProgram {
	private static final int sentinel = -1;
	
	public void run() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while(true) {
			int n = readInt("Enter num: ");
			if (n == sentinel) {
				break;
			}
			arr.add(0, n);
		}
		
		println(arr);
	}
}