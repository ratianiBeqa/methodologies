package problemSet;

import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem39 extends GraphicsProgram {
	private static final int RADIUS = 100;
	GOval ball = new GOval(RADIUS * 2, RADIUS * 2);

    public void run() {
    	add(ball, getWidth() / 2 - RADIUS, getHeight() / 2 - RADIUS);
    	ball.setFilled(true);
    	ball.setFillColor(Color.RED);
   
    	while(ball.getX() <= getWidth() - RADIUS * 2) {
    		ball.move(1, 0);
    		pause(3);
    	}
    }
}