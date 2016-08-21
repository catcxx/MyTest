package LeetCode;

public class PowerofTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPowerOfTwo(1));
		System.out.println(isPowerOfTwo(4));
		System.out.println(isPowerOfTwo(5));
	}

	public static boolean isPowerOfTwo(int n) {
		double d = n;
		if (d == 1) {
			return true;
		}
		while (d >= 2) {
			d = d / 2;
			if (d == 1) {
				return true;
			}
		}
		return false;
	}

}
