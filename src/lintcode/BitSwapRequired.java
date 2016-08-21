package lintcode;

/**
 * 如把31转换为14，需要改变2个bit位。
 * 
 * (31)10=(11111)2
 * 
 * (14)10=(01110)2
 * 
 * @author Administrator
 *
 */
public class BitSwapRequired {
	public static void main(String[] args) {

		int x = 31;
		int y = 14;

		System.out.println(bitSwapRequired(x, y));
	}

	public static int bitSwapRequired(int a, int b) {
		Integer aa = new Integer(a);
		Integer bb = new Integer(b);
		String sa = Integer.toBinaryString(aa);
		String sb = Integer.toBinaryString(bb);
		String sfa = String.format("%32s", sa).replace(' ', '0');
		String sfb = String.format("%32s", sb).replace(' ', '0');

		int count = 0;
		for (int i = 0; i < 32; i++) {
			if (sfa.charAt(i) != sfb.charAt(i)) {
				count++;
			}
		}
		return count;
	}
}
