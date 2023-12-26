package problemSet;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

import acm.program.ConsoleProgram;

public class Test extends ConsoleProgram {
	public void run() {
		int sum = 0;
		
		try {
			File file = new File("inputs.txt");
			Scanner reader = new Scanner(file);
			while (reader.hasNextLine()) {
				String line = reader.nextLine();
				String substr = line.substring(line.indexOf(':') + 2);
				String[] results = substr.split("; ");
				sum += countPower(results);
			}
			println(sum);
			reader.close();
		} catch (FileNotFoundException e) {
			println(e);
		}
	}

	private int countPower(String[] result) {
		int minRed = 1;
		int minGreen = 1;
		int minBlue = 1;
		for (int j = 0; j < result.length; j++) {
			String[] singleRes = result[j].split(", ");
			for (int i = 0; i < singleRes.length; i++) {
				String str = singleRes[i];
				if (str.contains("red")) {
					int redCount = Integer.parseInt(str.replace(" red", ""));
					if (redCount > minRed) {
						minRed = redCount;
					}
				} if (str.contains("green")) {
					int greenCount = Integer.parseInt(str.replace(" green", ""));
					if (greenCount > minGreen) {
						minGreen = greenCount;
					}
				} if (str.contains("blue")) {
					int blueCount = Integer.parseInt(str.replace(" blue", ""));
					if (blueCount > minBlue) {
						minBlue = blueCount;
					}
				}
			}
			println (minRed + " " + minGreen + " " + minBlue);
		}
		return minGreen * minBlue * minRed;
	}
}