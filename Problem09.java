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
			doubleBeepers();
		}
		returnBeeepers();
		turnAround();
		move();
		turnAround();
	}
	
	private void returnBeeepers() {
		move();
		move();
		while(beepersPresent()) {
			turnAround();
			pickBeeper();
			move();
			move();
			putBeeper();
			turnAround();
			move();
			move();
		}
		returnToPosition();
	}
	
	private void returnToPosition() {
		turnAround();
		move();
		move();
		move();
		turnAround();
	}
	
	private void doubleBeepers() {
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
	
	private void turnAround() {
		turnLeft();
		turnLeft();
	}
}
