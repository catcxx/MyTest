package testgps;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date d1 = sdf.parse("2011-06-01 23:53:54");
//		Date d2= sdf.parse("12:28:12");
////		long l1 = 12 * 60 * 60  + 27 * 60  + 12 ;
////		System.out.println("�����Ľ��:" + l1);
//		long s1 =  d1.getTime();
//		long s2 =  d2.getTime();
		System.out.println("gettime:" + d1.getTime());
////		System.out.println("��ʱ��ԭ��Ĳ�ֵ:" + s);
////		long rs = d.getTime() + s;// ��ֵ��:28800000
//		if(s2-s1>0){
////			System.out.println("��Ҫ�Ľ��:" + rs);
//			System.out.println("��Ҫ�Ľ��:" );
//		}
		
		
//		String str = "12:27:12";
//		String sb = str.replaceAll(":", "");
//		System.out.println("��Ҫ�Ľ��:" +sb);
		
	}
}
