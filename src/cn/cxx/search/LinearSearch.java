package cn.cxx.search;

/**
 * Öð¸ö±È½Ï
 * 
 * @author Administrator
 *
 */
public class LinearSearch {
	public static void main(String[] args) {
		int[] list = { 2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79 };

		int i = LinearSearch(list, 2);
		int j = LinearSearch(list, 11);
		int k = LinearSearch(list, 12);

		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}

	private static int LinearSearch(int[] list, int key) {
		for (int j = 0; j < list.length; j++) {
			if (key == list[j]) {
				return j;
			}
		}
		return -1;
	}
}
