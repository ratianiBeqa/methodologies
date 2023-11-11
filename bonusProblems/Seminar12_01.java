package bonusProblems;

import java.awt.Color;
import java.awt.Font;

import acm.graphics.*;
import acm.program.*;
import acm.util.RandomGenerator;

public class Seminar12_01 extends GraphicsProgram {
	RandomGenerator rgen = RandomGenerator.getInstance();
	String coinLabelString = "Number of coin flips: ";
	String headsLabelString = "Number of heads: ";
	String tailsLabelString = "Number of coin flips: ";
	GLabel coinLabel = new GLabel(coinLabelString);
	GLabel headsLabel = new GLabel(headsLabelString);
	GLabel tailsLabel = new GLabel(tailsLabelString);
	int flipCount = 0;
	int headsCount = 0;
	int tailsCount = 0;

	public void run() {
		double W = getWidth();
		double H = getHeight();
		coinLabel = new GLabel("Number of coin flips: ");
		add(coinLabel, W - coinLabel.getWidth() - 40, coinLabel.getAscent());
		headsLabel = new GLabel("Number of heads: ");
		add(headsLabel, W - coinLabel.getWidth() - 40, coinLabel.getAscent() * 2);
		tailsLabel = new GLabel("Number of tails: ");
		add(tailsLabel, W - coinLabel.getWidth() - 40, coinLabel.getAscent() * 3);
		
		while (true) {
			waitForClick();
			boolean result = flipResult();
			updateTexts(result, W);
		}
	}

	private void updateTexts(boolean result, double W) {
		println(result);
		if (result) {
			headsCount++;
		} else {
			tailsCount++;
		}
		flipCount++;
		println(coinLabel);
		coinLabel.setLabel(coinLabelString + flipCount);
		headsLabel.setLabel(headsLabelString + headsCount);
		tailsLabel.setLabel(tailsLabelString + tailsCount);
	}

	private boolean flipResult() {
		return rgen.nextBoolean();
	}
}
