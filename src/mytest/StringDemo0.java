package mytest;

/**
 * string: 1.不变性 String 对象一旦生成，则不能再对它进行改变。 这个特性可以泛化成不变 (immutable) 模式，
 * 即一个对象的状态在对象被创建之后就不再发生变化。 不变模式的主要作用在于当一个对象需要被多线程共享，
 * 并且访问频繁时，可以省略同步和锁等待的时间，从而大幅提高系统性能。
 * 
 * 2.针对常量池的优化。当两个 String 对象拥有相同的值时， 它们只引用常量池中的同一个拷贝，当同一个字符串反复出现时，
 * 这个技术可以大幅度节省内存空间。
 * 
 * 3. 类的 final 定义
 * 
 * @author Administrator
 *
 */
public class StringDemo0 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		String str4 = str1;
		System.out.println("is str1 = str2?" + (str1 == str2));
		System.out.println("is str1 = str3?" + (str1 == str3));
		System.out.println("is str1 refer to str3?" + (str1.intern() == str3.intern()));// intern()
																						// native
		System.out.println("is str1 refer to str3?" + (str1.equals(str3)));// equals
		System.out.println("is str1 = str4" + (str1 == str4));
		System.out.println("is str2 = str4" + (str2 == str4));
		System.out.println("is str4 refer to str3?" + (str4.intern() == str3.intern()));
	}
}
