package problemSet;

import acm.program.ConsoleProgram;

public class Problem48 extends ConsoleProgram {

    public void run() {
    	String text = readLine("Enter text: ");
    	getOccurances(text);
    }

    private void getOccurances(String text) {
    	String doneChars = "";
    	for (int i = 0; i < text.length(); i++) {
    		char curChar = text.charAt(i);
    		if (firstOccurance(doneChars, curChar)) {
    			int count = countOccurances(text, curChar);
    			println(curChar + ": " + count);
    			doneChars += curChar;
    		}
    	}
    }
    
    private int countOccurances(String text, char character) {
    	int count = 0;
    	for (int i = 0; i < text.length(); i++) {
    		if (character == text.charAt(i)) {    			
    			count++;
    		}
    	}
    	return count;
    }
    
    private boolean firstOccurance(String doneChars, char curChar)  {
    	for (int i = 0; i < doneChars.length(); i++) {
    		if (curChar == doneChars.charAt(i)) {
    			return false;
    		}
    	}
    	return true;
    }
}