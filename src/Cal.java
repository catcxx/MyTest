
public class Cal {
public static void main(String[] args){
	
	double j=5.0-0.1-0.1;
	System.out.println(j);              //double ����׼ȷ�洢
	System.out.println(5.0-0.1-0.1);  //float ����׼ȷ�洢
	
	System.out.println("he said \"java is fun\""); //ת���
	
	char letter = 'A';	//ascii code
	char letter1 = '\u0041';	//unicode
	System.out.println(letter);
	System.out.println(letter1);
	
	char ch = 'a';
	System.out.println(++ch);
	System.out.println((int)ch);	//����ת����ǿ��
	//System.out.println((double)ch);	//����ת����ǿ��
	System.out.println((byte)ch);	//����ת����ǿ��
	
	System.out.println((char)80);
	
//	byte b = '\uFFF4';			��ʽת������������Χ�����
	byte b1 = (byte)'\uFFF4';	//����ת����ǿ��
	byte b2 = (byte)'\u0001';
	System.out.println(b2+"hi"+'a'+" "+b1);	
	
}
}
