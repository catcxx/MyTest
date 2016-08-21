package cn.cxx.book;

public class TestQueue {
	public static void main(String[] args) {
		java.util.Queue<String> queue = new java.util.LinkedList<String>();
		queue.offer("Oklahoma");
		queue.offer("Indiana");
		queue.offer("Georgia");
		queue.offer("Texas");

		queue.poll();
		queue.add("Oklahoma");
		queue.remove();

		System.out.println(queue.peek());

		while (queue.size() > 0)
			System.out.print(queue.remove() + " ");
	}
}
