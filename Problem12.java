import acm.graphics.*;
import acm.program.GraphicsProgram;
import java.awt.Color;

public class Problem12 extends GraphicsProgram {
	public void run() {
		int height = getHeight();
		
		GRect myRect = new GRect(200, 200);
		add(myRect, 150, height-200);
		
		GRect door = new GRect(50, 100);
		add(door, 150+75, height-80);
		
		GLine roofLine = new GLine(150, height-200, 150+100, height-300);
		add(roofLine);
		
		GLine roofLine2 = new GLine(150+200, height-200, 150+100, height-300);
		add(roofLine2);
		
		GRect windowFirst = new GRect(50, 50);
		add(windowFirst, 175, height - 175);

		GRect windowSecond = new GRect(50, 50);
		add(windowSecond, 275, height - 175);
		windowSecond.setFilled(true);
		windowSecond.setFillColor(Color.green);
		
		GOval doorKnob = new GOval(240, height-30, 5, 5);
		add(doorKnob);
		
	}
}
