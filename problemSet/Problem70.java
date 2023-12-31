import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Problem70 extends GraphicsProgram implements ComponentListener{
	GOval oval;
	public void init() {
		oval = new GOval(getWidth()/ 2, getHeight()/2);
		add(oval);
		addComponentListener(this);
	}
	
	@Override
	public void componentResized(ComponentEvent e) {
		oval.setSize(getWidth()/ 2, getHeight()/2);
	}

	@Override
	public void componentMoved(ComponentEvent e) {
		
	}

	@Override
	public void componentShown(ComponentEvent e) {
		
	}

	@Override
	public void componentHidden(ComponentEvent e) {
		
	}

}