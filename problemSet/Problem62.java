package problemSet;

import java.util.HashMap;
import java.util.Map;

import acm.program.ConsoleProgram;

public class Problem62 extends ConsoleProgram {
	private static final String SENTINEL = "";

	public void run() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		while (true) {
			String name = readLine("Enter names: ");
			if (name.equals(SENTINEL)) {
				break;
			}
			if (!map.containsKey(name)) {
				map.put(name, 1);
			} else {
				int value = map.get(name);
				map.put(name, value + 1);
			}
		}
		
		println(map);
	}
}