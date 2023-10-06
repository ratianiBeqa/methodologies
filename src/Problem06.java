import stanford.karel.SuperKarel;

public class Problem06 extends SuperKarel {
	public void run() {
		move();
		pickAllBeepers();
		move();
		pickAllBeepers();
		move();
		while(beepersInBag()){
			putBeeper();
		}
	}
	
	public void pickAllBeepers(){
		while(beepersPresent()){
			pickBeeper();
		}
	}
}
