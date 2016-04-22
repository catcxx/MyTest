package cn.cxx.array;

public class Test01 {
public static void main(String[] args){
	int a[]=new int[3];
	a[0]=1;
	a[1]=2;
	a[2]=3;
	
	
	double b[]=new double[2];
	Car C[]=new Car[10];
	C[0]=new Car("bmw");
	C[1]=new Car("byd");
	System.out.println(C[0].name);
	System.out.println(C.length);
	//System.out.println(System.getenv());

	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
}
}
