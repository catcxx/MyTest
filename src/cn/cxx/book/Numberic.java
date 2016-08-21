package cn.cxx.book;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Numberic {
	public static void main(String[] args) {
		Numberic s = new Numberic();
		// Numberic.isNumberic("89887");
		System.out.println(Numberic.isNumberic("8988w7"));
	}

	public static boolean isNumberic(String token) {
		Pattern pattern = Pattern.compile("[0-9]*");
		Matcher isNum = pattern.matcher(token);
		if (isNum.matches()) {
			return true;
		} else {
			return false;
		}
	}

}
