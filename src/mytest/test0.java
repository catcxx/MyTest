package mytest;
/*
 * 2^100%7
 */
import java.math.BigInteger;

public class test0 {

	public static void main(String[] args) {
		
		BigInteger big = new BigInteger("2");
		big=big.pow(100);
		big=big.mod( new BigInteger("7"));
		
		System.out.println(big);
	}

}
