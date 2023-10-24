package bonusProblems;

import acm.graphics.GLabel;
import acm.program.*;

public class Seminar09_02_a extends GraphicsProgram {	
	public void run() {
		int x = 12;

		GLabel xBefore = new GLabel("x before method: " + x, 10, 20);
		add(xBefore);

		tripleNum(x);

		GLabel xAfter = new GLabel("x after method: " + x, 10, 60);
		add(xAfter);
	}
	
	private void tripleNum(int x) {
		GLabel xInMethod = new GLabel("x in method: " + x * 3, 10, 40);
		add(xInMethod);
	}
}
