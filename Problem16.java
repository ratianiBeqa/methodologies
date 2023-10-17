import acm.program.ConsoleProgram;

public class Problem16 extends ConsoleProgram {
	public void run() {
		int a = readInt("First number: ");
		int b = readInt("Second number: ");
		int c = readInt("Third number: ");
		println(1 / (1/a + 1/b + 1/c));
	}
}
