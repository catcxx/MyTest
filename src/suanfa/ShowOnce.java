package suanfa;

/**
 * 数组中只出现一次的数字， 其他数都出现两次，只有一个数组出现一次
 * 
 * @author Administrator
 *
 */
public class ShowOnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 7, 3, 2, 3, 7 };
		System.out.println(showOnce(array));
	}

	/**
	 * 异或
	 * 
	 * @param arr
	 * @return
	 */
	public static int showOnce(int[] arr) {
		int res = arr[0];
		for (int i = 1; i < arr.length; i++) {
			res ^= arr[i];
		}
		return res;

	}

}
