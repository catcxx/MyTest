package comparetest;

import java.util.Arrays;
import java.util.Comparator;

public class SampleComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		return toInt(o1) - toInt(o2);
	}

	private int toInt(Object o) {
		String str = (String) o;
		str = str.replaceAll("һ", "1");
		str = str.replaceAll("��", "2");
		str = str.replaceAll("��", "3");
		//
		return Integer.parseInt(str);
	}

	/**
	 * ���Է���
	 */
	public static void main(String[] args) {
		String[] array = new String[] { "һ��", "��", "��" };
		Arrays.sort(array, new SampleComparator());
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
