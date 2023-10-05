import stanford.karel.Karel;

public class Problem08 extends Karel {

	public void run() {
		move();
		move();
		takeAway();
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
		
	}
	
	private void turnAround() {
		turnLeft();
		turnLeft();
	}
}
