
public class TestException {
	public static void main(String[] args) {
		// int i=1/0;//unchecked exception
		Computer c = null;// nullpointer�����ǿյģ������˶���ķ���������
		c.start();// if
	}

	class Computer {
		void start() {
			System.out.println("start");
		}
	}
}
