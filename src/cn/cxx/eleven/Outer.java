package cn.cxx.eleven;

public class Outer {
	public static void main(String[] args) {
		Face f = new Face();
		Face.Nose n = f.new Nose();
		n.breath();
		Face.Ear e = new Face.Ear();// 静态内部类
		e.listen();
	}

}

class Face {
	int type = 9;
	String facetype = "瓜子";
	static String color = "红润";

	class Nose {// 内部类
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
			System.out.println(" 我在听");
			System.out.println(color);
		}
	}
}