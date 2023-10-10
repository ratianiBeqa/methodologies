import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem12 extends GraphicsProgram {
	public void run() {
		GRect myRect = new GRect(200, 200);
		add(myRect, 150, 200);
		
		GRect door = new GRect(50, 100);
		add(door, 150+75, 200+100);
		
		GLine roofLine = new GLine(150, 200, 150+75, 60);
		add(roofLine);
		
		GLine roofLine2 = new GLine(150+100, 60, 200+150, 200);
		add(roofLine2);
	}
}
