package problemSet;
import stanford.karel.SuperKarel;

public class Problem07 extends SuperKarel {

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
		turnLeft();
		turnLeft();
		while(frontIsClear()) {
			move();
		}
		turnLeft();
		turnLeft();
	}
	
	public void goUp() {
		turnLeft();
		move();
		turnLeft();
		turnLeft();
		turnLeft();
	}
}
