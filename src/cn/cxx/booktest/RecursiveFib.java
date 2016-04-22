package cn.cxx.booktest;

public class RecursiveFib {

	static int count = 0; 
	public static void main(String[] args) {
//		RecursiveFib rf = new RecursiveFib();
		int n=20;
	
		long start = System.nanoTime();
//		long res = rf.recursivefib(n);
		long res = recursivefib(n);
		long end = System.nanoTime();
//		System.out.println(res+"  time passed :"+(end-start));
		System.out.println(res+"  time passed :"+(end-start)+"nano");
		System.out.println("recursivefib :"+count+" times");
	}
	
	public static long recursivefib(int n){
		count++;
		if(n==0){
			return 0;
		}else if(n==1){
			return 1;
		}else{
			return recursivefib(n-2)+recursivefib(n-1);
		}
	}

}
