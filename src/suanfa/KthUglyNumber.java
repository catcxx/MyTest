package suanfa;

/**
 * 丑数2：找出第n个丑数
 * 
 * @author Administrator
 *
 */
public class KthUglyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(doit(7));
		nthUglyNumber(7);
	}

	/**
	 * 申请一个长度为n的数组uglyNumbers，用于从小到大顺序存储n个丑数，数组中的首项为1，即第一个丑数为1
	 * 
	 * 设置三个变量idx2、idx3、idx5存储下标，初始值都为0
	 * 
	 * 找出数组uglyNumbers[idx2]*2、uglyNumbers[idx3]*3、uglyNumbers[idx5]*5的最小值，
	 * 最小值即为下一个丑数，同时更新最小值对应的下标，如果多个数字同时为最小值，则它们的下标都要更新
	 * 
	 * 找到第n个丑数时，循环结束
	 * 
	 * @param n
	 * @return
	 */
	public static int nthUglyNumber(int n) {

		int[] uglyNumbers = new int[n];
		uglyNumbers[0] = 1;
		System.out.println("uglyNumbers[0]:1");

		int idx2 = 0;
		int idx3 = 0;
		int idx5 = 0;

		int counter = 1;
		while (counter < n) {

			System.out.println("-----------");
			System.out.println("idx2:" + idx2 + ";ugly[idx2]:" + uglyNumbers[idx2]);
			System.out.println("idx3:" + idx3 + ";ugly[idx3]:" + uglyNumbers[idx3]);
			System.out.println("idx5:" + idx5 + ";ugly[idx5]:" + uglyNumbers[idx5]);
			System.out.println("idx2:" + idx2 + ";idx3:" + idx3 + ";idx5:" + idx5);

			int min = minOf(uglyNumbers[idx2] * 2, uglyNumbers[idx3] * 3, uglyNumbers[idx5] * 5);

			if (min == uglyNumbers[idx2] * 2) {
				System.out.println("min==ugly[idx2]*2:" + uglyNumbers[idx2] * 2);
				System.out.println("idx2:" + idx2 + "→" + (idx2 + 1));
				idx2++;
			}

			if (min == uglyNumbers[idx3] * 3) {
				System.out.println("min==ugly[idx3]*3:" + uglyNumbers[idx3] * 3);
				System.out.println("idx3:" + idx3 + "→" + (idx3 + 1));
				idx3++;
			}

			if (min == uglyNumbers[idx5] * 5) {
				System.out.println("min==ugly[idx5]*5:" + uglyNumbers[idx5] * 5);
				System.out.println("idx5:" + idx5 + "→" + (idx5 + 1));
				idx5++;
			}

			uglyNumbers[counter] = min;
			System.out.println("uglyNumbers[" + counter + "]:" + min);
			counter++;
		}

		System.out.println("-----------");
		System.out.println("return:" + uglyNumbers[n - 1]);

		return uglyNumbers[n - 1];
	}

	/**
	 * 求三个数字中最小的数字
	 * 
	 * @param a
	 *            数字a
	 * @param b
	 *            数字b
	 * @param c
	 *            数字c
	 * @return a、b、c中最小的数字
	 */
	private static int minOf(int a, int b, int c) {
		int temp = a < b ? a : b;
		return temp < c ? temp : c;
	}

	//////////////////////

	/**
	 * KthUglyNumber 1,2,3,4,5,6,8,9...
	 * 
	 * @param k
	 * @return
	 */
	public static int doit(int k) {
		int counter = 0;
		int i = 1;
		if (k < 1) {
			return 0;
		}
		for (;; i++) {
			if (isUgly(i)) {
				counter++;
				if (counter == k) {
					return i;
				}
			}
		}

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
