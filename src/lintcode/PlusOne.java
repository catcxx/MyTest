package lintcode;
/**
 * ����һ���Ǹ�������ʾһ���������飬�ڸ����Ļ�����+1������һ���µ����顣

�����ְ��մ�С�������У����������б����ǰ�档
 * @author Administrator
 *
 */
public class PlusOne {

	public static void main(String[] args) {

		int[] list1 = { 1, 2, 3 };
		PlusOne po = new PlusOne();
		int[] kk = po.plusOne(list1);
		for (int i = 0; i < kk.length; i++) {
			System.out.println(kk[i]);
		}
//		 System.out.println(kk);
	}

	public int[] plusOne(int[] digits) {
		int num = 0;
		for (int i = 0; i < digits.length; i++) {
			num = num + (int) (digits[i] * Math.pow(10, digits.length - 1 - i));
		}
		num++;
		Integer number = new Integer(num);
		String str = number.toString();

		int[] dig = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			String c = str.substring(i, i + 1);
			Integer ic = Integer.parseInt(c);
			dig[i] = ic;
		}

		return dig;
	}
}
