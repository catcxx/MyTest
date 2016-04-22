package LeetCode;

public class hammingWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hammingWeight hw = new hammingWeight();

		System.out.println(hw.hammingWeight(11));
	}

	public int hammingWeight(int n) {

		Integer num = new Integer(n);
		String s = num.toBinaryString(n);
		System.out.println(s);
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1') {
				count++;
				// System.out.println(count);
			}
		}

		return count;
	}

}
