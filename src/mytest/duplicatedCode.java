package mytest;
/**
 * 提取了重复的公式，使得这个公式的每次循环计算只执行一次。
 * @author Administrator
 *
 */
public class duplicatedCode {
	public static void beforeTuning() {
		long start = System.currentTimeMillis();
		double a1 = Math.random();
		double a2 = Math.random();
		double a3 = Math.random();
		double a4 = Math.random();
		double b1, b2;
		for (int i = 0; i < 10000000; i++) {
			b1 = a1 * a2 * a4 / 3 * 4 * a3 * a4;
			b2 = a1 * a2 * a3 / 3 * 4 * a3 * a4;
		}
		System.out.println(System.currentTimeMillis() - start);
	}

	public static void afterTuning() {
		long start = System.currentTimeMillis();
		double a1 = Math.random();
		double a2 = Math.random();
		double a3 = Math.random();
		double a4 = Math.random();
		double combine, b1, b2;
		for (int i = 0; i < 10000000; i++) {
			combine = a1 * a2 / 3 * 4 * a3 * a4;
			b1 = combine * a4;
			b2 = combine * a3;
		}
		System.out.println(System.currentTimeMillis() - start);
	}

	public static void main(String[] args) {
		duplicatedCode.beforeTuning();
		duplicatedCode.afterTuning();
	}
}
