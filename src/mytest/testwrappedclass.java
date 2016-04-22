package mytest;

public class testwrappedclass {
public static void main(String[] args){
	Integer i=new Integer(10);
	System.out.println(i);
	System.out.println(Integer.MAX_VALUE);
	System.out.println(i.toBinaryString(i));
	
	Integer i2=Integer.parseInt("89");
	System.out.println(i2+1);
	
	//String str=i2.toString();
	
	System.out.println(i.reverse(i));//按位取反
	
	System.out.println(Integer.compare(2, 1));
	
	System.out.println(i2.longValue());//
	
}
}
