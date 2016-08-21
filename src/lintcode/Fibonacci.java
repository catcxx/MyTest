package lintcode;

public class Fibonacci {

	public static void main(String[] args) {

		Fibonacci f = new Fibonacci();
		long start = System.nanoTime();
		System.out.println(f.fibonacci(30));
		System.out.println(System.nanoTime() - start + "nanos");
	}

	// public int fib(int index) {//两层递归
	// if (index == 0) // Base case
	// return 0;
	// if (index == 1) // Base case
	// return 1;
	// else
	// // Reduction and recursive calls
	// return fib(index - 1) + fib(index - 2);
	// }

	public int fibonacci(int n) {// 不使用递归的方式来做。time o(n)
		int f0 = 0;
		int f1 = 1;
		int f2 = 1;
		if (n == 0) {
			return f0;
		} else if (n == 1) {
			return f1;
		} else if (n == 2) {
			return f2;
		}
		for (int i = 3; i <= n; i++) {
			f0 = f1;
			f1 = f2;
			f2 = f1 + f0;
		}
		return f2;
	}

}
