package problemSet;
import stanford.karel.Karel;

public class Problem08 extends Karel {

	public void run() {
		move();
		move();
		takeAway();
		moveBeepersToDest();
	}
	
	private void takeAway() {
		while(beepersPresent()) {
			turnAround();
			pickBeeper();
			move();
			pickBeeper();
			move();
			putBeeper();
			turnAround();
			move();
			move();
		}
	}
	
	private void moveBeepersToDest() {
		turnAround();
		move();
		while(beepersPresent()) {
			pickBeeper();
			turnAround();
			move();
			move();
			putBeeper();
			turnAround();
			move();
			move();
		}
	}
	
	private void turnAround() {
		turnLeft();
		turnLeft();
	}
}
