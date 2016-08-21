package mytest;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Demo {
	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat f = new SimpleDateFormat("今天是" + "yyyy年MM月dd日 E kkmmss");
		System.out.println(f.format(now));

		f = new SimpleDateFormat("a hh点mm分ss秒");
		System.out.println(f.format(now));
	}
}
