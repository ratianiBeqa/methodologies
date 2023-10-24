package problemSet;
import acm.program.ConsoleProgram;

public class Problem25 extends ConsoleProgram {
	public void run() {
		int a = readInt("Enter num 1: ");
		int b = readInt("Enter num 2: ");
		
		println("Answer: " + LCF(a,b));
	}
	
	private int LCF(int a, int b) {
		int ans = -1;
		int max;

		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		
		for (int i=max; i<=a*b; i++) { //uketesi solutionic sheidzleba albat
			if (i % a == 0 && i % b == 0) {
				ans = i;
				break;
			}
		}
		return ans;
	}
}
