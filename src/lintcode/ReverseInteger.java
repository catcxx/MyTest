package lintcode;

public class ReverseInteger {
	public static void main(String[] args) {

		int num = -123;
		ReverseInteger re = new ReverseInteger();
		int res = re.reverseInteger(num);

		System.out.println(res);
	}

	public int reverseInteger(int n) {
		Integer number = new Integer(n);
		int re;
		if (n < 0) {
			number = number * -1;
		}
		StringBuilder sb = new StringBuilder(number.toString());
		StringBuilder bs = sb.reverse();
		Long l = Long.parseLong(bs.toString());
		if (n < 0) {
			l = l * -1;
		}
		if (l > Integer.MAX_VALUE || l < Integer.MIN_VALUE) {
			return 0;
		} else {
			re = new Long(l).intValue();
		}
		return re;
	}
}
