package problemSet;
import acm.program.ConsoleProgram;

public class Problem31 extends ConsoleProgram {

	public void run() {
		int n = readInt("Enter n: ");
		if (isPrime(n)) {
			println(n + " is prime");
		} else {
			println(n+ " is not prime");
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
