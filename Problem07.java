import stanford.karel.SuperKarel;

public class Problem07 extends SuperKarel {
	public void run() {
		while(leftIsClear()){
			fillRow();
			resetPosition();
			goUp();
		}
	}
	public void fillRow() {
		while(frontIsClear()) {
			if(noBeepersPresent()) {
				putBeeper();
			}
			move();
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
