package problemSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import acm.program.ConsoleProgram;

public class Problem64 extends ConsoleProgram {
	private static final String SENTINEL = "";

	public void run() {
		Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		while (true) {
			String line = readLine("Enter names: ");
			if (line.equals(SENTINEL)) {
				break;
			}
			String name = line.substring(line.indexOf(" "));
			String friendName = line.substring(0, line.indexOf(" "));
			if (!map.containsKey(name)) {
				ArrayList<String> friends = new ArrayList<String>();
				friends.add(friendName);
				map.put(name, friends);
			} else {
				ArrayList<String> friends = map.get(name);
				if (!friends.contains(friendName)) {
					friends.add(friendName);
					map.put(name, friends);
				}
			}
		}
		
		println(map);
	}
}