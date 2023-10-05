import stanford.karel.Karel;

public class Problem09 extends Karel {

	public void run() {
		move();
		multiplyBeepers();
	}
	
	private void multiplyBeepers() {
		while(beepersPresent()) {
			pickBeeper();
			move();
			while(beepersPresent()) {
				pickBeeper();
				move();
				putBeeper();
				turnAround();
				move();
				turnAround();
			}
		}
	}
	
	private void turnAround() {
		turnLeft();
		turnLeft();
	}
}
