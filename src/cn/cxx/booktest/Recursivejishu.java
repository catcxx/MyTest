package cn.cxx.booktest;

public class Recursivejishu {

	public static void main(String[] args) {
		Recursivejishu rf = new Recursivejishu();
		double n=20.0;
		long start = System.currentTimeMillis();
		double res = rf.recursivejishu(n);
		long end = System.currentTimeMillis();
		System.out.println(res+"  time passed :"+(end-start));
	}
	
	public double recursivejishu(double n){
		
		if(n==1){
			return 1;
		}else{
			
			return 1/(n)+recursivejishu(n-1);
		}
	}

}
