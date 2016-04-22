package lintcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class minSubArray {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(1);
		nums.add(2);
		nums.add(1);
		minSubArray msa = new minSubArray();
		
		System.out.println(msa.minSubArray(nums));

	}
	

	public int minSubArray(ArrayList<Integer> nums) {
		ArrayList<Integer> numpo = new ArrayList<Integer>();
		ArrayList<Integer> numne = new ArrayList<Integer>();
		
		for(int i =0;i<nums.size();i++){
			if(nums.get(i)<0){
				numne.add(nums.get(i));
			}else{
				numpo.add(nums.get(i));
			}
		}
		
		int min=0;
		if(numne.size()>0){
			for(int i =0;i<numne.size();i++){
			min=min+numne.get(i);
			}
			return min;
		}else{
			min=numpo.get(0);
			for(int i =0;i<numpo.size();i++){
				if(min>numpo.get(i)){
					min=numpo.get(i);
				}
			}
			return min;
		}
		
		
	}

}
