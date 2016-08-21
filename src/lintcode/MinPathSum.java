package lintcode;

/**
 * 给定一个只含非负整数的m*n网格，找到一条从左上角到右下角的可以使数字和最小的路径 在同一时间只能向下或者向右移动一步
 * 
 * @author Administrator
 *
 */
public class MinPathSum {

	public static void main(String[] args) {
		MinPathSum mpm = new MinPathSum();
		int m = 3;
		int n = 4;
		int[][] grid = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				grid[i][j] = (int) (Math.random() * 10);
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
		mpm.minPathSum(grid);

	}

	public int minPathSum(int[][] grid) {
		// for(){
		//
		// }
		return 0;
	}
}
