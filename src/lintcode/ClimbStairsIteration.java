package lintcode;

public class ClimbStairsIteration {

	public static void main(String[] args) {
		ClimbStairsIteration csd = new ClimbStairsIteration();
		int n = 5;
		System.out.println(csd.climbStairsDD(n));
	}

	public int climbStairsDD(int n) {

		if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 2;
		}
		int a = 1;
		int b = 2;
		int c = 0;
		for (int i = 3; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;

	}

}
