package LeetCode;

import java.util.HashSet;
import java.util.Set;

//better than mine
public class isHappy2 {

	public static void main(String[] args) {
		isHappy ih = new isHappy();
		// ih.isHappy(20);
		System.out.println("id happy number:" + ih.isHappy(20));
	}

	public boolean isHappy(int n) {
		if (n <= 0)
			return false;
		long ln = n;
		Set<Long> set = new HashSet<Long>();

		while (ln <= Integer.MAX_VALUE) {
			if (set.contains(ln))
				return false;
			else
				set.add(ln);
			ln = digitSquare(ln);
			// System.out.println("--------"+ln);
			if (ln == 1)
				return true;
		}
		return false;
	}

	private long digitSquare(long ln) {
		long sum = 0;
		while (ln != 0) {
			sum += Math.pow(ln % 10, 2);
			ln /= 10;
		}
		return sum;
	}

}
