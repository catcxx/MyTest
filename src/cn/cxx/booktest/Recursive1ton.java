package cn.cxx.booktest;

public class Recursive1ton {

	public static void main(String[] args) {
		Recursive1ton r1ton = new Recursive1ton();
		int num=4;
		
		System.out.println(r1ton.recursive1ton(num));
	}
	
	public long recursive1ton(int n){
		if(n==1){
			return 1;
		}else{
			return n+recursive1ton(n-1);
		}
	}

}
