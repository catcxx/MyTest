package mytest;

/**
 * Java Ӧ�ó������ʹ�õ����ѿ�����-Xmx ����ָ��������ָ�������������������Ĵ�С֮�͵����ֵ,��������Ϊ-Xmx5M
 * 
 * ����-Xmn �������� Hot Spot ������еĲ���-XX:NewSize(��������ʼ��С)��-XX��MaxNewSize ���������������Ĵ�С��
 * ����һ���ϴ�����������С�������Ĵ�С�����������ϵͳ�����Լ� GC ��Ϊ�кܴ��Ӱ�졣�������Ĵ�Сһ������Ϊ����
 * �ѿռ�� 1/4 �� 1/3 ���ҡ�
 * 
 * ��ʹ�� JVM ����-XX:+PrintGCDetails -Xmx11M -XX:NewSize=2M -XX:MaxNewSize=2M -verbose:gc ���г���
 * ���������Ĵ�С��СΪ 2MB����ô MinorGC �������� 4 �����ӵ� 9 �� (Ĭ��������� 3.5MB ����)��
 */
import java.util.Vector;

public class maxHeapTest {
	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("Max memory:" + Runtime.getRuntime().maxMemory());
		for (int i = 0; i <= 100; i++) {
			byte[] b = new byte[1024 * 1024];
			v.add(b);
			System.out.println(i + "M is allocated");
		}
		System.out.println("Max memory:" + Runtime.getRuntime().freeMemory());
//		System.out.println("Max memory:" + Runtime.getRuntime().totalMemory());
	}
}
