package problemSet;
import acm.program.ConsoleProgram;

public class Problem18 extends ConsoleProgram {
	public void run() {
		int a = readInt("Enter num 1: ");
		int b = readInt("Enter num 2: ");
		if (a > b) {
			println("Max is: " + a);
		} else if (a < b){
			println("Max is: " + b);
		} else {
			println("They are equal");
		}
	}
}
