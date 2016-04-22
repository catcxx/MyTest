package cn.cxx.stringbuilder;

public class Test {

	public static void main(String[] args) {
	String s ="java";
	StringBuilder sb = new StringBuilder(s);
	change(s,sb);
	System.out.println("out :"+s);//The original String object has not been changed
	System.out.println(sb);
	}

	private static void change(String s, StringBuilder sb) {
		s = s + " and html"; 
		//s = s + " and HTML" creates a new String object s,
		//which is different from the original String
		
		System.out.println("in :"+s);
		sb.append(" and html");
		
	}

}
