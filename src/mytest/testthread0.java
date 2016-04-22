package mytest;

	class subthread1 extends Thread{
		
		public void run(){
			
			for(int i=0;i<=100;i++){
				if(i%2==0){
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
			}
		}
	}
	
	class subthread2 extends Thread{
		
		public void run(){
			
			for(int i=0;i<=100;i++){
				if(i%2!=0){
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
			}
		}
	}
	
	public class testthread0 {
	public static void main(String[] args){

		subthread1 sub1 = new subthread1();
		subthread2 sub2 = new subthread2();
		sub1.start();
		sub2.start();
	}
	}


