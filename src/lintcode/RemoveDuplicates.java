package lintcode;
/**
 * ����һ���������飬��ԭ������ɾ���ظ����ֵ����֣�ʹ��ÿ��Ԫ��ֻ����һ�Σ����ҷ����µ�����ĳ��ȡ�

��Ҫʹ�ö��������ռ䣬������ԭ��û�ж���ռ����������ɡ�
 * @author Administrator
 *
 */
public class RemoveDuplicates {
	public static void main(String args[]) {
		int[] nums = { -10, 0, 1,2, 2, 3,3 };
		RemoveDuplicates rd = new RemoveDuplicates();

		System.out.print(rd.removeDuplicates(nums));

	}

	public int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int k = 1;

		// ʹ����Ԫ�ر����ǣ�����ͬ��Ԫ��ɾ��
		for (int i = 1; i < nums.length; i++) {
			if ((nums[i] != nums[i - 1])) {
				nums[k++] = nums[i];
			}
		}
		for (int j=0; j < k; j++) {
		System.out.println(nums[j]);
		}
		// ��A�����λ������Ϊ-1
		for (int i = k; i < nums.length; i++) {
			nums[i] = -1;
		}
		return k ;
	}
}
