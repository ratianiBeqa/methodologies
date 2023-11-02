package bonusProblems;

import acm.graphics.*;
import acm.program.*;

public class Seminar10_01 extends GraphicsProgram {	
	public void run() {
		GPolygon myTriangle = getTriangle(100);
		add(myTriangle, 123, 212);
	}
	
	private GPolygon getTriangle(int side) {
		GPolygon triangle = new GPolygon();

		triangle.addVertex(0, side / 2);
		triangle.addVertex(side / 2, 0);
		triangle.addVertex(side, side / 2);
		return triangle;
	}
}
