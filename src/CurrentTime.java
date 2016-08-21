
public class CurrentTime {
	/**
	 * 用Current time随机产生大小字母
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		long time = System.currentTimeMillis();
		int num = (int) time % 25 + 65; // 65-90 A-Z
		char ch = (char) num;
		System.out.println(ch);

		double x = 2.0 / 3;
		System.out.println("x :" + (int) (x * 100) / 100.0); // 取小数点后两位

		// boolean b = true;
		// int i = (int)b;
		//
		// int j=1;
		// boolean bb =(boolean)j;

		System.out.println(Math.random());// greater than or equal to 0.0 and
											// less than 1.0

		System.out.println((int) (Math.random() * 20));// [0-20)
		System.out.println((int) (Math.random() * 10 + 10));// [10-20)
		System.out.println((int) (Math.random() * 41 + 10));// [10-50]

		int xx = 1;
		System.out.println((xx >= 1) && (xx++ > 1));

		System.out.println(Math.abs(1));
	}

}
