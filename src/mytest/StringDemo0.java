package mytest;

/**
 * string: 1.������ String ����һ�����ɣ������ٶ������иı䡣 ������Կ��Է����ɲ��� (immutable) ģʽ��
 * ��һ�������״̬�ڶ��󱻴���֮��Ͳ��ٷ����仯�� ����ģʽ����Ҫ�������ڵ�һ��������Ҫ�����̹߳���
 * ���ҷ���Ƶ��ʱ������ʡ��ͬ�������ȴ���ʱ�䣬�Ӷ�������ϵͳ���ܡ�
 * 
 * 2.��Գ����ص��Ż��������� String ����ӵ����ͬ��ֵʱ�� ����ֻ���ó������е�ͬһ����������ͬһ���ַ�����������ʱ��
 * ����������Դ���Ƚ�ʡ�ڴ�ռ䡣
 * 
 * 3. ��� final ����
 * 
 * @author Administrator
 *
 */
public class StringDemo0 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		String str4 = str1;
		System.out.println("is str1 = str2?" + (str1 == str2));
		System.out.println("is str1 = str3?" + (str1 == str3));
		System.out.println("is str1 refer to str3?" + (str1.intern() == str3.intern()));// intern()
																						// native
		System.out.println("is str1 refer to str3?" + (str1.equals(str3)));// equals
		System.out.println("is str1 = str4" + (str1 == str4));
		System.out.println("is str2 = str4" + (str2 == str4));
		System.out.println("is str4 refer to str3?" + (str4.intern() == str3.intern()));
	}
}
