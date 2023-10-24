package problemSet;
import acm.program.ConsoleProgram;

public class Problem23 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter n: ");
		println("sum: " + calculateSum(n));
	}
	
	private int calculateSum(int n) {
		int sum = 0;
		for (int i=1; i<=n; i++) {
			sum = sum + i;
		}
		return sum;
	}
}
