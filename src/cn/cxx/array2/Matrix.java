package cn.cxx.array2;

/**
 * Matrix add
 * 
 * @author Administrator
 *
 */
public class Matrix {

	public static void print(int[][] c) {
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {

				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] add(int a[][], int b[][]) {
		int c[][] = new int[a.length][a.length];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}

	public static void main(String[] args) {

		int[][] a = { { 1, 2 }, { 3, 4, }, };

		int[][] b = { { 1, 2 }, { 3, 4, }, };

		int[][] c = add(a, b);

		print(c);

	}
}
