package problemSet;

import acm.program.ConsoleProgram;

public class Problem49 extends ConsoleProgram {

    public void run() {
    	String text = readLine("Enter text: ");
    	println(parseInt(text) + 1); // +1 for test
    }
    
    private int parseInt(String text) {
    	int ans = 0;
    	for (int i = 0; i < text.length(); i++) {
    		int num = parseChar(text.charAt(i));
    		ans *= 10;
    		ans += num;
    	}
    	return ans;
    }
    
    private int parseChar(char c) {
    	return c - '0';
    }
}