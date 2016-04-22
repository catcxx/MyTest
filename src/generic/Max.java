package generic;

import java.io.IOException;

public class Max {
	/** Return the maximum between two objects */
	public static Comparable max(Comparable o1, Comparable o2) {
		if (o1.compareTo(o2) > 0)
			return o1;
		else
			return o2;
	}

	public static void main(String[] args) throws IOException {
		Max m = new Max();
		System.out.println(m.max(2, 4));
		System.out.println(m.max("we", "fgv"));
		System.out.println(m.max("we", 34));
	}
}
