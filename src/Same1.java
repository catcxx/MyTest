/**
 * 给定两个字符串，请编写程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。这里规定大小写为不同字符，且考虑字符串重点空格。
 * 给定一个string stringA和一个string
 * stringB，请返回一个bool，代表两串是否重新排列后可相同。保证两串的长度都小于等于5000。
 * 
 * @author Administrator
 *
 */
public class Same1 {

	public static void main(String[] args) {
		Same sm = new Same();
		// sm.checkSam("This is nowcoder","is This nowcoder");
		System.out.println(sm.checkSam("This is nowcoder", "is This nowcoder"));

	}

	public boolean checkSam(String stringA, String stringB) {

		if (stringA.length() != stringB.length()) {
			return false;
		}
		int[] strA = new int[256];
		int[] strB = new int[256];
		for (int i = 0; i < stringA.length(); i++) {
			strA[stringA.charAt(i)]++;
			strB[stringB.charAt(i)]++;
		}
		for (int i = 0; i < 256; i++) {
			if (strA[i] != strB[i]) {
				return false;
			}
		}
		return true;
	}

}
