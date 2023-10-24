package bonusProblems;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Seminar08_02 extends GraphicsProgram {
	public void run() {
		int windowWidth = getWidth();
		int startPosition = 0;
		for (int i=1; i<=99999; i++) {
			int width = fib(i) * 10;
			GRect rect = new GRect(startPosition, 0, width, width);
			add(rect);
			startPosition += width;
			if (windowWidth <= startPosition + fib(i+1) * 10) {
				break;
			}
		}
	}
	
	private int fib(int n) {
		int ans = 0;
		int prev = 1, prevPrev = 1;

		if (n == 1 || n == 2) {
			return 1;
		} else {
			for (int i=0; i<n-2; i++) {
				ans = prev + prevPrev;
				prevPrev = prev;
				prev = ans;
			}
			return ans;
		}
	 }
}
