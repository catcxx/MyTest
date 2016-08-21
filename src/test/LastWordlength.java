package test;

public class LastWordlength {

	public static int getlength(String str) {
		// write code here
		int len = 0;
		String strs[] = str.split(" ");

		if (strs.length - 1 >= 0) {

			len = strs[strs.length - 1].length();
		}
		return len;
	}

	public static void main(String[] args) {
		String str = " hellggo ghh";

		System.out.println(LastWordlength.getlength(str));
	}
}
