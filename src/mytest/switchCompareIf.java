package mytest;
/**
 * 使用一个连续的数组代替 switch 语句，
 * 由于对数据的随机访问非常快，至少好于
 *  switch 的分支判断
 * @author Administrator
 *
 */
public class switchCompareIf {

	public static int switchTest(int value) {
		int i = value % 10 + 1;
		switch (i) {
		case 1:
			return 10;
		case 2:
			return 11;
		case 3:
			return 12;
		case 4:
			return 13;
		case 5:
			return 14;
		case 6:
			return 15;
		case 7:
			return 16;
		case 8:
			return 17;
		case 9:
			return 18;
		default:
			return -1;
		}
	}

	public static int arrayTest(int[] value, int key) {
		int i = key % 10 + 1;
		if (i > 9 || i < 1) {
			return -1;
		} else {
			return value[i];
		}
	}

	public static void main(String[] args) {
		int chk = 0;
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			chk = switchTest(i);
		}
		System.out.println(System.currentTimeMillis() - start);
		chk = 0;
		start = System.currentTimeMillis();
		int[] value = new int[] { 0, 10, 11, 12, 13, 14, 15, 16, 17, 18 };
		for (int i = 0; i < 10000000; i++) {
			chk = arrayTest(value, i);
		}
		System.out.println(System.currentTimeMillis() - start);
	}
}
