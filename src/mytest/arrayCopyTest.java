package mytest;

/**
 * System.arraycopy() 函数是 native 函数，通常 native 函数的性能要优于普通的函数， arraycopy
 * 的本质是让处理器利用一条指令处理一个数组中的多条记录，只需指定头指针， 然后开始循环即可，即执行一次指令，指针就后移一个位置，操作多少数据就循环多少次。
 * 如果在应用程序中需要进行数组复制，应该使用这个函数，而不是自己实现 调用的为 C++编写的底层函数，可见其为 JDK 中的底层函数
 * 
 * @author Administrator
 *
 */
public class arrayCopyTest {
	public static void arrayCopy() {
		int size = 10000000;
		int[] array = new int[size];
		int[] arraydestination = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		long start = System.currentTimeMillis();
		for (int j = 0; j < 1000; j++) {//copy 1000 times
			System.arraycopy(array, 0, arraydestination, 0, size);// native																
		}
		System.out.println(System.currentTimeMillis() - start);
//		System.out.println(arraydestination[10000]);
	}

	public static void arrayCopySelf() {
		int size = 10000000;
		int[] array = new int[size];
		int[] arraydestination = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {//copy 1000 times
			for (int j = 0; j < size; j++) {
				arraydestination[j] = array[j];// 自己实现的方式，采用数组的数据互换方式
			}
		}
		System.out.println(System.currentTimeMillis() - start);
//		System.out.println(arraydestination[10000]);
	}

	public static void main(String[] args) {
		arrayCopyTest.arrayCopy();
		arrayCopyTest.arrayCopySelf();
	}
}