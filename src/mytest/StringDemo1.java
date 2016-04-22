package mytest;

import java.util.ArrayList;
import java.util.List;

public class StringDemo1 {
	public static void main(String[] args) {
		List<String> handler = new ArrayList<String>();
		for (int i = 0; i < 1000; i++) {
			HugeStr h = new HugeStr();
			ImprovedHugeStr h1 = new ImprovedHugeStr();
			handler.add(h.getSubString(1, 5));
			handler.add(h1.getSubString(1, 5));
		}
		System.out.print("///// ");
	}

	static class HugeStr {
		private String str = new String(new char[800000]);

		public String getSubString(int begin, int end) {
			return str.substring(begin, end);//new String(offset+beginIndex,endIndex-beginIndex,value);
		}
	}

	static class ImprovedHugeStr {
		private String str = new String(new char[10000000]);

		public String getSubString(int begin, int end) {
			return new String(str.substring(begin, end));
		}
	}
}