package problemSet;

import java.awt.event.*;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem42 extends GraphicsProgram {
	private GLine line;
	private boolean lineStarted = false;
	
	public void run() {
		addMouseListeners();
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		if (!lineStarted) {
			line = new GLine(e.getX(), e.getY(),e.getX(), e.getY());
			line.setStartPoint(e.getX(), e.getY());			
			lineStarted = true;
		} else {			
			line.setEndPoint(e.getX(), e.getY());
			lineStarted = false;
		}
		add(line);
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		if (lineStarted) {			
			line.setEndPoint(e.getX(), e.getY());
		}
	}
}