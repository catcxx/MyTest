package LeetCode;

import java.util.HashMap;

/**
 * �����ַ��ظ����ֵĴ�������дһ�������� ʵ�ֻ������ַ���ѹ�����ܡ����磬 �ַ�����aabcccccaaa����ѹ�����ɡ�a2b1c5a3����
 * ��ѹ������ַ���û�б�̣��򷵻�ԭ�ȵ��ַ���
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

		// �����ַ�������
		final int count = iniString.length();

		// ȡ��һ���ַ�
		char c1 = iniString.charAt(0);

		// �����ַ��ĸ���
		int sum = 1;
		for (int i = 1; i < count; i++) {
			// ѭ��ȡ�ַ�
			char c2 = iniString.charAt(i);

			// ��ǰһ���ַ��͵�ǰ�ַ��Ƚ�
			if (c1 == c2) {
				// ��ͬ��ֻ������һ
				sum++;
				continue;
			}

			// ƴ���ַ�
			result.append(c1).append(sum);

			// ��ǰ�ַ���Ϊǰһ�ַ�
			c1 = c2;

			// ��������
			sum = 1;
		}

		// �������һ���ַ�������
		result.append(c1).append(sum);

		if (result.length() < iniString.length()) {
			return result.toString();
		} else {
			return iniString;
		}
	}

}
