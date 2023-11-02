package problemSet;
import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Problem37 extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
    public void run() {
    	int num = readInt("Enter number: ");
        playRoulette(num);
    }

    private void playRoulette(int num) {
        int randomNum = rgen.nextInt(37);
        
        println("Winner number is: " + randomNum);
        if (num == randomNum) {
        	println("You won!");
        } else {
        	println("You lost");
        }
    }
}