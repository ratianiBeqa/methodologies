import stanford.karel.Karel;

public class Problem10 extends Karel {

	public void run() {
		move();
		divide();
	}
	
	private void divide() {
		while(beepersPresent()) {
			move();
			while(beepersPresent()) {
				pickBeeper();
				turnAround();
				move();
				pickBeeper();
				turnAround();
				move();
				move();
				move();
				putBeeper();
				move();
				putBeeper();
				resetPosition();
			}	
		}
	}
	
	private void resetPosition() {
		turnAround();
		move();
		move();
		move();
		turnAround();
	}
	
	private void turnAround() {
		turnLeft();
		turnLeft();
	}
	
}
