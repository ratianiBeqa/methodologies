package problemSet;
import acm.program.ConsoleProgram;

public class Problem27 extends ConsoleProgram {
	public void run() {
		int m = readInt("Enter m: ");
		int n = readInt("Enter n: ");
		
		println("m^n = " + power(m,n));
	}
	
	private int power(int m, int n) {
		int ans = 1;
		for (int i=0; i<n; i++) {
			ans *= m;
		}
		return ans;
	}
}
