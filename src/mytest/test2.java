package mytest;

public class test2 {
	public void add(Byte b) {
		b = b++;
	}

	public void test() {
		Byte a = 127;//// byte -128,127
		Byte b = 127;
		++a;
		System.out.print(a + " ");
		add(a);
		System.out.print(a + " ");
		add(b);
		System.out.print(b + "");
	}

	public static void main(String[] args) {

		test2 t = new test2();
		t.test();

	}
}
