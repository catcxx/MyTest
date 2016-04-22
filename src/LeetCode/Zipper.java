package LeetCode;

import java.util.HashMap;

/**
 * 利用字符重复出现的次数，编写一个方法， 实现基本的字符串压缩功能。比如， 字符串“aabcccccaaa”经压缩会变成“a2b1c5a3”。
 * 若压缩后的字符串没有变短，则返回原先的字符串
 * 
 * @author Administrator
 *
 */
public class Zipper {

	public static void main(String[] args) {
		Zipper zi = new Zipper();
		// zi.zipString("aabcccccaaa");
		System.out.println(zi.zipString("aabcccccaaa"));
	}

	public String zipString(String iniString) {

		StringBuffer result = new StringBuffer();

		// 计算字符串长度
		final int count = iniString.length();

		// 取第一个字符
		char c1 = iniString.charAt(0);

		// 连续字符的个数
		int sum = 1;
		for (int i = 1; i < count; i++) {
			// 循环取字符
			char c2 = iniString.charAt(i);

			// 把前一个字符和当前字符比较
			if (c1 == c2) {
				// 相同的只个数加一
				sum++;
				continue;
			}

			// 拼接字符
			result.append(c1).append(sum);

			// 当前字符变为前一字符
			c1 = c2;

			// 个数清零
			sum = 1;
		}

		// 加上最后一个字符及个数
		result.append(c1).append(sum);

		if (result.length() < iniString.length()) {
			return result.toString();
		} else {
			return iniString;
		}
	}

}
