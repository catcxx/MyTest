package suanfa;

import java.util.*;

public class MaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, -2, 4, 8, -4, 7, -1, -5 };
		System.out.println(getMaxSum(array, array.length));
	}

	/**
	 * 求最大子数组之和
	 * 
	 * @param A
	 * @param n
	 * @return
	 */
	public static int getMaxSum(int[] A, int n) {
		// write code here
		int maxSum = 0;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			sum += A[i];
			if (sum > maxSum) {
				maxSum = sum;
			} else if (sum < 0) {
				sum = 0;
			}
		}
		return maxSum;
	}
}
