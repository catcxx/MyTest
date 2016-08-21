import java.util.Scanner;

/**
 * 932->9+3+2=14
 * 
 * @author Administrator
 *
 */

public class Cal01 {
	public static void main(String[] args) {
		System.out.println("please input number 0-1000: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		int num1, num2, num3 = 0;
		num1 = number % 10;// 个位
		num2 = number / 10;
		num3 = num2;
		num2 = num2 % 10;// 十位
		num3 = num3 / 10;// 百位

		int sum = num1 + num2 + num3;
		System.out.println("sum of  " + number + " is: " + sum);
		System.out.println("sum of  " + number + " is: cal " + cal(number));
	}

	// -------
	public static int cal(int number) {
		int sum = 0;
		int num = 0;
		while (number > 0) {
			num = number % 10;
			sum = sum + num;
			number = number / 10;
		}
		return sum;

	}
}
