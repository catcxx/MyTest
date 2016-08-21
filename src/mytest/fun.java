package mytest;

public class fun {

	public static void main(String[] args) {

		abc(5);
		/*
		 * 函数调用，创建新栈 栈空间独立 当一个栈执行函数时，等到函数执行完毕返回以后，继续执行 当一个函数执行完毕返回后，该栈就会被回收
		 */
	}

	private static void abc(int i) {

		if (i > 3) {
			abc(--i);
		}
		System.out.println(i);
	}

}
