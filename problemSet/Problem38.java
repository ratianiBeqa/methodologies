package problemSet;
import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Problem38 extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static int money = 1000;
	
    public void run() {
        playRoulette();
    }

    private void playRoulette() {
        while (money != 0) {
        	int bet = readInt("Enter bet: ");
        	while (bet > money) {
        		println("You can't bet more than you have");
        		bet = readInt("Enter bet: ");
        	}
        	int number = readInt("Enter number: ");
        	while (number < 0 || number > 36) {
        		println("You should enter numbers between 0 and 36");
        		number = readInt("Enter number: ");        		
        	}
        	int winnerNumber = rgen.nextInt(37);
        	println("Winning number is: " + winnerNumber);
        	
        	if (number == winnerNumber) {
        		println("You won!");
        		money += bet;
        	} else {
        		println("You lost!");
        		money -= bet;
        	}
        	println("Money left: " + money);
        }
        
        println("You lost all your money :)");
    }
}