package problemSet;
import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem22 extends GraphicsProgram {
	private static final int TILE_WIDTH = 40;
	private static final int TILE_HEIGHT = 40;
	
	public void run() {
		for (int i=0; i<8; i++) {
			for (int j=0; j<8; j++) {
				GRect tile = new GRect(TILE_WIDTH, TILE_HEIGHT);
				if ((i+j) % 2 == 1) { //I'm proud of this one
					tile.setFilled(true);
					tile.setFillColor(Color.black);
				}
				add(tile, i*TILE_WIDTH, j*TILE_HEIGHT);
			}
		}
	}
}
