package problemSet;

import java.awt.event.*;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem44 extends GraphicsProgram {
	private static final int RADIUS = 50;
	private static final int CIRCLE_SPEED = 1;
	private GOval circle;

	public void run() {
		addMouseListeners();
		drawCircle();
		while(true) {			
			circle.setLocation(circle.getX(), circle.getY() + CIRCLE_SPEED);
			pause(3);
		}
	}

	private void drawCircle() {
		circle = new GOval(RADIUS * 2, RADIUS * 2);
		circle.setFilled(true);
	}

	public void mousePressed(MouseEvent e) {
		add(circle, e.getX() - RADIUS, e.getY() - RADIUS);
	}
}