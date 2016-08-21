
public class Transform {

	public static void main(String[] args) {
		Transform Tf = new Transform();
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// 显示矩阵
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println();

		// 直接输出
		// for(int i = 0;i < mat.length;i++){
		// for(int j = 0;j < mat.length;j++){
		// System.out.print(mat[j][i]+"\t");
		// }
		// System.out.println();
		// }

		// 调用函数，然后输出转换后的矩阵
		Tf.transformImage(mat, mat.length);
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}

	}

	// 转换
	public int[][] transformImage(int[][] mat, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int temp = mat[i][j];
				mat[i][j] = mat[j][i];
				mat[j][i] = temp;
			}
		}
		return mat;
	}

}
