package problemSet;
import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem13 extends GraphicsProgram {
	public void run() {
		int w = getWidth();
		int h = getHeight();
		GLine horizontal = new GLine(0, h / 2, w, h / 2);
		add(horizontal);
	}
}
