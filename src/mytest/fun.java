package mytest;

public class fun {

	public static void main(String[] args) {

		abc(5);
		/*
		 * �������ã�������ջ ջ�ռ���� ��һ��ջִ�к���ʱ���ȵ�����ִ����Ϸ����Ժ󣬼���ִ�� ��һ������ִ����Ϸ��غ󣬸�ջ�ͻᱻ����
		 */
	}

	private static void abc(int i) {

		if (i > 3) {
			abc(--i);
		}
		System.out.println(i);
	}

}
