package problemSet;

import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem40 extends GraphicsProgram {
	private static final int RADIUS = 100;
	GOval ball = new GOval(RADIUS * 2, RADIUS * 2);

    public void run() {
    	int w = getWidth();
    	int h = getHeight();
    	
    	add(ball, w / 2 - RADIUS, h / 2 - RADIUS);
    	ball.setFilled(true);
    	ball.setFillColor(Color.RED);
   
    	int moveDir = 1;
    	while(true) {
    		ball.move(moveDir, 0);
    		pause(3);
    		if (moveDir == 1 && w - ball.getWidth() == ball.getX()) {
    			moveDir *= -1; // shevcvalot mimartuleba
    		} else if (moveDir == -1 && ball.getX() == 0) {
    			moveDir *= -1;
    		}
    	}
    }
}