package lintcode;

import java.util.Arrays;

/**
 * 去判断两个字符串是否是颠倒字母顺序构成的
 * 
 * @author Administrator
 *
 */

public class Anagram {
	public static void main(String[] args) {
		String s = "abcda";
		String t = "dcabd";
		Anagram agm = new Anagram();
		boolean b = agm.anagram(s, t);

		System.out.println(b);

	}

	public boolean anagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		} else {
			char[] c1 = s.toCharArray();
			char[] c2 = t.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			String s1 = Arrays.toString(c1);
			String s2 = Arrays.toString(c2);
			if (s1.equals(s2)) {
				return true;
			} else {
				return false;
			}
		}

	}
}
