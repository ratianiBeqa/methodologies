import acm.graphics.*;
import acm.program.GraphicsProgram;
import java.awt.Color;

public class Problem14 extends GraphicsProgram {
	public void run() {
		int w = getWidth();
		int h = getHeight();
		
		GRect head = new GRect(100, 100);
		add(head, w/2 - 50, h/2 - 50);
		
		GLine antanaOne = new GLine(w/2 - 50, h/2 - 50, w/2 - 50, h/2 - 100);
		GLine antanaTwo = new GLine(w/2 + 50, h/2 - 50, w/2 + 50, h/2 - 100);
		add(antanaOne);
		add(antanaTwo);
		
		GLine eyeOne = new GLine(w/2 - 30, h/2 - 30, w/2 - 10, h/2 - 10);
		GLine eyeTwo = new GLine(w/2 + 30, h/2 - 20, w/2 + 10, h/2 - 30);
		add(eyeOne);
		

//		myRect.setFilled(true);
//		myRect.setFillColor(new Color(150, 75, 0));
//		
//		GRect door = new GRect(50, 100);
//		add(door, 150+75, height-80);
//		door.setFilled(true);
//		door.setColor(Color.orange);
//		
//		GLine roofLine = new GLine(150, height-200, 150+100, height-300);
//		add(roofLine);
//		
//		GLine roofLine2 = new GLine(150+200, height-200, 150+100, height-300);
//		add(roofLine2);
//		
//		GRect windowFirst = new GRect(50, 50);
//		add(windowFirst, 175, height - 175);
//		windowFirst.setFilled(true);
//		windowFirst.setFillColor(Color.cyan);
//
//		GRect windowSecond = new GRect(50, 50);
//		add(windowSecond, 275, height - 175);
//		windowSecond.setFilled(true);
//		windowSecond.setFillColor(Color.cyan);
//		
//		GOval doorKnob = new GOval(240, height-30, 5, 5);
//		add(doorKnob);
//		doorKnob.setFilled(true);
//		
	}
}
