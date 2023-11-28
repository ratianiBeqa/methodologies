package problemSet;

import acm.program.ConsoleProgram;

public class Problem51 extends ConsoleProgram {

    public void run() {
    	String text = readLine("Enter text: ");
    	println(removeDuplicates(text));
    }
    
    private String removeDuplicates(String text) {
    	String ans = "";
    	for (int i = 0; i < text.length(); i++) {
    		if (isFirstOccurance(text, text.charAt(i), i)) {
    			ans += text.charAt(i);
    		}
    	}
    	return ans;
    }
    
    private boolean isFirstOccurance(String text, char c, int curIndex) {
    	return text.indexOf(c) == curIndex;
    }
}