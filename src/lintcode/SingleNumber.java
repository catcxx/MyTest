package lintcode;

/**
 * ����2*n + 1 �������֣�������һ������֮������ÿ�����־��������Σ��ҵ��������
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
			n = n ^ A[i];// ���
		}

		return n;
	}
}
