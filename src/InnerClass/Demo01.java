package InnerClass;

public class Demo01 {

	// ��̬�ڲ���
	private static class StaticNestedClass {

	}

	// ��ͨ�ڲ��ࣨ��Ա�ڲ��ࣩ
	private class FieldInnerClass {

	}

	void sayHello() {
		// �����ֲ��ࣨ�ֲ��ڲ��ࣩ
		class LocalClass {

		}
		// �����ڲ���
		Runnable runable = new Runnable() {// ���������ڲ�������壬���������ڲ����ʵ��

			@Override
			public void run() {
				// TODO Auto-generated method stub

			}

		};
	}
}
