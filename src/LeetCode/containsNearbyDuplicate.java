package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 给定一个整数数组nums与一个整数k，
 * 当且仅当存在两个不同的下标i和j满足nums[i] = nums[j]
 * 并且| i - j | <= k时返回true，否则返回false。
 * @param args
 */

public class containsNearbyDuplicate {

	public static void main(String[] args) {
		
		containsNearbyDuplicate cnd = new containsNearbyDuplicate();
		int[] nums = {1,2};//
		
		System.out.println(cnd.containsNearbyDuplicate(nums, 2));
	}
	
	
	
	
	/**
	 * 思路分析：这题比较简单，可以直接定义一个长度最大为k的滑动窗口，
	 * 用一个set维护窗口内的数字判断是否出现重复，使用两个指针start和end
	 * 标记滑动窗口的两端，初始都是0，然后end不断进行扩展，扫描元素判断是
	 * 否出现重复元素，直到发现end-start>k, 就开始移动start，并且在set中
	 * 移除对应的元素。如果以为扫描到数组末尾还没有发现重复元素，那就可以
	 * 返回false。时间复杂度和空间复杂度都是O（N）。
	 * @param nums
	 * @param k
	 * @return
	 */
			
	    public boolean containsNearbyDuplicate(int[] nums, int k) {
	        //0842
	        Set<Integer> appearedNum = new HashSet<Integer>();
	        int start = 0, end = 0;
	        for(int i = 0; i < nums.length; i++){
	            if(!appearedNum.contains(nums[i])){
	                appearedNum.add(nums[i]);
	                end++;
	            } else return true;
	            if(end - start  > k) {
	                appearedNum.remove(nums[start]);
	                start++;
	            }
	        }
	        return false;
	        //0848
	    }

	//看不懂
//	public boolean containsNearbyDuplicate(int[] nums, int k) {
//        java.util.Set<Integer> set = new java.util.HashSet<Integer>();
//        for (int i = 0; i < nums.length; i++) {
//                    if (i < k + 1) {
//                            set.add(nums[i]);
//                            if (set.size() < i + 1) {
//                                    return true;
//                            }
//                    } else {
//                            set.remove(nums[i - k - 1]);
//                            set.add(nums[i]);
//                            if (set.size() < k + 1) {
//                                    return true;
//                            }
//                    }
//        }
//        return false;
//}
	
	
//	//Time Limit Exceeded!!
//	public boolean containsNearbyDuplicate(int[] nums, int k) {
//		 	List<Integer> arraylist = new ArrayList<Integer>();
//		 	for(int i=0;i<nums.length;i++) {	//add into arraylist
//		 		arraylist.add(nums[i]);
//		 	}
//		 	
//		 	for(int i=0;i<nums.length;i++) {
//		 		int element = arraylist.get(i);
//		 		arraylist.remove(i);	//remove nums[i]
//		 	if(arraylist.contains(nums[i])){	//contains?
//		 		int in = arraylist.indexOf(nums[i]);
//		 		if(Math.abs(in-i)<=k&&i!=in){	// |i-j|<=k && (i!=j)
//		 			return true;
//		 		}
//		 	}
//		 	arraylist.add(i, element);	//put back nums[i]
//		 	}
//		
//			return false;
//	        
//	    }
	
//	 public boolean containsNearbyDuplicate(int[] nums, int k) {
//		 
//		 for(int i=0;i<nums.length;i++) {
//			 for(int j=i+1;j<Math.min(nums.length, i+k);j++){
//				 if((nums[i]==nums[j])){	//满足nums[i] = nums[j],并且| i - j | <= k时返回true
//					 return true;
//				 }
//			 }
//		 }
//		 
//		 for(int i=nums.length-1;i>=0;i--) {
//			 for(int j=i-1;j>Math.max(0, i-k);j--){
//				 if((nums[i]==nums[j])){
//					 return true;
//				 }
//			 }
//		 }
//			return false;
//	        
//	    }

}
