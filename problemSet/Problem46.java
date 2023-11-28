package problemSet;

import acm.program.ConsoleProgram;

public class Problem46 extends ConsoleProgram {

    public void run() {
    	String text = readLine("Enter text: ");
    	println("Most frequent: " + mostFrequentChar(text));
    }
    
    private char mostFrequentChar(String text) {
    	int maxCharCount = 0;
    	char curMaxChar = 0;

    	for (int i = 0; i < text.length(); i++) {
    		int curCharCount = countChar(text, text.charAt(i));
    		if (curCharCount > maxCharCount) {
    			maxCharCount = curCharCount;
    			curMaxChar = text.charAt(i);
    		}
    	}
    	
    	return curMaxChar;
    }
    
    private int countChar(String text, char c) {
    	int count = 0;
    	
    	for (int i = 0; i < text.length(); i++) {
    		if (text.charAt(i) == c) {
    			count++;
    		}
    	}
    	
    	return count;
    }
}