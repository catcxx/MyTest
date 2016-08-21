package mytest;

/*
 * 1-n之间含有‘1’的数字的个数
 */
import java.util.Scanner;

public class testbaifenhao {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("please input:");
		int n = s.nextInt();
		int count = 0;
		for (int i = 0; i <= n; i++) {
			if (hasone(i)) {
				count++;
			}
		}

		System.out.println("count:" + count);
	}

	static boolean hasone(int n) {
		while (n > 0) {
			if (n % 10 == 1) {
				// System.out.println(n);
				return true;
			} else {
				n = n / 10;
			}

		}
		return false;
	}
}