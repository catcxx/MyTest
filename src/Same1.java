/**
 * ���������ַ��������д����ȷ������һ���ַ������ַ��������к��ܷ�����һ���ַ���������涨��СдΪ��ͬ�ַ����ҿ����ַ����ص�ո�
 * ����һ��string stringA��һ��string
 * stringB���뷵��һ��bool�����������Ƿ��������к����ͬ����֤�����ĳ��ȶ�С�ڵ���5000��
 * 
 * @author Administrator
 *
 */
public class Same1 {

	public static void main(String[] args) {
		Same sm = new Same();
		// sm.checkSam("This is nowcoder","is This nowcoder");
		System.out.println(sm.checkSam("This is nowcoder", "is This nowcoder"));

	}

	public boolean checkSam(String stringA, String stringB) {

		if (stringA.length() != stringB.length()) {
			return false;
		}
		int[] strA = new int[256];
		int[] strB = new int[256];
		for (int i = 0; i < stringA.length(); i++) {
			strA[stringA.charAt(i)]++;
			strB[stringB.charAt(i)]++;
		}
		for (int i = 0; i < 256; i++) {
			if (strA[i] != strB[i]) {
				return false;
			}
		}
		return true;
	}

}
