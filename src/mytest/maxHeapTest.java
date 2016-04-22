package mytest;

/**
 * Java 应用程序可以使用的最大堆可以用-Xmx 参数指定。最大堆指的是新生代和老生代的大小之和的最大值,本例配置为-Xmx5M
 * 
 * 参数-Xmn 或者用于 Hot Spot 虚拟机中的参数-XX:NewSize(新生代初始大小)、-XX：MaxNewSize 用于设置新生代的大小。
 * 设置一个较大的新生代会减小老生代的大小，这个参数对系统性能以及 GC 行为有很大的影响。新生代的大小一般设置为整个
 * 堆空间的 1/4 到 1/3 左右。
 * 
 * 若使用 JVM 参数-XX:+PrintGCDetails -Xmx11M -XX:NewSize=2M -XX:MaxNewSize=2M -verbose:gc 运行程序，
 * 将新生代的大小减小为 2MB，那么 MinorGC 次数将从 4 次增加到 9 次 (默认情况下是 3.5MB 左右)。
 */
import java.util.Vector;

public class maxHeapTest {
	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("Max memory:" + Runtime.getRuntime().maxMemory());
		for (int i = 0; i <= 100; i++) {
			byte[] b = new byte[1024 * 1024];
			v.add(b);
			System.out.println(i + "M is allocated");
		}
		System.out.println("Max memory:" + Runtime.getRuntime().freeMemory());
//		System.out.println("Max memory:" + Runtime.getRuntime().totalMemory());
	}
}
