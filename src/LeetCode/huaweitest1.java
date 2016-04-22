package LeetCode;

import java.util.Scanner;

public class huaweitest1 {
	public static void main(String[] args) {
		 System.out.println("please input stu number n and opr number m:  ");
		 Scanner sc0 = new Scanner(System.in);
		 int n = sc0.nextInt();
		 Scanner sc1 = new Scanner(System.in);
		 int m = sc1.nextInt();
		 int[] array = new int[n];//id: 1-5 
		 for(int i=0;i<n;i++){
			 System.out.println("please input score: ");
			 Scanner sc = new Scanner(System.in);
			 array[i] = sc.nextInt();
		 }
		 
		 int count=0;
		 while(count<m){
		 System.out.println("please input u or q: ");
		 Scanner sc2 = new Scanner(System.in);
		 String c = sc2.next();
		 if(c.equalsIgnoreCase("u")){
			 System.out.println("please input stu and his new score: ");
			 Scanner sc5 = new Scanner(System.in);
			 int stu = sc5.nextInt();
			 Scanner sc6 = new Scanner(System.in);
			 int nscore = sc6.nextInt();
			 array[stu] = nscore;
			 count++;
		 }else if(c.equalsIgnoreCase("q")){
			 System.out.println("please input num1 and num2: ");
			 Scanner sc3 = new Scanner(System.in);
			 int num1 = sc3.nextInt();
			 Scanner sc4 = new Scanner(System.in);
			 int num2 = sc4.nextInt();
			 int maxgrade = max(array,num1,num2);
			 count++;
			 System.out.println("maxgrade: "+maxgrade);
		 }
		 
	}
	}

	private static int max(int[] array,int num1,int num2) {
		int max=array[num1];
		for(;num1<=num2;num1++){
			if(array[num1]>max){
				max=array[num1];
			}
		}
		return max;
	}
}
