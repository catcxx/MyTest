package cn.cxx.callback;

public class PaintFrame {
	public static void drawFrame(IMyFrame f) {
		System.out.println("启动进程");
		System.out.println("增加循环");
		System.out.println("查看消息栈");
		// 画窗口
		f.paint();
		System.out.println("启动缓存");

	}

	public static void main(String[] args) {

		drawFrame(new GameFrame02());

	}

}

class GameFrame01 implements IMyFrame {
	public void paint() {
		System.out.println("game01paint");
		System.out.println("画窗口");
	}
}

class GameFrame02 implements IMyFrame {
	public void paint() {
		System.out.println("game02paint");
		System.out.println("画窗口");
	}
}
