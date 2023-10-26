package problemSet;
import acm.program.ConsoleProgram;

public class Problem30 extends ConsoleProgram {

	public void run() {
		int n = readInt("Enter n: ");

		println("Reversed: " + reverseInt(n));
	}

	private int reverseInt(int num) {
		int rev = 0;
        while(num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        return rev;
	}
}
