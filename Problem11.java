import stanford.karel.Karel;

public class Problem11 extends Karel {

	public void run() {
		while(rightIsBlocked()) {
			move();
			if(frontIsBlocked()) {
				turnLeft();
			}
			if(beepersPresent()) {
				pickBeeper();
			}
		}
	}
	
}
