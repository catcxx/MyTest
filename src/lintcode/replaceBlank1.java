package lintcode;

public class replaceBlank1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		replaceBlank1 rb1 = new replaceBlank1();
		StringBuffer str = new StringBuffer("hello  world");
		
		System.out.println(rb1.replaceSpace(str));
	}

	public String replaceSpace(StringBuffer str) {
		String str1 = str.toString();
		String s = new String(str1.replaceAll("\\s","%20"));
		return s;
    }
}
