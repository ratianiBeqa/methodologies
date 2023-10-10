import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem12 extends GraphicsProgram {
	public void run() {
		int width = getWidth();
		int height = getHeight();
		GRect myRect = new GRect(100, 200);
		add(myRect, width/2 - 50, width/2 + 50);
	}
}
