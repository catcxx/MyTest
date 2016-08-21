import java.util.Scanner;

/*
 * »ØÎÄÊý
 */
public class PalindromeIgnoreNonAlphanumeric {
	/** Main method */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String s = input.nextLine();

		// Display result
		System.out.println("Ignoring non-alphanumeric characters, \nis " + s + " a palindrome? " + isPalindrome(s));
	}

	/** Return true if a string is a palindrome */
	public static boolean isPalindrome(String s) {
		// Create a new string by eliminating non-alphanumeric chars
		String s1 = filter(s);

		String s2 = reverse(s1);/////////// rewrite
		// StringBuilder sb1 = new StringBuilder(s1);
		// String s2 = sb1.reverse().toString();

		return s2.equals(s1);
	}

	/** Create a new string by eliminating non-alphanumeric chars */
	public static String filter(String s) {
		// Create a string builder
		StringBuilder stringBuilder = new StringBuilder();

		// Examine each char in the string to skip alphanumeric char
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetterOrDigit(s.charAt(i))) {
				stringBuilder.append(s.charAt(i));
			}
		}

		return stringBuilder.toString();
	}

	/** Create a new string by reversing a specified string */
	/////////// rewrite

	public static String reverse(String s) {
		StringBuilder stringBuilder = new StringBuilder(s);
		stringBuilder.reverse(); // Invoke reverse in StringBuilder
		return stringBuilder.toString();
	}
}
