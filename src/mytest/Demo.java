package mytest;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Demo {
	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat f = new SimpleDateFormat("������" + "yyyy��MM��dd�� E kkmmss");
		System.out.println(f.format(now));

		f = new SimpleDateFormat("a hh��mm��ss��");
		System.out.println(f.format(now));
	}
}
