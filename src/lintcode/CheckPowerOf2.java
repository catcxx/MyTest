package lintcode;

/**
 * �� O(1) ʱ�������� n �Ƿ��� 2 ���ݴΡ�
 * 
 * @author Administrator
 *
 */
public class CheckPowerOf2 {
	public static void main(String args[]) {

		CheckPowerOf2 fm = new CheckPowerOf2();

		System.out.print(fm.checkPowerOf2(0));

	}

	public boolean checkPowerOf2(int n) {
		if (n <= 0) {
			return false;
		}
		if ((n & (n - 1)) == 0) {
			return true;
		} else {
			return false;
		}
	}
}
