package mytest;

import java.util.Random;

/**
 * 编写函数foo(int x, int y, int n) 计算：随机生成x个大小为[1,y]的正整数， 它们的和为n的概率是多少？
 * 
 * @author Administrator
 *
 */
public class foo {
	public static void main(String[] args) {
		foo f = new foo();
		f.foo(3, 4, 5);
	}

	private double foo(int x, int y, int n) {
		int count = 0;

		// int s = (int)(1+Math.random()*(j-1+1));
		// System.out.println(s);
		int sum = 0;
		for (int n1 = 0; n1 < y; n1++) {
			for (int n2 = 0; n2 < y; n2++) {
				for (int n3 = 0; n3 < y; n3++) {
					sum = n1 + n2 + n3;
					if (sum == n) {
						count++;
					}
				}
			}
		}
		System.out.println((count * 1.0 / Math.pow(n, x)));
		return count * 1.0 / Math.pow(n, x);
	}

}
