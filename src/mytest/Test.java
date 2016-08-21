package mytest;

/**
 * 请问最后打印出来的是什么
 * 
 * @author Administrator
 *
 */
public class Test {
	private static int i = 1;

	public int getNext() {
		return i++;
	}

	public static void main(String[] args) {
		Test test = new Test();
		Test testObject = new Test();
		test.getNext();
		testObject.getNext();
		System.out.println(testObject.getNext());
	}
}
