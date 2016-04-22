package lintcode;

public class ClimbStairsRecursive {
	public static void main(String[] args) {
		ClimbStairsRecursive cs = new ClimbStairsRecursive();
		int n = 5;
		System.out.println(cs.climbStairsdp(n));
		System.out.println(cs.climbStairs(n));
	}

	public int climbStairs(int n) {
		if (n < 0) {
			return 0;
		} else if (n == 0) {
			return 1;
		} else {
			return climbStairs(n - 1) + climbStairs(n - 2);
		}

	}

	public int climbStairsdp(int n) {
		if (n < 4)
			return n;
		int a = 2, b = 3, c = 5;
		for (int i = 5; i <= n; i++) {
			a = c;
			c = b + c;
			b = a;
		}
		return c;

	}

}
