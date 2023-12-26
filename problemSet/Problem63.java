package problemSet;

import java.util.HashMap;
import java.util.Map;

import acm.program.ConsoleProgram;

public class Problem63 extends ConsoleProgram {
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
		
		println(findMax(map));
	}
	
	private String findMax(Map<String,Integer> map) {
		int maxCount = 0;
		String mostPopular = "";
		
		for (String name: map.keySet()) {
			if (map.get(name) > maxCount) {
				maxCount = map.get(name);
				mostPopular = name;
			}
		}
		
		return mostPopular;
	}
}