import stanford.karel.SuperKarel;

public class Problem07 extends SuperKarel {
	public void run() {
		bool filled = false;
		while(!filled){
			fillRow();
			resetPosition();
			goUp();
		}
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
		if (leftIsClear()) {
			turnLeft();
			move();
			turnRight();	
		} else {
			filled = true;
		}
	}
}
