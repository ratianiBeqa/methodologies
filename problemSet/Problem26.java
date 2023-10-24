package problemSet;
import acm.program.ConsoleProgram;

public class Problem26 extends ConsoleProgram {
	public void run() {
		int a = readInt("Enter num 1: ");
		int b = readInt("Enter num 2: ");
		
		println("Answer: " + GCM(a, b));
	}
	
	private int GCM(int a, int b) {
		int ans = -1;
		int min;

		if (a > b) {
			min = b;
		} else {
			min = a;
		}
		
		for (int i=min; i>=1; i--) {
			if (b % i == 0 && a % i == 0) {
				ans = i;
				break;
			}
		}
		return ans;
	}
}
