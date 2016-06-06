package classloader;
/**
 * classloader
 * @param args
 */
public class GetClassLoader {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ClassLoader.getSystemClassLoader());
		System.out.println(ClassLoader.getSystemClassLoader().getParent());
		System.out.println(ClassLoader.getSystemClassLoader().getParent().getParent());//native
		
		System.out.println(System.getProperty("java.class.path"));//classpath
	}

}
