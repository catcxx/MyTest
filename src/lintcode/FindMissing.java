package lintcode;

import java.util.LinkedList;
import java.util.List;



public class FindMissing {
	public static void main(String args[]) {
		int[] nums = {0,1};
		FindMissing fm = new FindMissing();
		
		System.out.print(fm.findMissing(nums));
		
	}
	
	public int findMissing(int[] nums) {//bug
		
		int n = nums[nums.length-1];
		LinkedList list = new LinkedList();
		int i=0;
		for(int num:nums){
			list.add(num);
		}
		
		for(;i<n;i++){
			if(list.indexOf(i)<0){
				break;
			}
		}
		return i;
    }
}
