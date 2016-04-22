package lintcode;

import java.util.regex.Pattern;

public class IsPalindrome {
	public static void main(String[] args) {

		String str = "race a car";// A man, a plan, a canal: Panama
		IsPalindrome ip = new IsPalindrome();

		System.out.println(ip.isPalindrome(str));
	}

	public boolean isPalindrome(String s) {

		String[] it = Pattern.compile("[[\\p{P}]||[\\s+]]").split(s);
		if (s.length() == 0||s==null) {
			return true;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < it.length; i++) {
			sb.append(it[i]);
		}

		for (int j = 0; j < sb.length(); j++) {
			sb.substring(j, j + 1).toLowerCase();
		}
		int low = 0;
		int high = sb.length() - 1;
		while (low < high) {
			if (Character.toLowerCase(sb.charAt(low)) != Character
					.toLowerCase(sb.charAt(high))) {
				return false; // Not a palindrome
			}
			low++;
			high--;
		}
		return true;
	}
}
