package problemSet;
import acm.program.ConsoleProgram;

public class Problem24 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter n: ");
		println("dividers: " + dividers(n));
	}
	
	private int dividers(int n) {
		int dividers = 0;
		for (int i=1; i<=n; i++) {
			if ((n % i) == 0) {
				dividers = dividers + 1;
			}
		}
		return dividers;
	}
}
