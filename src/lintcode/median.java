package lintcode;

import java.util.Arrays;



public class median {

	public static void main(String[] args) {
		median m = new median();
		int[] nums = {4,5,1,2,3};
//		int[] nums = {7, 9, 4, 5};
		
		System.out.println(m.median(nums));

	}
	
	public int median(int[] nums) {
		
		Arrays.sort(nums);
		if(nums.length%2==0){
			return nums[nums.length/2-1];
		}else{
			return nums[(nums.length+1)/2-1];
		}
		

	}

}
