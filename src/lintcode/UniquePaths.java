package lintcode;

public class UniquePaths {
	public static void main(String args[]) {

		UniquePaths fm = new UniquePaths();
		int m = 3;
		int n = 7;
		long start = System.nanoTime();
		System.out.println(fm.uniquePaths(m, n));
		long end = System.nanoTime();
		System.out.print(end - start);

	}

	// public int uniquePaths(int m, int n) {
	// if(m == 1 || n == 1) return 1;
	// m--; n--;
	// long factorial = 1;
	//
	// for(int num1=1;num1<=n;num1++){
	// factorial=factorial*(m+num1)/num1;//×éºÏ C£¨(m+n-2)£¬(n-1)£©
	// }
	// return (int)factorial;
	// }

	public int uniquePaths(int m, int n) { // ²»¶®
		if (m == 0 || n == 0) {
			return 0;
		}

		int[][] sum = new int[m][n];
		for (int i = 0; i < m; i++) {
			sum[i][0] = 1;
		}
		for (int i = 0; i < n; i++) {
			sum[0][i] = 1;
		}
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				sum[i][j] = sum[i - 1][j] + sum[i][j - 1];
			}
		}
		return sum[m - 1][n - 1];
	}

}
