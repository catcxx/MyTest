package mytest;

/**
 * 在 JVM 中可以使用-Xss 参数设置线程栈的大小。
 * 如果栈的空间分配太小，那么线程在运行时可能没有足够的空间分配局部变量或者达不到足够的函数调用深度，导致程序异常退出
 * ；如果栈空间过大，那么开设线程所需的内存成本就会上升，系统所能支持的线程总数就会下降。
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
