package lintcode;

public class Binarysearch {

	/** Main method */
	public static void main(String[] args) {

		int[] list1 = { 1, 2, 3, 3, 4, 4, 5, 10 };

		int kk = binarySearch(list1, 4);

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
				while ((mid - 1 >= 0) && list[mid] == list[mid - 1]) {
					mid--;
				}
				return mid;
			} else {
				low = mid + 1;
			}
		}

		return -1; // insert location
	}

	// public static int binarySearch(int[] list, int key) {
	// int low = 0;
	// int upper = list.length - 1;
	// while (low <= upper) {
	// int mid = (low + upper) / 2;
	// if (list[mid] < key)
	// low = mid + 1;
	// else if (list[mid] > key)
	// upper = mid - 1;
	// else
	// return mid;
	// }
	// return -1;
	// }

}
