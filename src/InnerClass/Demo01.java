package InnerClass;

public class Demo01 {

	// 静态内部类
	private static class StaticNestedClass {

	}

	// 普通内部类（成员内部类）
	private class FieldInnerClass {

	}

	void sayHello() {
		// 方法局部类（局部内部类）
		class LocalClass {

		}
		// 匿名内部类
		Runnable runable = new Runnable() {// 定义匿名内部类的类体，创建匿名内部类的实例

			@Override
			public void run() {
				// TODO Auto-generated method stub

			}

		};
	}
}
