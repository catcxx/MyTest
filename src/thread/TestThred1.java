package thread;

import java.io.IOException;;

public class TestThred1 {
	public static void main(String[] args) {
		ThreadTest1 tt = new ThreadTest1();
		ThreadTest1 tt1 = new ThreadTest1();
		tt.setPriority(1);
		tt.setName("tt");
		tt1.setPriority(10);
		tt1.setName("tt1");
		tt.start();

		tt1.start();

	}

}

class ThreadTest1 extends Thread {
	private static int count = 0;
	private static Object obj = new Object();

	public void run() {
		// synchronized (obj) {
		for (int i = 0; i < 10; i++) {
			System.out.println(getName() + " " + count++);
		}
		// }
	}
}
