package mytest;
/**
 * 输入两个不同的字符串，编写一个函数找到字符串不同的位置，并返回不同出的下标。
 * @author Administrator
 *
 */
public class diffString {
	public static void main(String[] args) {
		String s1 = "abcde";
		String s2 = "abhdes";
		diffString ds = new diffString();
		ds.diff(s1, s2);
	}

	private void diff(String s1, String s2) {
		int l = Math.max(s1.length(), s2.length());
		for (int i = 0; i < l; i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				System.out.println("not same at index:" + i);
				break;
			} else {
				System.out.println("same at index:" + i);
			}
		}
	}

}
