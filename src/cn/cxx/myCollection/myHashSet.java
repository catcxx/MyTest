package cn.cxx.myCollection;

import java.util.HashMap;

public class myHashSet {
	HashMap map;
	private static final Object PRESENT = new Object();

	public myHashSet() {
		map = new HashMap();

	}

	public void add(Object o) {
		map.put(o, PRESENT);// set no repeat,by using map key no repeat

	}

	public int size() {
		return map.size();

	}

	public void remove(Object o) {

	}

	public static void main(String[] args) {
		myHashSet s = new myHashSet();
		s.add("aa");
		s.add("bb");
		s.add(new String("bb"));// override
		System.out.println(s.size());
	}
}
