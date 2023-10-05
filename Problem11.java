import stanford.karel.Karel;

public class Problem11 extends Karel {

	public void run() {
		while(noBeepersPresent()) {
			move();
			if(rightIsBlocked()) {
				turnRight();
			}
		}
		pickBeeper();
	}
	
	private void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}
	
}
