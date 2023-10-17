import acm.program.ConsoleProgram;

public class Problem18 extends ConsoleProgram {
	public void run() {
		int a = readInt("Enter num 1: ");
		int b = readInt("Enter num 2: ");
		if (a > b) {
			println("max is: " + a);
		} else {
			println("max is: " + b);
		}
	}
}
