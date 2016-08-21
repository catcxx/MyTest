package lintcode;

public class CountOnes {
	public static void main(String args[]) {
		int[] nums = { 0, 1 };
		CountOnes co = new CountOnes();

		System.out.println(co.countOnes(32));

	}

	public int countOnes(int num) {
		Integer num1 = new Integer(num);
		String sn = Integer.toBinaryString(num1);
		System.out.println(sn);
		int count = 0;
		for (int i = 0; i < sn.length(); i++) {
			if (sn.charAt(i) == '1') {
				count++;
			}
		}
		return count;
	}
}
