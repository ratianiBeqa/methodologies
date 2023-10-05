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
			}
		}
	}
	
}
