package cn.cxx.book;

public class TestException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1.0/0);
		
//		Object o = new Object();
//		String d = (String)o;//ClassCastException
		
		System.out.println(1.0/0);
		
		for(int i =0;i<2;i++){
			System.out.println(i+" ");
			try{
				System.out.println(1/0);
			}
			catch (Exception ex){
				
			}
		}
	}

}
