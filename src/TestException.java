
public class TestException {
	public static void main(String[] args) {
		// int i=1/0;//unchecked exception
		Computer c = null;// nullpointer对象是空的，调用了对象的方法或属性
		c.start();// if
	}

	class Computer {
		void start() {
			System.out.println("start");
		}
	}
}
