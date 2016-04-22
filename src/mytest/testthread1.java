package mytest;


//class thread extends Thread{
//	
//	public void run(){
//		
//		for(int i=0;i<=100;i++){
//			
//			System.out.println(Thread.currentThread().getName()+":"+i);
//	
//		}
//	}
//}


public class testthread1 {
	public static void main(String[] args){

//		thread sub1 = new thread();
//		thread sub2 = new thread();
		
		Thread sub1 = new Thread();
		Thread sub2 = new Thread();
		
		
		sub1.setPriority(Thread.MIN_PRIORITY);
		sub2.setPriority(Thread.MAX_PRIORITY);
		sub1.start();
		sub2.start();
		System.out.println(sub1.getName());
		System.out.println(sub2.getName());
}
}
