package cn.cxx.array;
/**
 * 基本语法
 * @author Administrator
 *
 */
public class Test02 {
public static void main(String[] args ){
	//申明
	int a[];
	//创建数组对象
	a=new int [3];
	//初始化
	a[0]=1;
	a[1]=2;
	a[2]=3;
	
	for(int i=0;i<a.length;i++){//动态初始化
		a[i]=i*8;
	}
	
	int c[]={1,2,3};//静态初始化
	
	Car cars[]={new Car("benz"),new Car("bwm")};
}

}
