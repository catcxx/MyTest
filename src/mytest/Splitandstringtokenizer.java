package mytest;

/**
 *  split 算法对每一个字符进行了对比，这样当字符串较大时，需要把整个字符串读入内存
 *  ，逐一查找，找到符合条件的字符，这样做较为耗时。而 StringTokenizer 类允许一个
 *  应用程序进入一个令牌（tokens），StringTokenizer 类的对象在内部已经标识化的字
 *  符串中维持了当前位置。
 */
import java.util.StringTokenizer;

public class Splitandstringtokenizer {
	public static void main(String[] args) {
		String orgStr = null;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 10000; i++) {
			sb.append(i);
			sb.append(",");
		}
		orgStr = sb.toString();
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			orgStr.split(",");
		}
		long end = System.currentTimeMillis();
		System.out.println("split:" + (end - start));

		start = System.currentTimeMillis();
		String orgStr1 = sb.toString();
		StringTokenizer st = new StringTokenizer(orgStr1, ",");
		for (int i = 0; i < 10000; i++) {
			st.nextToken();
		}
		end = System.currentTimeMillis();
		System.out.println("StringTokenizer:" + (end - start));

		start = System.currentTimeMillis();
		String orgStr2 = sb.toString();
		String temp = orgStr2;
		while (true) {
			String splitStr = null;
			int j = temp.indexOf(",");
			if (j < 0)
				break;
			splitStr = temp.substring(0, j);
			temp = temp.substring(j + 1);
		}
		temp = orgStr2;
		end = System.currentTimeMillis();
		System.out.println("substring:" + (end - start));
	}
}