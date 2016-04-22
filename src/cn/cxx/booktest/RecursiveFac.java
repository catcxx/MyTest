package cn.cxx.booktest;

public class RecursiveFac {

	static int count = 0; 
	public static void main(String[] args) {

		int n=6;
	
		long start = System.currentTimeMillis();

		long end = System.currentTimeMillis();

		System.out.println(recursiveFac(n)+"  time passed :"+(end-start));
		System.out.println("recursiveFac: "+count+" times");
	}
	
	public static long recursiveFac(int n){
		
		if(n==0){
			count++;
			return 1;
		}else{
			count++;
			return n*recursiveFac(n-1);
		}
	}

}

