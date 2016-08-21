package lintcode;

import java.util.ArrayList;

public class longestWords {

	public static void main(String[] args) {

		longestWords lw = new longestWords();
		String[] dictionary = { "dog", "doj", "doj",
				// "google",
				// "facebook",
				// "internationalization","internationalizatioo",
				// "blabla"
		};

		System.out.println(lw.longestWords(dictionary));
	}

	ArrayList<String> longestWords(String[] dictionary) {
		StringBuilder longest = new StringBuilder(dictionary[0]);
		ArrayList<String> l = new ArrayList<String>();

		for (int i = 0; i < dictionary.length; i++) {
			if (longest.length() < dictionary[i].length()) {
				l.clear();
				l.add(dictionary[i]);
				longest = new StringBuilder(dictionary[i]);
			} else if (longest.length() == dictionary[i].length()) {
				l.add(dictionary[i]);
			}
		}
		return l;
	}

}
