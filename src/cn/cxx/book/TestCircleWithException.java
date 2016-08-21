package cn.cxx.book;

public class TestCircleWithException {
	public static void main(String[] args) {
		try {
			CircleWithException c1 = new CircleWithException(5);
			// System.out.println(c1);

			CircleWithException c2 = new CircleWithException(-5);
			// System.out.println(c2);

			CircleWithException c3 = new CircleWithException(0);
			// System.out.println(c3);

		} catch (IllegalArgumentException ex) {
			System.out.println(ex);
		}

		System.out.println("Number of objects created: " + CircleWithException.getNumberOfObjects());

	}

}
