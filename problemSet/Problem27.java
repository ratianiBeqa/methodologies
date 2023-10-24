package problemSet;
import acm.program.ConsoleProgram;

public class Problem27 extends ConsoleProgram {
	public void run() {
		int m = readInt("Enter m: ");
		int n = readInt("Enter n: ");
		int ans = 1;
		for (int i=0; i<n; i++) {
			ans *= m;
		}
		println(ans);
	}
}
