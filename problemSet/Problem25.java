package problemSet;
import acm.program.ConsoleProgram;

public class Problem25 extends ConsoleProgram {
	public void run() {
		int a = readInt("Enter num 1: ");
		int b = readInt("Enter num 2: ");
		int max;

		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		
		for (int i = max; i < a*b; i++) { //uketesi solutionic sheidzleba vici
			if (i % a == 0 && i % b == 0) {
				println("USJ: " + i);
				break;
			}
		}
	}
}
