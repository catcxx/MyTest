package lintcode;
/**
 * 给出两个整数a和b, 求他们的和, 但不能使用 + 等数学运算符
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
