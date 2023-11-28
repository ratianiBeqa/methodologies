package problemSet;

import java.awt.event.*;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem43 extends GraphicsProgram {
	private static final int RADIUS = 50;
	private GOval circle;
	
	public void run() {
		circle = new GOval(2 * RADIUS, 2 * RADIUS);
		circle.setFilled(true);
		add(circle, getWidth() / 2 - RADIUS, getHeight() / 2 - RADIUS);
		addMouseListeners();
	}
	
	public void mouseDragged(MouseEvent e) {
		GObject curObj = getElementAt(e.getX(), e.getY());
		if (curObj == circle) {
			circle.setLocation(e.getX() - RADIUS, e.getY() - RADIUS);
		}
	}

}