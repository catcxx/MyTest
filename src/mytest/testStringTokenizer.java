package mytest;

import java.util.StringTokenizer;

public class testStringTokenizer {
	public static void main(String[] args) {
		// StringTokenizer st = new StringTokenizer("this is a test");
		// while (st.hasMoreTokens()) {
		// System.out.println(st.nextToken());
		// }

		String sb = new String("this,is,a,test");
		// String orgStr1 = sb.toString();
		StringTokenizer st = new StringTokenizer(sb, ",");
		while (st.hasMoreTokens()) {
			System.out.println("StringTokenizer:" + st.nextToken());
		}
	}

}
