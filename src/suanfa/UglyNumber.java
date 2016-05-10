package suanfa;

/**
 * ugly number是{2,3,5}的组合乘积构成的， 那么判断逻辑也就简单了，对于任意一个给定的数字， 拼命除这三个因子，最后能整除的就是ugly
 * number，否则就不是。
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
