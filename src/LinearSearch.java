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

	/** Use linear search to find the key in the list */
	private static int LinearSearch(int[] list, int num) {
		// TODO Auto-generated method stub
		for (int i = 0; i < list.length; i++) {
			if (list[i] == num) {
				return i;
			}
		}
		return -1;
	}
}
