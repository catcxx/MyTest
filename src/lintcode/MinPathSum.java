package lintcode;

/**
 * ����һ��ֻ���Ǹ�������m*n�����ҵ�һ�������Ͻǵ����½ǵĿ���ʹ���ֺ���С��·�� ��ͬһʱ��ֻ�����»��������ƶ�һ��
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
