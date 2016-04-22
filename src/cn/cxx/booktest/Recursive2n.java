package cn.cxx.booktest;

public class Recursive2n {

	public static void main(String[] args) {
		Recursive2n r2n = new Recursive2n();
		int num=4;
		
		System.out.println(r2n.recursive2n(2,num));
	}
	
	public long recursive2n(int m,int n){
		if(n==0){
			return 1;
		}else{
			return m*recursive2n(m,n-1);
		}
	}

}
