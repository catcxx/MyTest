package cn.cxx.booktest;

public class Recursivejishu2 {
	public static void main(String[] args) {
		Recursivejishu2 r1ton = new Recursivejishu2();
		double num = 2;

		System.out.println(r1ton.recursivejishu2(num));
	}

	public double recursivejishu2(double n) {
		double sum = 0;
		if (n == 1) {
			return (double) 1 / 3;
		} else {
			return n / (n * 2 + 1) + recursivejishu2(n - 1);
		}
	}
}
