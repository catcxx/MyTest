public class TestFor {
	public static void main(String[] args) {
		char[] str = new char[]{'a','b','v'};
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]);
		}
		System.out.println();
		for (char myStr : str) {
			System.out.print(myStr);
		}

	}
}
