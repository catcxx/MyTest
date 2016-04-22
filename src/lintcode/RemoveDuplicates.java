package lintcode;
/**
 * 给定一个排序数组，在原数组中删除重复出现的数字，使得每个元素只出现一次，并且返回新的数组的长度。

不要使用额外的数组空间，必须在原地没有额外空间的条件下完成。
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

		// 使数组元素被覆盖，将相同的元素删除
		for (int i = 1; i < nums.length; i++) {
			if ((nums[i] != nums[i - 1])) {
				nums[k++] = nums[i];
			}
		}
		for (int j=0; j < k; j++) {
		System.out.println(nums[j]);
		}
		// 将A后面的位置设置为-1
		for (int i = k; i < nums.length; i++) {
			nums[i] = -1;
		}
		return k ;
	}
}
