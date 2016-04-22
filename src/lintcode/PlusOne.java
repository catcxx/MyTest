package lintcode;
/**
 * 给定一个非负数，表示一个数字数组，在该数的基础上+1，返回一个新的数组。

该数字按照大小进行排列，最大的数在列表的最前面。
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
