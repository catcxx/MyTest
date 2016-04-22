package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * ����һ����������nums��һ������k��
 * ���ҽ�������������ͬ���±�i��j����nums[i] = nums[j]
 * ����| i - j | <= kʱ����true�����򷵻�false��
 * @param args
 */

public class containsNearbyDuplicate {

	public static void main(String[] args) {
		
		containsNearbyDuplicate cnd = new containsNearbyDuplicate();
		int[] nums = {1,2};//
		
		System.out.println(cnd.containsNearbyDuplicate(nums, 2));
	}
	
	
	
	
	/**
	 * ˼·����������Ƚϼ򵥣�����ֱ�Ӷ���һ���������Ϊk�Ļ������ڣ�
	 * ��һ��setά�������ڵ������ж��Ƿ�����ظ���ʹ������ָ��start��end
	 * ��ǻ������ڵ����ˣ���ʼ����0��Ȼ��end���Ͻ�����չ��ɨ��Ԫ���ж���
	 * ������ظ�Ԫ�أ�ֱ������end-start>k, �Ϳ�ʼ�ƶ�start��������set��
	 * �Ƴ���Ӧ��Ԫ�ء������Ϊɨ�赽����ĩβ��û�з����ظ�Ԫ�أ��ǾͿ���
	 * ����false��ʱ�临�ӶȺͿռ临�Ӷȶ���O��N����
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

	//������
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
//				 if((nums[i]==nums[j])){	//����nums[i] = nums[j],����| i - j | <= kʱ����true
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
