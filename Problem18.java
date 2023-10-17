import acm.program.ConsoleProgram;

public class Problem18 extends ConsoleProgram {
	public void run() {
		double num = readDouble("enter number: ");
		int intPart = (int) num;
		double fractPart = num - intPart;

		println("int part: " + intPart);
		println("fract part: " + fractPart);
	}
}
