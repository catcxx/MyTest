package mytest;

/**
 * �� JVM �п���ʹ��-Xss ���������߳�ջ�Ĵ�С��
 * ���ջ�Ŀռ����̫С����ô�߳�������ʱ����û���㹻�Ŀռ����ֲ��������ߴﲻ���㹻�ĺ���������ȣ����³����쳣�˳�
 * �����ջ�ռ������ô�����߳�������ڴ�ɱ��ͻ�������ϵͳ����֧�ֵ��߳������ͻ��½���
 * 
 * @author Administrator
 *
 */
public class TestXss {
	public static class MyThread extends Thread {
		@Override
		public void run() {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		int count = 0;
		try {
			for (int i = 0; i < 10000; i++) {
				new MyThread().start();
				count++;
			}
		} catch (OutOfMemoryError e) {
			System.out.println(count);
			System.out.println(e.getMessage());
		}
	}
}
