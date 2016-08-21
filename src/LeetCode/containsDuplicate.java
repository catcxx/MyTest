package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		containsDuplicate cd = new containsDuplicate();
		int[] nums = { 1, 2, 1, 4 };

		System.out.println(cd.containsDuplicate(nums));
	}

	public boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		int count = nums.length;
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		// System.out.println("///////"+set);
		if (set.size() < count) {
			return true;
		}

		return false;

	}

}
