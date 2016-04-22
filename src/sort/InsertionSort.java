package sort;

public class InsertionSort {
	/** The method for sorting the numbers */

	public static void main(String[] args) {
		double[] list = { 4, 2.0, 1, 7, 11, 12 };

		// int[] sortlist = selectSort(list);
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();

		double[] insertionSort = insertionSort(list);
		for (int i = 0; i < list.length; i++) {
			System.out.print(insertionSort[i] + " ");
		}

	}

	public static double[] insertionSort(double[] list) {
		for (int i = 1; i < list.length; i++) {
			/**
			 * insert list[i] into a sorted sublist list[0..i-1] so that
			 * list[0..i] is sorted.
			 */
			double currentElement = list[i];
			int k;
			for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
				list[k + 1] = list[k];
			}

			// Insert the current element into list[k+1]
			list[k + 1] = currentElement;
		}
		return list;

	}
}
