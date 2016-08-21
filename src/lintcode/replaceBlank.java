package lintcode;

public class replaceBlank {

	public static void main(String[] args) {
		replaceBlank rb = new replaceBlank();
		String str = "Mr John Smith";

		char[] string = str.toCharArray();
		// String s = str.replaceAll("\\s","%20");
		// System.out.println(s);
		System.out.println(rb.replaceBlank(string, 13));
	}

	public String replaceBlank(char[] string, int length) {

		String str = new String(string);
		// System.out.println(str);
		String s = new String(str.replaceAll("\\s+", "%20"));

		// System.out.println(s);

		return s;
	}

}
