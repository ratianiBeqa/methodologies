package problemSet;
import acm.program.ConsoleProgram;

public class Problem15 extends ConsoleProgram {
	public void run() {
		int a = readInt("First number: ");
		int b = readInt("Second number: ");
		double avg = (a + b) / 2;
		println(avg);
	}
}
