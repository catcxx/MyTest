package cn.cxx.meituan;

public class Avgage {

	public static void main(String[] args) {
		int y=24;
		int W;
		double x=0.1;
		int n=1;
		
		System.out.println(avgage(y,x,n));
	}
	
	static int avgage(double Y,double X,int N){
		int ye=0;
		if(X>0&&X<1){
			if(N==0){
				return (int) Math.ceil(Y);
			}else{
				return avgage( Y,X, N);
			}
		}
		return ye;
	}

}
