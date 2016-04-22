/**
 * cal pi
 * @author Administrator
 *
 */
public class Exercise1_7 {
	 public static void main(String[] args) {
		  double pi = 0;
		  int i = 1;
		  for (i = 1; Math.abs(1.0 / i) > 1E-9; i += 2) {   
		   if (i % 4 == 1) {      //mod
		    pi += (1.0 / i);
		   } else {
		    pi -= (1.0/ i);
		   }
		  }
		  pi = pi * 4;
		  System.out.println(pi);
		 }
}
