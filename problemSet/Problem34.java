package problemSet;
import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Problem34 extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		for (int i=0; i<1000; i++) {
			generateCircle();
		}
	}
	
	private void generateCircle() {
		int w = getWidth();
		int h = getHeight();
		int radius = rgen.nextInt(10, 100);
		int randX = rgen.nextInt(0, w - radius);
		int randY = rgen.nextInt(0, h - radius);
		Color randColor = rgen.nextColor();
		
		
		GOval bigCircle = new GOval(randX, randY, radius, radius);
		bigCircle.setFilled(true);
		bigCircle.setColor(randColor);
	    add(bigCircle);
	}
}
