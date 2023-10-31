package problemSet;
import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Problem33 extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		int maxRadius = getHeight();
		int radius = rgen.nextInt(30, maxRadius);
		Color randColor = rgen.nextColor();

		GOval circle = new GOval(0, 0, radius, radius);
		circle.setFilled(true);
		circle.setColor(randColor);
	    add(circle);  
	}
}
