package problemSet;
import acm.program.ConsoleProgram;

public class Problem20 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter n: ");
		double sum = 0;
		for (int i=0; i<n; i++) {
			double newNum = readDouble("Enter number: ");
			sum = sum + newNum;
		}
		println("sum is: " + sum);
	}
}
