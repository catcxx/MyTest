package cn.cxx.myCollection;

import java.util.HashMap;
import java.util.Map;

/*
 * test map
 */
public class testmap {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("w", new Wife("hj"));// key,,value
		map.put("s", new Wife("pl"));
		map.put("k", new Wife("pll"));

		Wife w = (Wife) map.get("w");// get value via key
		map.remove("w");// remove key and value,
		System.out.println(w.name);
		System.out.println(map.size());

		System.out.println(map.containsKey("s"));// containsKey
		System.out.println(map.containsValue(w));
		map.clear();

	}
}

class Wife {
	String name;

	public Wife(String name) {
		this.name = name;
	}
}