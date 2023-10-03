import stanford.karel.Karel;

public class Seminar03 extends Karel {
	public void run(){
		move();
		move();
		buildHouse();
	}
	
	public void buildHouse(){
		buildLeftWall();
		buildRoof();
		buildRighWall();
		buildDoor();
	}
	
	public void buildLeftWall(){
		turnLeft();
		putBeeper();
		for(int i=0; i<8; i++) {
			move();
			putBeeper();
		}
	}
	
	public void buildRoof(){
		buildLeftRoof();
		buildRightRoof();
	}
	
	public void buildLeftRoof(){
		buildLeftRoofBlock();
		buildLeftRoofBlock();
		buildLeftRoofBlock();
	}
	
	
	public void buildLeftRoofBlock(){
		turnRight();
		move();
		turnLeft();
		move();
		putBeeper();
	}
	
	public void buildRightRoof(){
		turnRight();
		move();
		turnRight();
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
		turnLeft();
		move();
		turnRight();
		move();
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
	
	public void buildRighWall(){
		putBeeper();
		for (int i=0; i<8; i++) {
			move();
			putBeeper();
		}
	}
	
	public void buildDoor(){
		turnRight();
		move();
		move();
		turnRight();
		putBeeper();
		for (int i=0; i<3; i++){
			move();
			putBeeper();
		}
		turnLeft();
		move();
		putBeeper();
		move();
		turnLeft();
		putBeeper();
		for (int i=0; i<3; i++){
			move();
			putBeeper();
		}
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
