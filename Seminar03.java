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
		buildLeftWall();
		buildChimney();
	}
	
	public void buildLeftWall(){
		for(int i=0; i<8; i++) {
			move();
			putBeeper();
		}
	}
	
	public void buildChimney(){
		putRightDiagonally();
		putRightDiagonally();
		putRightDiagonally();
	}
	
	public void buildChimneyBlockLeft(){
		putRightDiagonally();
		putRightDiagonally();
		putRightDiagonally();
	}
	
	public void putRightDiagonally(){
		turnRight();
		move();
		turnLeft();
		move();
		putBeeper();
	}
	
	public void buildChimneyRight(){
		turnRight();
		move();
		turnRight();
		move();
		putBeeper();
		turnAround();
		putBeeper();
		move();
		putBeeper();
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
