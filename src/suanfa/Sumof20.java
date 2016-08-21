package suanfa;

/**
 * 找出数组中两两和为20的组合种数
 */
import java.util.Arrays;

public class Sumof20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 7, 17, 2, 6, 3, 14 };
		doit(array);
		doit1(array);
	}

	/**
	 * o(n*n)
	 * 
	 * @param a
	 */
	public static void doit(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == 20) {
					count++;
					System.out.println(a[i] + " " + a[j]);
				}
			}
		}
		System.out.println(count);
	}

	/**
	 * sort,and ... o(nlg(n)
	 * 
	 * @param a
	 */
	public static void doit1(int[] a) {
		Arrays.sort(a);
		int count = 0;
		int begin = 0;
		int end = a.length - 1;
		while (begin < end) {
			if (a[begin] + a[end] < 20) {
				begin++;
			}
			if (a[begin] + a[end] > 20) {
				end--;
			}
			if (a[begin] + a[end] == 20) {
				count++;
				System.out.println(a[begin] + " " + a[end]);
				begin++;
				end--;

			}
		}
		System.out.println(count);
	}

}
