package thread;

public class TestThread0 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadTest tt = new ThreadTest();
		Thread rt = new Thread(new RunableTest());
		tt.start();
		tt.join();
		rt.start();
	}

}

class ThreadTest extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("tt:" + i);
		}
	}
}

class RunableTest implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			System.out.println("rt:" + i);
		}
	}

}
