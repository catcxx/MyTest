package cn.cxx.array;

public class TestString {
public static void main(String[] args){
	String str=new String("abcd");
	char c[]={'a','b'};
	String str2=new String("abcd");
	String str1=new String(c);
	String  str3="abcdb";
	String  str4="abcd";
	System.out.println(str.charAt(2));
	System.out.println(str.equals(str2));//比较内容是否相等
	System.out.println(str==str2);
	System.out.println(str==str3);
	System.out.println(str.equals(str3));
	System.out.println(str3.equals(str4));
	System.out.println(str3==str4);
	
	String str5=str3.replace('b', '0');
	System.out.println(str5);
	
	System.out.println(str3.indexOf('b'));
	System.out.println(str3.lastIndexOf('b'));
	
	String str6="abcd,nn,sdss";
	String[] strarray=str6.split(",");
	for(int i=0;i<strarray.length;i++){
		System.out.println(strarray[i]);
	}
	
	String str7="  ab  aa  ";
	String str77=str7.trim();
	System.out.println(str77);
	
	System.out.println("abcd".startsWith("ab"));
	System.out.println("abcd".endsWith("ab"));
	
	System.out.println(str3.substring(0,2));
	
	
}
}
