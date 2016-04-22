package mytest;

/**
 * 位运算是所有的运算中最为高效的。 因此，可以尝试使用位运算代替部分算数运算， 来提高系统的运行速度
 * 
 * @author Administrator
 *
 */
public class yunsuantest {
	public static void main(String args[]) {
		long start = System.currentTimeMillis();
		long a = 1000;
		for (int i = 0; i < 10000000; i++) {
			a *= 2;
			a /= 2;
		}
		System.out.println(a);
		System.out.println("* & /:" + (System.currentTimeMillis() - start)
				+ "毫秒");
		start = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			a <<= 1;
			a >>= 1;
		}
		System.out.println(a);
		System.out.println("weiyunsuan:" + (System.currentTimeMillis() - start)
				+ "毫秒");
	}
}
