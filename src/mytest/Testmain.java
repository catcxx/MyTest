package mytest;

//µ¥Ïß³Ì
public class Testmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method2("hi");
	}

	public static void method1(String str) {
		System.out.println("method1...");
		System.out.println(str);
	}

	public static void method2(String str) {
		System.out.println("method2...");
		method1(str);
	}

}
