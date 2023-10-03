import stanford.karel.SuperKarel;

public class Problem06 extends SuperKarel {
	public void run() {
		move();
		while(beepersPresent()){
			pickBeeper();
		}
		move();
		while(beepersPresent()){
			pickBeeper();
		}
		move();
		while(beepersInBag()){
			putBeeper();
		}
	}
}
