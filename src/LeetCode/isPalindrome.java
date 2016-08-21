package LeetCode;

public class isPalindrome {

	public static void main(String[] args) {
		isPalindrome ip = new isPalindrome();
		// ip.isPalindrome(7876);
		System.out.println(ip.isPalindrome(-2147447412));
	}

	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		int count = 0;
		int xx = x;
		while (x != 0) {
			x = x / 10;
			count++;
		}
		// System.out.println(count);

		int[] arr = new int[count];

		for (int i = 0; i < count; i++) {
			arr[i] = xx % 10;

			xx /= 10;
			// System.out.println(arr[i]);
		}

		int low = 0;
		int high = count - 1;
		while (low < high) {
			if (arr[low] != arr[high]) {
				return false; // Not a palindrome
			}
			low++;
			high--;
		}

		return true; // is a palindrome
	}

	// //used extra space
	// public boolean isPalindrome(int x) {
	// Integer itg = x;
	// StringBuilder sb = new StringBuilder(itg.toString());
	// StringBuilder resb=new StringBuilder(itg.toString());
	//
	// sb.reverse();
	// // System.out.println(sb+" "+resb);
	// return sb.equals(resb);
	// }

}
