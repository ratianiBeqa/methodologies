package problemSet;
import acm.program.ConsoleProgram;

public class Problem16 extends ConsoleProgram {
	public void run() {
		// pirobashi mtel ricxvebze ki weria mara qrashavs mase
		double a = readDouble("First number: ");
		double b = readDouble("Second number: ");
		double c = readDouble("Third number: ");
		println(1 / (1 / a + 1 / b + 1 / c));
	}
}
