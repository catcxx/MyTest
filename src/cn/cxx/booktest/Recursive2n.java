package cn.cxx.booktest;
/**
 * 2**n,using recursive
 * @author Administrator
 *
 */
public class Recursive2n {

	public static void main(String[] args) {
		Recursive2n r2n = new Recursive2n();
		int num=5;
		
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
