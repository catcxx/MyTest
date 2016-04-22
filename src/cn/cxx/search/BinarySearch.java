package cn.cxx.search;
/**
 * ǰ����Ԫ�����ź���
 * @author Administrator
 *
 */
public class BinarySearch {
	/** Main method */
	public static void main(String[] args) {
		int[] list = { 2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79 };
		int[] list1 = {1, 2, 3, 3, 4, 5, 10};

		int i = binarySearch(list, 2);
		int j = binarySearch(list, 11);
		int k = binarySearch(list, 12);
		int kk =binarySearch(list1,3);
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(kk);
	}

	/** Use binary search to find the key in the list */
	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;

		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < list[mid]) {
				high = mid - 1;
			} else if (key == list[mid]) {
				return mid;
			} else {
				low = mid + 1;
			}
		}

		return -low - 1; // insert location
	}
}
