import acm.program.ConsoleProgram;

public class Problem25 extends ConsoleProgram {
	public void run() {
		int a = readInt("Enter num 1: ");
		int b = readInt("Enter num 2: ");
		int min;
		if (a > b) {
			min = b;
		} else {
			min = a;
		}
		
		for (int i=min; i>=1; i++) {
			if (b % i == 0 && a % i == 0) {
				println("USG: " + i);
				break;
			}
		}
	}
}
