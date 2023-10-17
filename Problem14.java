import acm.graphics.*;
import acm.program.GraphicsProgram;
import java.awt.Color;

public class Problem14 extends GraphicsProgram {
	public void run() {
		int w = getWidth();
		int h = getHeight();
		
		GRect head = new GRect(100, 100);
		add(head, w/2 - 50, h/2 - 50);
		head.setFilled(true);
	    head.setColor(Color.orange);
		
		GLine antanaOne = new GLine(w/2 - 50, h/2 - 50, w/2 - 50, h/2 - 100);
		GLine antanaTwo = new GLine(w/2 + 50, h/2 - 50, w/2 + 50, h/2 - 100);
		add(antanaOne);
		add(antanaTwo);
		
		GLine eyeOne = new GLine(w/2 - 30, h/2 - 30, w/2 - 10, h/2 - 10);
		GLine eyeTwo = new GLine(w/2 + 10, h/2 - 10, w/2 + 30, h/2 - 30);
		add(eyeOne);
		add(eyeTwo);
		
		GRect mouth = new GRect(70, 20);
		mouth.setFilled(true);
		mouth.setColor(Color.white);
		add(mouth, w/2 - 35, h/2 + 20);
		
		GLine toothOne = new GLine(w/2 - 35 + 70/3, h/2 + 20, w/2 - 35 + 70/3, h/2 + 40);
		toothOne.setColor(Color.LIGHT_GRAY);
		add(toothOne);
		
		GLine toothTwo = new GLine(w/2 - 35 + 140/3, h/2 + 20, w/2 - 35 + 140/3, h/2 + 40);
		toothTwo.setColor(Color.LIGHT_GRAY);
		add(toothTwo);
	}
}
