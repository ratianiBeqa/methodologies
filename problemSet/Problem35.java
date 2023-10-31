package problemSet;
import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Problem35 extends ConsoleProgram {
	private static final int MAX_SIMULATION = 10000;
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		double count = 0;
		for(int i = 0; i < MAX_SIMULATION; i++) {
			int currentNumFlips = simulation();
			count += currentNumFlips;
		}
		
		double avgFlips = count / MAX_SIMULATION;
		print(avgFlips);
	}

	private int simulation() {
		int count = 0;
		while(true) {
			boolean isHeads = rgen.nextBoolean();
			count += 1;
			if(isHeads) {
				break;
			}
		}
		return count;
	}
}
