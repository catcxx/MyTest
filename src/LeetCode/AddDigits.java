package LeetCode;

public class AddDigits {
	public static void main(String[] args) {
		AddDigits tz = new AddDigits();
		int num = 38;
		System.out.println(tz.addDigits(num));
	}

	// public int addDigits(int num) { //niubi
	// return 1 + (num-1) % 9;
	// }

	public int addDigits(int num) {

		int result = num;
		while (true) {
			if (result < 10) {
				return result;
			}
			num = result;
			result = 0;
			while (num > 0) {
				result = result + num % 10;
				num = num / 10;
			}
		}
	}
}
