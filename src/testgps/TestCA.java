package testgps;

import java.util.Calendar;
import java.util.TimeZone;

public class TestCA {
	public static void main(String[] args) {

		// ָ����������������ʱ��
		Calendar cc = Calendar.getInstance(TimeZone.getTimeZone("GMT+8"));
		int year = cc.get(Calendar.YEAR);

		// �·��Ǵ�0��ʼ�����ģ����Դ˴����м�1
		int month = cc.get(Calendar.MONTH) + 1;
		int day = cc.get(Calendar.DAY_OF_MONTH);

		int hour_24 = cc.get(Calendar.HOUR_OF_DAY);// 24Сʱ��

		int minute = cc.get(Calendar.MINUTE);
		int second = cc.get(Calendar.SECOND);

		// ���һ������һ�ܵĵ�һ�������գ�
		int weekday = cc.get(Calendar.DAY_OF_WEEK) - 1;

		// 24Сʱ�����
		System.out.println(
				year + "-" + month + "-" + day + " " + hour_24 + ":" + minute + ":" + second + " ����" + weekday);
	}
}