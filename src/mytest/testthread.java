package mytest;
/*
 * ����һ�����̣߳����1-100�����߳�ִ��ͬ���Ĳ���
 * �������̵߳ĵ�һ�ַ�ʽ���̳�java.lang,thread
 * yeild() �ͷ�ִ��Ȩ��������ռcpu
 * jion������a�߳��е���b�̵߳�jion������ִ�е��˷�����aֹͣ��ֱ��b��ɺ�,a��ִ��
 * sleep
 * wait
 * notify
 * notifyall
 * ���ȼ���setPriority����
 */
//1.����һ���̳�java.lang,thread������
class subthread extends Thread{
	//2.��дthread�����run����������������ʵ�ֹ���
	public void run(){
		for(int i=0;i<=100;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}
public class testthread {
public static void main(String[] args){
	//3.����һ���������
	subthread sub = new subthread();
	sub.setName("zixianchen");
	sub.start();//4.�����̵߳�start����,�����̣߳���run
	//һ���߳�ֻ��ִ��һ��start
	for(int i=0;i<=100;i++){
		System.out.println(Thread.currentThread().getName()+":"+i);
	}
	System.out.println(Thread.currentThread().getName()+Thread.currentThread().isAlive()+"........................................");
}
}
