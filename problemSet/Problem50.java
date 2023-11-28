package problemSet;

import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Problem50 extends ConsoleProgram {

    public void run() {
    	String text = readLine("Enter text: ");
    	int count = 0;
    	
    	StringTokenizer tokenizer = new StringTokenizer(text, " ,.\t\n!;:");
    	while(tokenizer.hasMoreTokens()) {
    		tokenizer.nextElement();
    		count++;
    	}
    	
    	println("Word count: " + count);
    }
}