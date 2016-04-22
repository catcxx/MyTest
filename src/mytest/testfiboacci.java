package mytest;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class testfiboacci {
	public static HashSet<Integer> fibsetHashSet;
	static {
		fibsetHashSet = new HashSet<Integer>();
		fibsetHashSet.add(0);
		fibsetHashSet.add(1);
		fibsetHashSet.add(2);
		fibsetHashSet.add(3);
		fibsetHashSet.add(5);
		fibsetHashSet.add(8);
		fibsetHashSet.add(13);
		fibsetHashSet.add(21);
		fibsetHashSet.add(34);
		fibsetHashSet.add(55);
		fibsetHashSet.add(89);
	}

	public static boolean isFib(String sub) {

		int count[] = new int[26]; // 全是零

		if (sub.length() == 0)
			return false;

		for (int i = 0; i < sub.length(); i++) {
			char a = sub.charAt(i);
			count[a - 'a'] += 1;
		}
		int diff = 0;
		for (int i = 0; i < 26; ++i) {
			if (count[i] != 0)
				++diff;
		}

		for (int i = 0; i < 26; ++i) {
			if (!fibsetHashSet.contains(diff))
				return false; // 如果不符合
		}
		return true;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		// String string="aabcd";
		TreeSet<String> set = new TreeSet<String>();

		int len = string.length();
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j <= len; j++) {
				String subString = string.substring(i, j);
				if (isFib(subString)) {
					set.add(subString);
				}
			}
		}
		for (String key : set) {
			System.out.println(key);
		}
		// System.out.println(set);
	}
}