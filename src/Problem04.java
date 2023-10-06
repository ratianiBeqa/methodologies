import stanford.karel.SuperKarel;

public class Problem04 extends SuperKarel {
	public void run() {
		putBeeper();
		while(frontIsClear()) {
			move();
			putBeeper();
		}
	}
}
