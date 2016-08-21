package dp;

/**
 * ��̬�滮 �������ʽϵ��
 * 
 * @author Administrator
 *
 */
public class BinoCoeff {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// int result = Binomial(8, 3);
		System.out.println("���8�Ķ���ʽϵ����");
		for (int i = 0; i <= 8; i++)
			System.out.println("C" + "(" + 8 + "," + i + ")" + " �������� " + Binomial(8, i));
	}

	public static int Binomial(int n, int k) {
		// �������ʽϵ��C(n,k)
		int[][] result = new int[n + 1][n + 1];
		for (int i = 0; i <= n; i++) // �����������
		{
			for (int j = 0; j <= min(i, k); j++) // min(i,k)����һ����Ҫ�������
			{
				// if(j == 0 || j == k)//����д���ˣ������
				if (j == 0 || j == i)
					result[i][j] = 1;
				else
					result[i][j] = result[i - 1][j - 1] + result[i - 1][j];
			}
		}
		return result[n][k];
	}

	private static int min(int i, int k) {
		return (i <= k) ? i : k;
	}

}
