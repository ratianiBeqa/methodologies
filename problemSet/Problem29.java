package problemSet;
import acm.program.ConsoleProgram;

public class Problem29 extends ConsoleProgram {

	public void run() {
		int ans = 0;
		int prev = 1, prevPrev = 1;
		int n = readInt("Enter n: ");

		if (n == 1 || n == 2) {
			println("answer: " + 1);
		} else {
			for (int i=0; i<n-2; i++) {
				ans = prev + prevPrev;
				prevPrev = prev;
				prev = ans;
			}
			println("answer: " + ans);
		}
	}
}
