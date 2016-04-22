package mytest;

/**
 * System.arraycopy() ������ native ������ͨ�� native ����������Ҫ������ͨ�ĺ����� arraycopy
 * �ı������ô���������һ��ָ���һ�������еĶ�����¼��ֻ��ָ��ͷָ�룬 Ȼ��ʼѭ�����ɣ���ִ��һ��ָ�ָ��ͺ���һ��λ�ã������������ݾ�ѭ�����ٴΡ�
 * �����Ӧ�ó�������Ҫ�������鸴�ƣ�Ӧ��ʹ������������������Լ�ʵ�� ���õ�Ϊ C++��д�ĵײ㺯�����ɼ���Ϊ JDK �еĵײ㺯��
 * 
 * @author Administrator
 *
 */
public class arrayCopyTest {
	public static void arrayCopy() {
		int size = 10000000;
		int[] array = new int[size];
		int[] arraydestination = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		long start = System.currentTimeMillis();
		for (int j = 0; j < 1000; j++) {//copy 1000 times
			System.arraycopy(array, 0, arraydestination, 0, size);// native																
		}
		System.out.println(System.currentTimeMillis() - start);
//		System.out.println(arraydestination[10000]);
	}

	public static void arrayCopySelf() {
		int size = 10000000;
		int[] array = new int[size];
		int[] arraydestination = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {//copy 1000 times
			for (int j = 0; j < size; j++) {
				arraydestination[j] = array[j];// �Լ�ʵ�ֵķ�ʽ��������������ݻ�����ʽ
			}
		}
		System.out.println(System.currentTimeMillis() - start);
//		System.out.println(arraydestination[10000]);
	}

	public static void main(String[] args) {
		arrayCopyTest.arrayCopy();
		arrayCopyTest.arrayCopySelf();
	}
}