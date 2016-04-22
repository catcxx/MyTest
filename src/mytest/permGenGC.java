package mytest;

/**
 * String.intern() 方法的含义是如果常量池中已经存在当前 String，则返回池中的对象，如果常量池中不存在当前 String 对象，则先将
 * String 加入常量池，并返回池中的对象引用。 因此，不停地将 String 对象加入常量池会导致永久区饱和。如果 GC
 * 不能回收永久区的这些常量数据，那么就会抛出 OutofMemoryError 错误。 每当常量池饱和时,FULL GC
 * 总能顺利回收常量池数据，确保程序稳定持续进行。
 * 
 * @author Administrator
 *
 */
public class permGenGC {
	public static void main(String[] args) {
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			String t = String.valueOf(i).intern();// 加入常量池
		}
	}
}
