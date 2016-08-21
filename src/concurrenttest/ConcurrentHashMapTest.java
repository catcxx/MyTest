package concurrenttest;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {

	private static ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<Integer, Integer>();

	public static void main(String[] args) throws InterruptedException {
		new Thread("Thread1") {
			@Override
			public void run() {
				map.put(3, 33);
			}
		}.start();

		new Thread("Thread2") {
			@Override
			public void run() {
				map.put(4, 44);
			}
		}.start();
		;

		new Thread("Thread3") {
			@Override
			public void run() {
				map.put(7, 77);
			}
		}.start();
		;

		System.out.println(Thread.currentThread().getName());
		// Thread.currentThread().sleep(1000);
		System.out.println(map);
	}
}
