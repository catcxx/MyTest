package lintcode;

import java.util.ArrayList;
import java.util.Collections;

public class MajorityNumber {
	public static void main(String[] args) {
		MajorityNumber mp = new MajorityNumber();
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(1);// 1,1,1,1,2,2,2
		al.add(1);
		al.add(231);// 1,1,1,1,2,2,2
		al.add(1);
		al.add(2);// 1,1,1,1,2,2,2
		al.add(2);
		// 2,1,2,1,2
	//	System.out.println(mp.majorityNumber(al));
	}

	public int majorityNumber(ArrayList<Integer> nums) {
		int[] count = new int[nums.size()];
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		Collections.sort(num);
		 for (int i = 0; i < num.size(); i++) {
			 if (i == num.size() - 1) {
			 count[i]++;
			 if (count[i] >= (double) num.size() / 2) {
				 return count[i];
				 }
			 } else {
			 if (num.get(i) == num.get(i + 1)) {
			 count[i]++;
			 if (count[i] >= (double) num.size() / 2) {
				 return count[i];
				 }
			 // System.out.println(count[num.get(i)]+" --"+i);
			 } else {
			 count[i]++;
			 if (count[i] >= (double) num.size() / 2) {
				 return count[i];
				 }
			 }
			 if (count[i] >= (double) num.size() / 2) {
				 return count[i];
				 }
			 }
			 }
			 System.out.println(count[num.get(0)]);
			 System.out.println(count[num.get(4)]);
			 for (int i = 0; i < nums.size() - 1; i++) {
			
			
			 }
		System.out.println(num);
		

		return -1;
	}

	// public int majorityNumber(ArrayList<Integer> nums) {
	// int[] count = new int[nums.size()];
	// ArrayList<Integer> num = new ArrayList<Integer>();
	// num = nums;
	// Collections.sort(num);
	// int no = num.size() - 1;
	// int[] co = new int[no];
	// System.out.println(num);
	//
//	 for (int i = 0; i < num.size(); i++) {
//	 if (i == num.size() - 1) {
//	 count[num.get(i)]++;
//	 } else {
//	 if (num.get(i) == num.get(i + 1)) {
//	 count[num.get(i)]++;
//	 // System.out.println(count[num.get(i)]+" --"+i);
//	 } else {
//	 count[num.get(i)]++;
//	 }
//	 }
//	 }
//	 System.out.println(count[num.get(0)]);
//	 System.out.println(count[num.get(4)]);
//	 for (int i = 0; i < nums.size() - 1; i++) {
//	
//	 if (count[num.get(i)] >= (double) num.size() / 2) {
//	 return num.get(i);
//	 }
//	 }
	// return -1;
	// }
}
