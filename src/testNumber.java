
public class testNumber {

	public static void main(String[] args) {

		Integer length = (int) ((Math.random()) * 1001);
		// Integer length = 8;
		String[] str = new String[length + 1];
		str[0] = length.toString();
		// str[1]= "1" ;
		// str[2]= "2" ;//2 4 5 6 7 9 16
		// str[3]= "4";
		// str[4]= "5";
		// str[5]= "6";
		// str[6]= "7";
		// str[7]= "9";
		// str[8]= "16";

		for (int j = 1; j <= length; j++) {
			Integer num = (int) ((Math.random()) * 1001);
			str[j] = num.toString();
			System.out.print(str[j] + " ");
		}

		int A1 = 0;
		int A2 = 0;
		int A3 = 0;
		int A4 = 0;
		int A5 = 0;
		int count1 = 0;
		int count3 = 0;
		for (int j = 1; j < str.length; j++) {
			int n = Integer.valueOf(str[j]);

			if (n % 10 == 0) {
				A1 = A1 + n;
			} else if (n % 5 == 1) {

				A2 = (int) Math.pow((-1), count1) * n + A2;
				count1++;
			} else if (n % 5 == 2) {
				A3++;
			} else if (n % 5 == 3) {

				A4 = n + A4;
				count3++;
			} else if (n % 5 == 4) {
				if (n > A5) {
					A5 = n;
				}
			}

		}

		if (A1 != 0) {
			System.out.print(A1 + " ");
		} else {
			System.out.print("N ");
		}

		if (count1 != 0) {
			System.out.print(A2 + " ");
		} else {
			System.out.print("N ");
		}

		if (A3 != 0) {
			System.out.print(A3 + " ");
		} else {
			System.out.print("N ");
		}

		if (A4 != 0 && count3 != 0) {
			System.out.print(((int) ((A4 / count3) * 10)) / 10 + " ");
		} else {
			System.out.print("N ");
		}

		if (A5 != 0) {
			System.out.print(A5);
		} else {
			System.out.print("N ");
		}

	}

}
