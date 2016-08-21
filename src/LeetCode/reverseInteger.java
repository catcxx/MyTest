package LeetCode;

public class reverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseInteger ri = new reverseInteger();
		// ri.reverse(123);
		System.out.println(ri.reverse(-2147483648));// 1534236460 1534236469
													// -2147483647

	}

	// public int reverse(int x) {
	// int result = 0;
	// while (x != 0) {
	// result = result * 10 + x % 10; // 每一次都在原来结果的基础上变大10倍，再加上余数 
	// x = x / 10; // 对x不停除10 
	// }
	// // return result; 
	//  }

	public int reverse(int x) {

		if (x < 0) {

			long xx = x;
			xx = xx * (-1);
			if (xx > Integer.MAX_VALUE) {
				// System.out.println("///////");
				return 0;
			}

			Integer num = new Integer(x);
			num = -num;
			String s = num.toString();
			StringBuilder sb = new StringBuilder(s);
			sb.reverse();
			String ss = sb.toString();

			if (Long.parseLong(ss) > Integer.MAX_VALUE) {
				// System.out.println("///////");
				return 0;
			}
			int i = -Integer.parseInt(ss);
			return i;
		}

		else {

			Integer num = new Integer(x);
			String s = num.toString();
			StringBuilder sb = new StringBuilder(s);
			sb.reverse();
			String ss = sb.toString();

			if (Long.parseLong(ss) > Integer.MAX_VALUE) {
				// System.out.println("///////");
				return 0;
			}

			return Integer.parseInt(ss);
		}

	}

}
