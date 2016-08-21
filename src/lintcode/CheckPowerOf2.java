package lintcode;

/**
 * 用 O(1) 时间检测整数 n 是否是 2 的幂次。
 * 
 * @author Administrator
 *
 */
public class CheckPowerOf2 {
	public static void main(String args[]) {

		CheckPowerOf2 fm = new CheckPowerOf2();

		System.out.print(fm.checkPowerOf2(0));

	}

	public boolean checkPowerOf2(int n) {
		if (n <= 0) {
			return false;
		}
		if ((n & (n - 1)) == 0) {
			return true;
		} else {
			return false;
		}
	}
}
