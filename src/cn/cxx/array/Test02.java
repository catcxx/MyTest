package cn.cxx.array;
/**
 * �����﷨
 * @author Administrator
 *
 */
public class Test02 {
public static void main(String[] args ){
	//����
	int a[];
	//�����������
	a=new int [3];
	//��ʼ��
	a[0]=1;
	a[1]=2;
	a[2]=3;
	
	for(int i=0;i<a.length;i++){//��̬��ʼ��
		a[i]=i*8;
	}
	
	int c[]={1,2,3};//��̬��ʼ��
	
	Car cars[]={new Car("benz"),new Car("bwm")};
}

}
