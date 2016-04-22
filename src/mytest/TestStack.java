package mytest;

/**
 * 计数器 count 记录了递归的层次， 这个没有出口的递归函数一定会导致栈溢出。 程序则在栈溢出时，打印出栈的当前深度。
 * 如果线程在计算过程中，请求的栈深度大于最大可用的栈深度，则抛出 StackOverflowError
 * 如果 Java 栈可以动态扩展，而在扩展栈的过程中没有足够的内存空间来支持栈的发展，则抛出 OutOfMemeoryError。
 * 可以使用-Xss 参数来设置栈的大小
 * 虚拟机栈在运行时使用一种叫做栈帧的数据结构保存上下文数据
 * 
 * @author Administrator
 *
 */
public class TestStack {
	private int count = 0;

	// 没有出口的递归函数
	public void recursion() {
		count++;// 每次调用深度加 1
		recursion();// 递归
	}

	public void testStack() {
		try {
			recursion();
		} catch (Throwable e) {
			System.out.println("deep of stack is " + count);// 打印栈溢出的深度
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TestStack ts = new TestStack();
		ts.testStack();
	}
}
