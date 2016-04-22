package cn.cxx.eleven;
/**
 * 
 * @author Administrator
 *
 */
public abstract class Father<T> {
	T name;
	public abstract void test(T t);
		
	
}


class Child1<T> extends Father<String>{
	String t2;

	public void test(String t) {
		
	}
	
}

class Child2<T> extends Father<String>{
	String t2;

	public void test(String t) {
		
	}
	
}