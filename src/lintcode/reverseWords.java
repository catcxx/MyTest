package lintcode;

/**
 * /**
 * ����:
 ����s = "the sky is blue"������"blue is sky the"

 ˵��:
 ���ʵĹ��ɣ��޿ո���ĸ����һ������
 �����ַ����Ƿ����ǰ������β��ո񣿿��԰��������Ƿ�ת����ַ����ܰ���
 ��δ����������ʼ�Ķ���ո��ڷ�ת�ַ����м�ո���ٵ�ֻ��һ��
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
