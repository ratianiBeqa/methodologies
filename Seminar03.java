import stanford.karel.SuperKarel;

public class Seminar03 extends SuperKarel {
	public void run(){
		move();
		move();
	}
	
	public void buildHouse(){
		putBeeper();
		turnLeft();
		for(int i=0; i<9; i++) {
			putBeeper();
			move();
		}
	}
}
