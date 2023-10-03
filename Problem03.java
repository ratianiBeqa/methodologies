import stanford.karel.SuperKarel;

public class Problem03 extends SuperKarel {
	public void run() {
		putBeeper();
		while(frontIsClear()) {
			move();
			putBeeper();
		}
	}
}
