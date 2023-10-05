import stanford.karel.Karel;

public class Problem11 extends Karel {

	public void run() {
		while(rightIsBlocked()) {
			move();
			while(frontIsBlocked()) {
				turnLeft();
			}
			if(beepersPresent()) {
				pickBeeper();
			}
			while(rightIsClear()) {
				turnLeft();
				turnLeft();
				turnLeft();
			}
		}
	}
	
}
