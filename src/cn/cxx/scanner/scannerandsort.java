package cn.cxx.scanner;

import java.util.Scanner;

public class scannerandsort {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("please input 3 int number:");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int num3 = s.nextInt();
		int max = num1;
		if (max < num2) {
			max = num2;
			if (max < num3) {
				max = num3;
			}
		} else {
			if (max < num3) {
				max = num3;
			}
		}
		System.out.println("max:" + max);
	}
}
