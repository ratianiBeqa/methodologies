import acm.graphics.*;
import acm.program.GraphicsProgram;
import java.awt.Color;

public class Problem14 extends GraphicsProgram {
	public void run() {
		int w = getWidth();
		int h = getHeight();
		GLine horizontal = new GLine(0, h/2, w, h/2);
		add(horizontal);
	}
}
