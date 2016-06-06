package test;

class B extends Object{
	static {
		System.out.println("load b");
	}
	public B(){
		System.out.println("create b");
	}
	static {
		System.out.println("load b");
	}
}

class A extends B{
	static{
		System.out.println("load a");
	}
	public A(){
		System.out.println("create a");
	}
}

public class Testclass {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.getClass().isInstance(Cloneable.class));
		System.out.println(a.getClass().isInstance(Object.class));
	}

}
