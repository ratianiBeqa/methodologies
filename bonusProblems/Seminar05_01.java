package bonusProblems;
import java.awt.Color;
import java.awt.Font;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class Seminar05_01 extends GraphicsProgram {
	public void run() {
		int w = getWidth();
		int h = getHeight();
		GLabel text = new GLabel("width: " + w + ", height: " + h);
		Font smallFont = new Font("London", Font.PLAIN, 42);
		text.setFont(smallFont);
		text.setColor(Color.red);
		double textWidth = text.getWidth();
		add(text, w/2 - textWidth/2, h/2);
	}
}
