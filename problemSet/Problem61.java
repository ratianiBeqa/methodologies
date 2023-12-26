package problemSet;

import java.util.ArrayList;
import acm.program.ConsoleProgram;

public class Problem61 extends ConsoleProgram {
	
	public void run() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int m = readInt("Enter m: ");
		int n = readInt("Enter n: ");
		for (int i = 0; i < n; i++) {
			int num = readInt("Enter num: ");
			arr.add(num);
		}
		
		for (int i = 0; i < arr.size() - 1; i++) {
			for (int j = i + 1; j < arr.size(); j++) {
				if (arr.get(i) + arr.get(j) == m) {
					println(arr.get(i) + " + " + arr.get(j));
					return;
				}
			}
		}
	}
}