package lintcode;
/**
 * ������������a��b, �����ǵĺ�, ������ʹ�� + ����ѧ�����
 * @author Administrator
 *
 */
public class Aplusb {

	public static void main(String[] args) {
		Aplusb ap = new Aplusb();
		int a = 2;
		int b = 2;
		System.out.println(ap.aplusb(a, b));
	}

	public int aplusb(int a, int b) {
	
		// int sum = a - (-b);
		// return sum;

		int ans = 0;
		while (b > 0) {
			ans = a ^ b;
			b = (a & b) << 1;
			a = ans;
		}
		return ans;
	}

}
