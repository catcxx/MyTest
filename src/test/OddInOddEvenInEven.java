package test;

/**
 * 
 * 奇数位上都是奇数或者偶数位上都是偶数
 * 
 * 输入：数组arr，长度大于2
 * 
 * 将arr调整成奇数位上都是奇数或者偶数位上都是偶数
 * 
 */

public class OddInOddEvenInEven {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4 };

		int arrresult[] = OddInOddEvenInEven(arr);

		// traditional for loop
		for (int i = 0; i < arrresult.length; i++) {
			System.out.println(arrresult[i]);
		}

		System.out.println("----------");

		// for-each loop
		for (int i : arrresult) {
			System.out.println(i);
		}

	}

	/**
	 * 
	 * @param arr
	 * @return arr ,after change
	 */
	public static int[] OddInOddEvenInEven(int[] arr) {
		int i = 0;
		int j = 1;
		int len = arr.length;
		while (i < len && j < len) {

			while (i < len && (arr[i] % 2 == 0)) {
				i += 2;
			}

			while (j < len && (arr[j] % 2 == 1)) {
				j += 2;
			}

			if (i < len && j < len) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}

		}

		return arr;

	}

}
