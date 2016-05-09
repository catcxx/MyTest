package cn.cxx.booktest;
/**
 * iterationfib,using dp
 * @author Administrator
 *
 */
public class Iterationfib {

	public static void main(String[] args) {
		Iterationfib rf = new Iterationfib();
		int n=20;
		long start = System.nanoTime();
		long res = rf.iterationfib(n);
		long end = System.nanoTime();
		System.out.println(res+"  time passed :"+(end-start)+"nano");
	}
	
	public long iterationfib(int n){
		int f0 = 0;
		int f1 = 1;
		int f2 = 1;
		if (n == 0) {
			return f0;
		} else if (n == 1) {
			return f1;
		} else if (n == 2) {
			return f2;
		}
		for (int i = 3; i <= n; i++) {
			f0 = f1;
			f1 = f2;
			f2 = f1 + f0;
		}
		return f2;
	}

}
