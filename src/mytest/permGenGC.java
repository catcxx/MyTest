package mytest;

/**
 * String.intern() �����ĺ�����������������Ѿ����ڵ�ǰ String���򷵻س��еĶ�������������в����ڵ�ǰ String �������Ƚ�
 * String ���볣���أ������س��еĶ������á� ��ˣ���ͣ�ؽ� String ������볣���ػᵼ�����������͡���� GC
 * ���ܻ�������������Щ�������ݣ���ô�ͻ��׳� OutofMemoryError ���� ÿ�������ر���ʱ,FULL GC
 * ����˳�����ճ��������ݣ�ȷ�������ȶ��������С�
 * 
 * @author Administrator
 *
 */
public class permGenGC {
	public static void main(String[] args) {
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			String t = String.valueOf(i).intern();// ���볣����
		}
	}
}
