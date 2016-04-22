package mytest;
/*
 * 创建一个子线程，输出1-100；主线程执行同样的操作
 * 创建多线程的第一种方式：继承java.lang,thread
 * yeild() 释放执行权，重新抢占cpu
 * jion（）在a线程中调用b线程的jion方法，执行到此方法，a停止，直到b完成后,a再执行
 * sleep
 * wait
 * notify
 * notifyall
 * 优先级：setPriority（）
 */
//1.创建一个继承java.lang,thread的子类
class subthread extends Thread{
	//2.重写thread子类的run（）方法，方法内实现功能
	public void run(){
		for(int i=0;i<=100;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}
public class testthread {
public static void main(String[] args){
	//3.创建一个子类对象
	subthread sub = new subthread();
	sub.setName("zixianchen");
	sub.start();//4.调用线程的start方法,启动线程；调run
	//一个线程只能执行一次start
	for(int i=0;i<=100;i++){
		System.out.println(Thread.currentThread().getName()+":"+i);
	}
	System.out.println(Thread.currentThread().getName()+Thread.currentThread().isAlive()+"........................................");
}
}
