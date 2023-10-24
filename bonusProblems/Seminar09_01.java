package bonusProblems;

import acm.program.ConsoleProgram;

public class Seminar09_01 extends ConsoleProgram {
	public void run() {
		int a = readInt("Enter a: ");
		int b = readInt("Enter b: ");
		
		int gcd = euclideanGCD(a, b);
		println(gcd);
	}
	
	private int euclideanGCD(int x, int y) {
		int a = x;
		int b = y;

		while(b != 0) {
			int  r = a % b;
			a = b;
			b = r;
		}
		
		return a;
	}
}
