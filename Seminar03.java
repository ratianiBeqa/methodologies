import stanford.karel.SuperKarel;

public class Seminar03 extends SuperKarel {
	public void run(){
		move();
		move();
		buildHouse();
	}
	
	public void buildHouse(){
		turnLeft();
		putBeeper();
		for(int i=0; i<9; i++) {
			move();
			putBeeper();
			move();
			move();
		}
	}
}
