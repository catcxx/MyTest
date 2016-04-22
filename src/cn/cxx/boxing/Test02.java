package cn.cxx.boxing;


/**
 * 测试自动装箱和拆箱
 * @author Administrator
 *
 */

public class Test02 {
public static void main(String[] args){
	//Integer a = new Integer(1000);
	Integer a =1000;//1.5以后编译器自动装箱，优化Integer a = new Integer(1000);
	
	int c = new Integer(1000);//编译器,自动拆箱new Integer(1000).intValue
	
	
	Integer d = 12334;
	Integer d1 = 12334;
	
	System.out.println(d==d1);
	System.out.println(d.equals(d1));
	
	Integer d3=-127;
	Integer d4=-127;//[-128,127]间的数，使用基本数据类型
	System.out.println(d3==d4);
	System.out.println(d3.equals(d4));
}
}
