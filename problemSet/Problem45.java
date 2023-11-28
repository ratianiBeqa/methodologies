package problemSet;

import acm.program.ConsoleProgram;

public class Problem45 extends ConsoleProgram {

	public void run() {
		String text = readLine("Enter text: ");
		char symbol = readLine("Enter character: ").charAt(0);
		println((countCharacterApperance(text, symbol)));
	}

	private int countCharacterApperance(String text, char symbol) {
		int count = 0;

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == symbol) {
				count++;
			}
		}

		return count;
	}
}