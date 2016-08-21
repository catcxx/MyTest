package cn.cxx.myCollection;

import java.util.HashMap;
import java.util.Map;

/*
 * my map
 * key->value
 */
public class map01 {

	myEntry[] arr = new myEntry[80];
	int size;

	public void put(Object key, Object value) {
		myEntry e = new myEntry(key, value);
		for (int i = 0; i < size; i++) {// key equals
			if (arr[i].key.equals(key)) {
				arr[i].value = value;
				return;
			}
		}
		arr[size++] = e;
	}

	public Object get(Object key) {
		for (int i = 0; i < size; i++) {
			if (arr[i].key.equals(key)) {
				return arr[i].value;
			}
		}
		return null;
	}

	public boolean containskey(Object key) {
		for (int i = 0; i < size; i++) {
			if (arr[i].key.equals(key)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		map01 map = new map01();
		System.out.println(map.toString());// System.out.println(map);
		map.put("w", new Wife("hj"));// key,,value
		map.put("w", new Wife("pl"));//
		map.put("s", new Wife("pl"));
		Wife w = (Wife) map.get("w");// get value via key

		System.out.println(w.name);
		System.out.println(map.size);

		System.out.println(map.containskey("s"));// containsKey

	}
}

class myEntry {
	Object key;
	Object value;

	public myEntry(Object key, Object value) {
		super();
		this.key = key;
		this.value = value;
	}

}