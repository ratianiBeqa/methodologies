import stanford.karel.SuperKarel;

public class Problem03 extends SuperKarel {
	public void run() {
		move();
		move();
		move();
		move();
		for (int i=0; i<10; i++) {
			pickBeeper();
		}
		move();
		for (int i=0; i<10; i++) {
			putBeeper();
		}
	}
}
