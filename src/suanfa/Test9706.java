package suanfa;

import java.util.ArrayList;
import java.util.Scanner;

public class Test9706 {
	public static void main(String[] args) {
		Test9706 mpm = new Test9706();
		// String s4 = "99706009706";
		// mpm.test9706(s4);

		// Scanner input = new Scanner(System.in);
		//
		// // Prompt the user to enter a string
		// System.out.print("Enter a integer: ");
		// String s = input.nextLine();
		// int num = Integer.parseInt(s);
		// String[] str = new String[num];
		// while(num>0){
		// Scanner sc = new Scanner(System.in);
		// System.out.print("Enter a string num: ");
		// String st = input.nextLine();
		// }
		int num = 4;
		String s1 = "6097";
		String s2 = "97069706";
		String s3 = "99777009706";
		String s4 = "99706009706";
		ArrayList<String> al = new ArrayList<String>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		mpm.test9706(al);
		// System.out.println(tz.trailingZeros(num));
	}

	// public int test9706(String s) {
	// StringBuilder sb = new StringBuilder(s.replaceAll("9706", "p"));
	// int count = 0;
	// for (int j = 0; j < sb.length(); j++) {
	// if (sb.charAt(j) == 'p') {
	// count++;
	// }
	// }
	// System.out.println(count);
	// return count;
	// }

	public int[] test9706( ArrayList<String> al) {
		int[] count = new int[al.size()];
		StringBuilder[] sb = new StringBuilder[al.size()];
		for (int i = 0; i < al.size(); i++) {
			sb[i] = new StringBuilder(al.get(i).replaceAll("9706", "p"));
			for (int j = 0; j < sb[i].length(); j++) {
				if (sb[i].charAt(j) == 'p') {
					count[i]++;
				}
			}
		}
		for (int ii = 0; ii < al.size(); ii++) {
			System.out.println(count[ii]);
		}
		return count;
	}
}
