import stanford.karel.SuperKarel;

public class Problem06 extends SuperKarel {
	public void run() {
		int beeperCount = 0;
		move();
		while(beepersPresent()){
			beeperCount ++;
			pickBeeper();
		}
		move();
		for (int i=0; i<beeperCount; i++) {
			putBeeper();
		}
	}
}
