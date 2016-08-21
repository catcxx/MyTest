package suanfa;

/**
 * 只另外用一个栈，对栈排序
 */
import java.util.Stack;

public class SortStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		stack.push(7);
		stack.push(10);
		stack.push(8);
		stack.push(1);
		System.out.println(stack.peek());
		sort(stack);

	}

	/**
	 * stack sort
	 * 
	 * @param stack1
	 * @return
	 */
	public static Stack<Integer> sort(Stack<Integer> stack1) {
		Stack stack2 = new Stack<Integer>();
		while (!stack1.empty()) {
			int tmp = (int) stack1.pop();
			while (!stack2.empty() && tmp < (int) stack2.peek()) {
				stack1.push((Integer) stack2.pop());
			}
			stack2.push(tmp);
		}
		System.out.println(stack2.peek());

		return stack2;
	}

}
