package cn.cxx.booktest;

public class Iterationjishu {

	public static void main(String[] args) {
		Iterationjishu rf = new Iterationjishu();
		int n=20;
		long start = System.currentTimeMillis();
		double res = rf.iterationjishu(n);
		long end = System.currentTimeMillis();
		System.out.println(res+"  time passed :"+(end-start));
	}
	
	public double iterationjishu(int n){
		
		double f1 = 1.0;
		double f0=1.0;
		double sum=0.0;
		for(int i=1;i<=n;i++){
			sum =sum+f1;
			f0++;
			f1=1/(f0);
		}
		return sum;
	}

}
