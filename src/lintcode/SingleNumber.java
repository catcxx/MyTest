package lintcode;

/**
 * 给出2*n + 1 个的数字，除其中一个数字之外其他每个数字均出现两次，找到这个数字
 * 
 * @author Administrator
 *
 */
public class SingleNumber {
	public static void main(String args[]) {
		int[] nums = { 1, 2, 2, 1, 3, 4, 3 };
		SingleNumber sn = new SingleNumber();

		System.out.print(sn.singleNumber(nums));

	}

	public int singleNumber(int[] A) {
		if (A.length == 0) {
			return 0;
		}

		int n = A[0];
		for (int i = 1; i < A.length; i++) {
			n = n ^ A[i];// 异或
		}

		return n;
	}
}
