import stanford.karel.Karel;

public class Problem11 extends Karel {

	public void run() {
		while (noBeepersPresent()) {
			move();
			if (rightIsClear()) {
				turnRight();
			}
			while (frontIsBlocked()) {
				turnLeft();
			}
		}
		pickBeeper();
	}

	private void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft(); // test comment
	}

}
