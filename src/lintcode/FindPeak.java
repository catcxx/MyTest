package lintcode;

public class FindPeak {

	public static void main(String[] args) {
		FindPeak fp = new FindPeak();
		int[] Arr = { 1, 2, 1, 3, 4, 5, 7, 6 };
		
		System.out.println(fp.findPeak(Arr));
	}

	public int findPeak(int[] A) {
		if (A[1] > A[2]) {
			return 1;
		} else if (A[A.length - 2] > A[A.length - 3]) {
			return A.length - 2;
		} else {
			for (int i = 1; i < A.length-1; i++) {
				 if(A[i]>A[i-1]&&A[i+1]<A[i]){
					 return i;
				 }
			}
		}
		return 0;
	}

}
