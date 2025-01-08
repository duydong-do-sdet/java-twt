package tutorial;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class J_10_Map {

	public static void main(String[] args) {
		// HashMap
		Map<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Dong");
		hm.put(2, "1310");
		hm.put(3, "Java");
		hm.put(4, "Selenium");
		hm.put(5, "SDET");

		System.out.println(hm);
		System.out.println(hm.get(3));
		System.out.println(hm.containsValue("Java"));

		// TreeMap
		Map<String, String> tm = new TreeMap<String, String>();
		tm.put("Java", "LTS");
		tm.put("Selenium", "WebDriver");
		tm.put("Dong", "SDET");

		System.out.println(tm);
		System.out.println(tm.get("Dong"));
		System.out.println(tm.containsValue("SDET"));

		// Example
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		String str = "Hello, my name is Dong";

		for (char c : str.toCharArray()) {
			if (m.containsKey(c)) {
				int old = (int) m.get(c);
				m.put(c, old + 1);
			} else {
				m.put(c, 1);
			}
		}

		System.out.println(m);
	}

}
