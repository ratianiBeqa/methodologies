package problemSet;

import acm.program.ConsoleProgram;

public class Problem47 extends ConsoleProgram {

    public void run() {
    	String text = readLine("Enter text: ");
    	
    	if (isPalindrome(text)) {
    		println(text + " is a palindrome");
    	} else {
    		println(text + " is not a palindrome");
    	}
    }

    public boolean isPalindrome(String text) {
    	String reversed = "";
    	for (int i = text.length() - 1; i >= 0; i--) {
    		reversed += text.charAt(i);
    	}
    	if (reversed.equals(text)) {
    		return true;
    	}
    	return false;
    }
}