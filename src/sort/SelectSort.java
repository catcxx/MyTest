package sort;

public class SelectSort {

	public static void main(String[] args) {
		int[] list = { 4, 2, 1, 7, 11, 12 };

		// int[] sortlist = selectSort(list);
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();

		int[] selectionSort = selectionSort(list);
		for (int i = 0; i < list.length; i++) {
			System.out.print(selectionSort[i] + " ");
		}

	}

	/** The method for sorting the numbers */
	private static int[] selectionSort(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			// Find the minimum in the list[i..list.length-1]
			int currentMin = list[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}

			// Swap list[i] with list[currentMinIndex] if necessary;
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
		return list;
	}

	// //////////////////////////////////////////////
	// private static int[] selectSort(int[] li) {
	// int[] sortlist = new int[li.length];
	// for(int i=0;i<li.length;i++){
	// sortlist[i] = SelectSort.min(li);
	//
	// // for(int j=i+1;j<li.length;j++){
	// // sortlist[i] = SelectSort.min(li);
	// // }
	// }
	// return sortlist;
	// }

	// public static int min(int[] l) {
	// int min = l[0];
	//
	// for(int i=1;i<l.length;i++){
	//
	// if(l[0]>l[i]){
	// min = l[i];
	// }
	// }
	// return min;
	// }

	// public static int min(Integer... num) {
	// int min = 65535;
	//
	// if(num!=null&num.length>0){
	// for(int i = 0;i<num.length ;i++){
	// if(num[i]<min){
	// min=num[i];
	// }
	// }
	// }
	//
	// return min;
	// }

}
