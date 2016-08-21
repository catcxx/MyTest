package mytest;

public class Threadtest implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(Thread.currentThread().getName() + " " + i);
			}
		}
	}

	public static void main(String[] args) {
		Threadtest st = new Threadtest();
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(st);
		// System.out.println(t1.getName());
		t1.start();
		t2.start();
	}

}