package lintcode;

/**
 * /**
 * 样例:
 给出s = "the sky is blue"，返回"blue is sky the"

 说明:
 单词的构成：无空格字母构成一个单词
 输入字符串是否包括前导或者尾随空格？可以包括，但是反转后的字符不能包括
 如何处理两个单词间的多个空格？在反转字符串中间空格减少到只含一个
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class reverseWords {

	public static void main(String[] args) {
		reverseWords rw = new reverseWords();
		String s = "  the sky is     is blue  ";

		System.out.println(rw.reverseWords(s));
	}

	public String reverseWords(String s) {

		List<String> al = new ArrayList<String>();
		s = s.trim();
		String[] it = s.split("\\s+");

		for (int i = 0; i < it.length; i++) {
			al.add(it[i]);
		}

		Collections.reverse(al);
		String als = "";

		for (int i = 0; i < al.size(); i++) {
			als = als + al.get(i);
			als += " ";
		}

		als = als.trim();
		return als;

	}

}
