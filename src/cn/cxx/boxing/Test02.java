package cn.cxx.boxing;


/**
 * �����Զ�װ��Ͳ���
 * @author Administrator
 *
 */

public class Test02 {
public static void main(String[] args){
	//Integer a = new Integer(1000);
	Integer a =1000;//1.5�Ժ�������Զ�װ�䣬�Ż�Integer a = new Integer(1000);
	
	int c = new Integer(1000);//������,�Զ�����new Integer(1000).intValue
	
	
	Integer d = 12334;
	Integer d1 = 12334;
	
	System.out.println(d==d1);
	System.out.println(d.equals(d1));
	
	Integer d3=-127;
	Integer d4=-127;//[-128,127]�������ʹ�û�����������
	System.out.println(d3==d4);
	System.out.println(d3.equals(d4));
}
}
