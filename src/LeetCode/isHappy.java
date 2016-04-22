package LeetCode;

import java.util.Arrays;


public class isHappy {

	public static void main(String[] args) {
		isHappy ih = new isHappy();
		//ih.isHappy(19);
		System.out.println("id happy number:"+ih.isHappy(19));

	}
	
public boolean isHappy(int n) {
	
	int times=0;
	int[] arr = test(n);
	
	int sum = getsum(arr);
	
	while(sum!=1){
		int[] ar = test(sum);
		sum = getsum(ar);
		times++;
		if(times>1000){
			return false;
		}
	}
	System.out.println(sum);
	
	return true;
}

//get sum
public int getsum(int[] arr){
	int sum = 0;
	for(int ii = 0;ii<arr.length;ii++){
		sum = sum + arr[ii]*arr[ii];
	}
	return sum;
}

//get numbers
public int[] test(int n){
	String s = String.valueOf(n);
	int count = s.length();
	int[] arr = new int [count];
	
	for(int i = 0;i<count;i++){
		String sc = s.substring(i, i+1);
		int is = Integer.parseInt(sc);
		arr[i] = is;
		System.out.println("arr:"+arr[i]);
	}
	System.out.println("--------");
	
	return arr;
	
}


	

}
