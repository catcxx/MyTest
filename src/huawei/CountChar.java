package huawei;

/**
 * 写出一个程序，接受一个有字母和数字以及空格组成的字符串， 和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。 //ABCDEF A
 * 
 * @author Administrator
 *
 */

public class CountChar {
	public static void main(String[] args) {
		CountChar cc = new CountChar();

		System.out.println(cc.CountChar("ABC ./DAE", 'a'));

	}

	public int CountChar(String str, char c) {
		int count = 0;
		String str1 = str.toLowerCase();

		for (int i = 0; i < str1.length(); i++) {
			if (Character.toLowerCase(c) == str1.charAt(i) || Character.toLowerCase(c) == str1.charAt(i)) {
				count++;
			}
		}
		return count;
	}
}
