import stanford.karel.Karel;

public class Problem09 extends Karel {

	public void run() {
		move();
		while(beepersPresent()) {		
			multiplyBeepers();
		}
	}
	
	private void multiplyBeepers() {
		pickBeeper();
		move();
		while(beepersPresent()) {
			pickBeeper();
			move();
			putBeeper();
			move();
			putBeeper();
			turnAround();
			move();
			move();
			turnAround();
		}
		turnAround();
		move();
		turnAround();
	}
	
	private void turnAround() {
		turnLeft();
		turnLeft();
	}
}
