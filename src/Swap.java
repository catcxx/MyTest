
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swap1(4,5);
		System.out.println("--------");
		swap1(4,5);
	}
	
	/**
	 * swap a,b
	 * @param a
	 * @param b
	 */
	public static void swap1(int a,int b){
		System.out.println(a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
	}
	
	/**
	 * swap a,b
	 * @param a
	 * @param b
	 */
	public static void swap2(int a,int b){
		System.out.println(a+" "+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a+" "+b);
	}
}
