package huawei;

/**
 * д��һ�����򣬽���һ������ĸ�������Լ��ո���ɵ��ַ����� ��һ���ַ���Ȼ����������ַ����к��и��ַ��ĸ����������ִ�Сд�� //ABCDEF A
 * 
 * @author Administrator
 *
 */

public class CountChar {
	public static void main(String[] args) {
		CountChar cc = new CountChar();

		System.out.println(cc.CountChar("ABC ./DAE", 'a'));

	}

	public int CountChar(String str, char c) {
		int count = 0;
		String str1 = str.toLowerCase();

		for (int i = 0; i < str1.length(); i++) {
			if (Character.toLowerCase(c) == str1.charAt(i) || Character.toLowerCase(c) == str1.charAt(i)) {
				count++;
			}
		}
		return count;
	}
}
