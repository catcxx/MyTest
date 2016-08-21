package lintcode;

public class PartitionArray {
	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4 };
		PartitionArray pa = new PartitionArray();
		int[] res = pa.partitionArray(num);

		System.out.println(res);
	}

	public int[] partitionArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 1) {

			}
		}
		return nums;
	}
}
