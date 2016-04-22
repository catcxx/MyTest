package lintcode;

import java.util.ArrayList;
import java.util.List;

public class compareStrings {

	public static void main(String[] args) {
		// compareStrings cs1 =new compareStrings();
		// //cs1.compareStrings("ABCD", "ABC");

		compareStrings cs2 = new compareStrings();
		// cs2.compareStrings("ABCD", "AABC");
		System.out.println(cs2.compareStrings("ABCD", "AABC"));

	}

	public boolean compareStrings(String A, String B) {
		List<String> aal = new ArrayList<String>();
		List<String> bal = new ArrayList<String>();
		for (int i = 0; i < A.length(); i++) {
			aal.add(A.substring(i, i + 1));
		}
		for (int i = 0; i < B.length(); i++) {
			bal.add(B.substring(i, i + 1));
		}

		for (int i = 0; i < B.length(); i++) {
			if (aal.contains(bal.get(i))) {
				aal.remove(aal.indexOf(bal.get(i)));
			} else {
				return false;
			}
		}

		return true;
	}

}
