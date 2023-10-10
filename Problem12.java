import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem12 extends GraphicsProgram {
	public void run() {
		int height = getHeight();
		
		GRect myRect = new GRect(200, 200);
		add(myRect, 150, height-200);
		
		GRect door = new GRect(50, 100);
		add(door, 150+75, height-100);
		
		GLine roofLine = new GLine(150, 200, 150+100, height-200);
		add(roofLine);
		
		GLine roofLine2 = new GLine(150+100, 60, 200+150, height-200);
		add(roofLine2);
		
		GRect windowFirst = new GRect(50, 50);
		add(windowFirst, 175, height - 175);
		GRect windowSecond = new GRect(50, 50);
		add(windowSecond, 275, height - 175);
		
	}
}
