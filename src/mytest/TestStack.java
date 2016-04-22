package mytest;

/**
 * ������ count ��¼�˵ݹ�Ĳ�Σ� ���û�г��ڵĵݹ麯��һ���ᵼ��ջ����� ��������ջ���ʱ����ӡ��ջ�ĵ�ǰ��ȡ�
 * ����߳��ڼ�������У������ջ��ȴ��������õ�ջ��ȣ����׳� StackOverflowError
 * ��� Java ջ���Զ�̬��չ��������չջ�Ĺ�����û���㹻���ڴ�ռ���֧��ջ�ķ�չ�����׳� OutOfMemeoryError��
 * ����ʹ��-Xss ����������ջ�Ĵ�С
 * �����ջ������ʱʹ��һ�ֽ���ջ֡�����ݽṹ��������������
 * 
 * @author Administrator
 *
 */
public class TestStack {
	private int count = 0;

	// û�г��ڵĵݹ麯��
	public void recursion() {
		count++;// ÿ�ε�����ȼ� 1
		recursion();// �ݹ�
	}

	public void testStack() {
		try {
			recursion();
		} catch (Throwable e) {
			System.out.println("deep of stack is " + count);// ��ӡջ��������
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TestStack ts = new TestStack();
		ts.testStack();
	}
}
