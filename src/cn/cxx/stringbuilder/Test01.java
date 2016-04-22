package cn.cxx.stringbuilder;
/**
 * string 不可变字符序列
 * 可变字符序列stringbuilder(线程不安全，效率高）,string buffer线程安全，效率低
 * @author Administrator
 *
 */
public class Test01 {
	public static void main(String[] args){
		StringBuilder sb= new StringBuilder();//16
		StringBuilder sb1= new StringBuilder(32);//32
		StringBuilder sb2= new StringBuilder("abcd");//32+4
		sb2.append("efg");
		sb2.append(true).append(321).append("as");//通过return this 实现方法链
		
		System.out.println(sb2);
		
		StringBuilder sb3= new StringBuilder("hjjh");
		for(int i=0;i<3;i++){
			sb3=sb3.append(i);
		}
		System.out.println(sb3);
		
		//replace
		String s= "Welcome to Java";
//		s=s+"aaa";
		
		System.out.println(s.length());
		System.out.println(s.toCharArray());
		System.out.println("replace: "+s.replace('o', 'O'));
		System.out.println("replace: "+s.replace("to", "TO"));
		System.out.println("replaceall: "+s.replaceAll("o", "O"));
		System.out.println("replacefirst: "+s.replaceFirst("o", "O"));
		
		//valueof method   char char[] int=>string
		char ch = 'a';
		char[] arr = {'a','b'};
		int a = 2;
		String strch = String.valueOf(ch);
		String strarr = String.valueOf(arr);
		String stra = String.valueOf(a);
		System.out.println(strch+" "+strarr+" "+stra);
	}

}
