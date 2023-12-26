package problemSet;

import java.util.Arrays;

import acm.program.ConsoleProgram;

public class Problem57 extends ConsoleProgram {

	private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
	public void run() {
		println(isAnagram("begini", "ibeing"));
	}

	private boolean isAnagram(String s1, String s2) {
		int[] arr1 = new int[26];
		int[] arr2 = new int[26];
		for (int i = 0; i < ALPHABET.length(); i++) {
			for (int j = 0; j < s1.length(); j++) {
				if (ALPHABET.charAt(i) == s1.charAt(j)) {
					arr1[i]++;
				} if (ALPHABET.charAt(i) == s2.charAt(j)) {
					arr2[i]++;
				}
			}
		}
		return Arrays.equals(arr1, arr2);
	}
}