package mytest;

/**
 * �������ж�ʱ��Java ��Բ����������൱��ֵ��Ż��� �����б��ʽ a��b��c ���в������㡰a&&b&&c���������߼�����ص㣬
 * ֻҪ�������������ʽ����һ��� false���������ʽ�ͷ��� false��
 * 
 * λ���㱾��û���������⣬����λ��������Ҫ�����е��ӱ��ʽȫ��������ɺ��ٸ������ս��
 * 
 * @author Administrator
 *
 */
public class OperationCompare {
	public static void booleanOperate() {
		long start = System.currentTimeMillis();
		boolean a = false;
		boolean b = true;
		int c = 0;
		// ����ѭ����ʼ����λ���㣬���ʽ��������м������Ӷ��ᱻ��������
		for (int i = 0; i < 1000000; i++) {
			if (a & b & "Test_123".contains("123")) {
				c = 1;
			}
		}
		System.out.println(System.currentTimeMillis() - start);
	}

	public static void bitOperate() {
		long start = System.currentTimeMillis();
		boolean a = false;
		boolean b = true;
		int c = 0;
		// ����ѭ����ʼ���в������㣬ֻ������ʽ a ������������,���ü�������ʽ
		for (int i = 0; i < 1000000; i++) {
			if (a && b && "Test_123".contains("123")) {
				c = 1;
			}
		}
		System.out.println(System.currentTimeMillis() - start);
	}

	public static void main(String[] args) {
		OperationCompare.booleanOperate();
		OperationCompare.bitOperate();
	}
}
