import acm.program.ConsoleProgram;

public class Problem24 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter n: ");
		for (int i=0; i<n; i++) {
			println("Hello " + i);
		}
	}
}
