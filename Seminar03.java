import stanford.karel.Karel;

public class Seminar03 extends Karel {
	public void run(){
		move();
		move();
		buildHouse();
	}
	
	public void buildHouse(){
		turnLeft();
		putBeeper();
		for(int i=0; i<8; i++) {
			move();
			putBeeper();
		}
		buildChimney();
	}
	
	public void buildChimney(){
		buildChimneyBlockLeft();
		buildChimneyBlockLeft();
		buildChimneyBlockLeft();
	}
	
	public void buildChimneyBlockLeft(){
		turnRight();
		move();
		turnLeft();
		move();
		putBeeper();
		turnLeft();
		move();
		turnLeft();
		move();
		turnAround();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
	}
	
	public void buildChimneyBlockRight(){
		turnRight();
		move();
		turnRight();
		move();
		putBeeper();
		
	}
	
	public void turnRight(){
		turnLeft();
		turnLeft();
		turnLeft();
	}
	
	public void turnAround(){
		turnLeft();
		turnLeft();
	}
}
