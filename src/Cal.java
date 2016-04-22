
public class Cal {
public static void main(String[] args){
	
	double j=5.0-0.1-0.1;
	System.out.println(j);              //double 不能准确存储
	System.out.println(5.0-0.1-0.1);  //float 不能准确存储
	
	System.out.println("he said \"java is fun\""); //转义符
	
	char letter = 'A';	//ascii code
	char letter1 = '\u0041';	//unicode
	System.out.println(letter);
	System.out.println(letter1);
	
	char ch = 'a';
	System.out.println(++ch);
	System.out.println((int)ch);	//类型转换，强制
	//System.out.println((double)ch);	//类型转换，强制
	System.out.println((byte)ch);	//类型转换，强制
	
	System.out.println((char)80);
	
//	byte b = '\uFFF4';			隐式转换，若超过范围会出错
	byte b1 = (byte)'\uFFF4';	//类型转换，强制
	byte b2 = (byte)'\u0001';
	System.out.println(b2+"hi"+'a'+" "+b1);	
	
}
}
