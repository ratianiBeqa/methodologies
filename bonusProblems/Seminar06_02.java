package bonusProblems;
import acm.program.ConsoleProgram;

public class Seminar06_02 extends ConsoleProgram {
//	public void run() {
//		double a = readDouble("Enter num 1: ");
//		double b = readDouble("Enter num 2: ");
//		String operator = readLine("Enter operator: ");
//		switch(operator) {
//		  case "+":
//			  println(a + b);
//			  break;
//		  case "-":
//			  println(a - b);
//			  break;
//		  case "*":
//			  println(a * b);
//			  break;
//		  case "/":
//			  println(a / b);
//			  break;
//		  default:
//		    println("Something's wrong");
//		}
//	}
	
	public void run() {
		double a = readDouble("Enter num 1: ");
		double b = readDouble("Enter num 2: ");
		String operator = readLine("Enter operator: ");
		if (operator.equals("+")) {
			println(a + b);
		} else if (operator.equals("-")) {
			println(a - b);
		} else if (operator.equals("*")) {
			println(a * b);
		} else if (operator.equals("/")) {
			println(a / b);
		}
	}
}