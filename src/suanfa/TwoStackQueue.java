package suanfa;
/**
 * 两个栈实现一个队列
 */
import java.util.Stack;

public class TwoStackQueue {

	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	/**
	 * queue size
	 * @return
	 */
	public int size() {
		return stack1.size() + stack2.size();
	}

	/**
	 * enqueue
	 * @param node
	 */
	public void enqueue(int node) {
		if (stack2.empty()) {
			stack1.push(node);
		} else {
			while (!stack2.empty()) {
				stack1.push(stack2.pop());
			}
			stack1.push(node);
		}
	}

	/**
	 * dequeue
	 * @return
	 */
	public int dequeue() {
		if(stack1.size()+stack2.size()<1){System.out.println("empty");}
		if (stack2.empty()) {
			while (!stack1.empty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}
	
	/**
	 * queue first
	 * @return
	 */
	public int first(){
		if(stack1.size()+stack2.size()<1){System.out.println("empty");}
		if (stack2.empty()) {
			while (!stack1.empty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.peek();
	}
	
	/**
	 * queue last
	 * @return
	 */
	public int last(){
		if(stack1.size()+stack2.size()<1){System.out.println("empty");}
		while (!stack2.empty()) {
			stack1.push(stack2.pop());
		}
		return stack1.peek();
	}

	/**
	 * main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoStackQueue tsq = new TwoStackQueue();
		tsq.enqueue(1);
		tsq.enqueue(2);
		System.out.println("first: "+tsq.first());
		System.out.println("last: "+tsq.last());
		tsq.enqueue(3);
		tsq.enqueue(4);
		
		System.out.println("first: "+tsq.first());
		System.out.println("last: "+tsq.last());
		System.out.println("dequeue: "+tsq.dequeue());
		System.out.println("dequeue: "+tsq.dequeue());
		System.out.println("first: "+tsq.first());
		System.out.println("last: "+tsq.last());
		tsq.enqueue(5);
		tsq.enqueue(6);
		
		System.out.println("first: "+tsq.first());
		System.out.println("last: "+tsq.last());
		tsq.dequeue();
		tsq.dequeue();
		tsq.dequeue();
		tsq.dequeue();
		
		tsq.dequeue();
	}

}
