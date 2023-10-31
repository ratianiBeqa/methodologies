package problemSet;
import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Problem36 extends ConsoleProgram {
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
        int countTillThree = 0;

        while(true) {
            boolean isHeads = rgen.nextBoolean();
            count++;
            if (isHeads) {
                countTillThree++;
            } else {
                countTillThree = 0;
            }
            if(countTillThree == 3) {
                break;
            }
        }
        return count;
    }
}