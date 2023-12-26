package problemSet;

import java.awt.Color;
import java.awt.event.*;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Problem41 extends GraphicsProgram {
	private static final int RADIUS = 50;

	public void run() {
		addMouseListeners();
	}

	public void mouseMoved(MouseEvent e) {
		GOval ball = new GOval(RADIUS * 2, RADIUS * 2);
		ball.setFilled(true);
		ball.setFillColor(Color.BLACK);
		add(ball, e.getX() - RADIUS, e.getY() - RADIUS);
	}
}