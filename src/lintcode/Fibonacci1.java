package lintcode;

public class Fibonacci1 {
	public static void main(String[] args) {
		
		
		Fibonacci1 f = new Fibonacci1();
		long start = System.nanoTime();
		System.out.println(f.fibonacci1(30));
		System.out.println(System.nanoTime()-start+"nanos");
	}
	//time o(n)  space o(n)
	int[] fib = new int[10000];
	int  fibonacci1(int i) {
		// TODO Auto-generated method stub
		if(i==0) return 0;
		if(i==1) return 1;
		if(fib[i]!=0) return fib[i];
		fib[i] = fibonacci1(i-1)+fibonacci1(i-2);
		return fib[i];
	}
}
