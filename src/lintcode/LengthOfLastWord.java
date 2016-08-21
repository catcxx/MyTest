package lintcode;

public class LengthOfLastWord {
	public static void main(String[] args) {
		String s = "Hello World ";
		LengthOfLastWord low = new LengthOfLastWord();
		int l = low.lengthOfLastWord(s);

		System.out.println(l);

	}

	public int lengthOfLastWord(String s) {
		// if (s.endsWith(" ")) {
		// return 0;
		// }
		String ss[] = s.split(" ");

		int slenth = ss[ss.length - 1].length();
		return slenth;
	}

}
