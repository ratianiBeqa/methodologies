import stanford.karel.SuperKarel;

public class Problem06 extends SuperKarel {
	public void run() {
		while(frontIsClear()) {
			if(noBeepersPresent()) {
				putBeeper();
				move();
			} else {
				pickBeeper();
			}
		}
	}
}
