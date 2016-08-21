import java.util.Scanner;

/*
 * calculate area
 * @param radius
 * 
 */
public class Exercise2r {
	public static void main(String[] args) {
		double pi = 3.14;
		double radius;
		double radius1;
		double area;

		// 1.read in radius create a scanner object
		System.out.println("input radius: ");
		Scanner sc = new Scanner(System.in);
		radius = sc.nextDouble();
		radius1 = sc.nextDouble();

		// 2.calculate area
		area = pi * radius * radius;

		// 3.show area
		System.out.println("area of citcle: " + "radius: " + radius + " is: " + area);

		sc.close(); // free sc
	}
}
