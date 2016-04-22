package cn.cxx.scanner;

import java.util.Scanner;

public class scanner {
public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	System.out.println("please input:");
	while(s!=null){
		String str = s.next();
		System.out.println("your input:"+str);
	}
	
	
}
}
