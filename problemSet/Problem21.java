package problemSet;
import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem21 extends GraphicsProgram {
	public void run() {
		double w = getWidth();
		double h = getHeight();
		double tileWidth = w / 10;
		double tileHeight = h / 10;

		for (int i=0; i<10; i++) {
			GLine line = new GLine(i*tileWidth, 0, i*tileWidth, h);
			add(line);
		}
		
		for (int i=0; i<10; i++) {
			GLine line = new GLine(0, i*tileHeight, w, i*tileHeight);
			add(line);
		}
	}
}
