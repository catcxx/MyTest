package cn.cxx.eleven;

public class Outer {
	public static void main(String[] args) {
		Face f = new Face();
		Face.Nose n = f.new Nose();
		n.breath();
		Face.Ear e = new Face.Ear();// ��̬�ڲ���
		e.listen();
	}

}

class Face {
	int type = 9;
	String facetype = "����";
	static String color = "����";

	class Nose {// �ڲ���
		String type;

		void breath() {
			System.out.println("breath");
			System.out.println(this.type);
			System.out.println(Face.this.type);
			System.out.println(facetype);
		}

	}

	static class Ear {
		void listen() {
			System.out.println(" ������");
			System.out.println(color);
		}
	}
}