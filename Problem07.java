import stanford.karel.SuperKarel;

public class Problem07 extends SuperKarel {

	boolean filled = false;

	public void run() {
		while(leftIsClear()){
			fillRow();
			resetPosition();
			goUp();
		}
		fillRow();
	}
	public void fillRow() {
		if(noBeepersPresent()) {
			putBeeper();
		}
		while(frontIsClear()) {
			move();
			if(noBeepersPresent()) {
				putBeeper();
			}
		}
	}
	
	public void resetPosition() {
		turnAround();
		while(frontIsClear()) {
			move();
		}
		turnAround();
	}
	
	public void goUp() {
		turnLeft();
		move();
		turnRight();	
	}
}
