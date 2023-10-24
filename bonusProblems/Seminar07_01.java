package bonusProblems;
import acm.program.ConsoleProgram;

public class Seminar07_01 extends ConsoleProgram {
	private static final int SENTINEL = 0;
	
	public void run() {
		double sum = 0;
		while (true) {
			double num = readDouble("Enter num: ");
			if (num == SENTINEL) {
				break;
			} else {      
				sum = sum + num;
			}
		}
		println("sum: " + sum);
	}
}
