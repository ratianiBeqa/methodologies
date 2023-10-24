package problemSet;
import acm.program.ConsoleProgram;

public class Problem28 extends ConsoleProgram {
	private static final int SENTINEL = -1;
	public void run() {
		int count = 0;
		
		while (true) {
			int num = readInt("num: ");
			if(num == SENTINEL) {
				break;
			} else {
				if (num % 2 == 0) {
					count++;
				}
			}
		}
		
		println("Even count: " + count);
	}
}
