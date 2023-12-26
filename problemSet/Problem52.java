package problemSet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import acm.program.ConsoleProgram;

public class Problem52 extends ConsoleProgram {
	private static final String FILENAME = "problemSet/Problem52.java";

    public void run() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(FILENAME));
			while (true) {
				String line = reader.readLine();
				if (line == null) {
					break;
				}
				println(line);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}