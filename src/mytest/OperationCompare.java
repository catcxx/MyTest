package mytest;

/**
 * 在条件判断时，Java 会对布尔运算做相当充分的优化。 假设有表达式 a、b、c 进行布尔运算“a&&b&&c”，根据逻辑与的特点，
 * 只要在整个布尔表达式中有一项返回 false，整个表达式就返回 false，
 * 
 * 位运算本身没有性能问题，但是位运算总是要将所有的子表达式全部计算完成后，再给出最终结果
 * 
 * @author Administrator
 *
 */
public class OperationCompare {
	public static void booleanOperate() {
		long start = System.currentTimeMillis();
		boolean a = false;
		boolean b = true;
		int c = 0;
		// 下面循环开始进行位运算，表达式里面的所有计算因子都会被用来计算
		for (int i = 0; i < 1000000; i++) {
			if (a & b & "Test_123".contains("123")) {
				c = 1;
			}
		}
		System.out.println(System.currentTimeMillis() - start);
	}

	public static void bitOperate() {
		long start = System.currentTimeMillis();
		boolean a = false;
		boolean b = true;
		int c = 0;
		// 下面循环开始进行布尔运算，只计算表达式 a 即可满足条件,不用计算完表达式
		for (int i = 0; i < 1000000; i++) {
			if (a && b && "Test_123".contains("123")) {
				c = 1;
			}
		}
		System.out.println(System.currentTimeMillis() - start);
	}

	public static void main(String[] args) {
		OperationCompare.booleanOperate();
		OperationCompare.bitOperate();
	}
}
