package lintcode;

/**
 * 给一个01矩阵，求不同的岛屿的个数。
 * 
 * 0代表海，1代表岛，如果两个1相邻，那么这两个1属于同一个岛。我们只考虑上下左右为相邻。
 * 
 * @author Administrator
 *
 */
public class NumIslands {
	public static void main(String args[]) {
		int[][] nums = { { 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 1 },
				{ 0, 0, 0, 1, 1 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 1 } };
		NumIslands nl = new NumIslands();

		System.out.print(nl.numIslands(nums));

	}

	public int numIslands(int[][] grid) {
		// for(int i=0;i<grid.){
		//
		// }

		return 0;
	}
}
