package suanfa;

/**
 * ugly number��{2,3,5}����ϳ˻����ɵģ� ��ô�ж��߼�Ҳ�ͼ��ˣ���������һ�����������֣� ƴ�������������ӣ�����������ľ���ugly
 * number������Ͳ��ǡ�
 * 
 * @author Administrator
 *
 */
public class UglyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isUgly(21));
	}

	/**
	 * UglyNumber?
	 * 
	 * @param num
	 * @return
	 */
	public static boolean isUgly(int num) {
		if (num <= 0)
			return false;
		while (num % 2 == 0) {
			num /= 2;
		}
		while (num % 3 == 0) {
			num /= 3;
		}
		while (num % 5 == 0) {
			num /= 5;
		}
		return num == 1;
	}

}
