import stanford.karel.SuperKarel;

public class Problem05 extends SuperKarel {
	public void run() {
		putBeeper();
		while(frontIsClear()) {
			move();
			putBeeper();
		}
	}
}
