package cn.cxx.scanner;

import java.util.Scanner;

public class testsanner {
		public static void main(String[] args){
			Scanner s = new Scanner(System.in);
			System.out.println("please input:");
			int score = s.nextInt();
		//	String str = s.next();
		//	System.out.println("your input:"+str);
			if(score == 100){
				System.out.println("bwm");
			}else if(score>=80 && score<100){
				System.out.println("5s");
			}else if(score>=60&&score<80)
			{
				System.out.println("book");
			}else{
				System.out.println("nothing");
			}
		}
		}
