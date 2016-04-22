public class utilSort {
	public static void main(String[] args) {
		int[] list = { 4, 2, 1, 7, 11, 12 };

		// int[] sortlist = selectSort(list);
		for (int i = 0; i < list.length; i++) {

			System.out.print(list[i]+" ");

		}

		java.util.Arrays.sort(list);
		System.out.println();
		for (int i = 0; i < list.length; i++) {

			System.out.print(list[i]+" ");

		}

	}
}
