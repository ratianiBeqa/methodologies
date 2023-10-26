package problemSet;
import acm.program.ConsoleProgram;

public class Problem32 extends ConsoleProgram {

	public void run() {
		for (int i=2; i<=1000000; i++) {
			if (isPrime(i)) {
				println(i);
			}
		}
	}
	
	private boolean isPrime(int n) {
		for (int i=2; i<n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
