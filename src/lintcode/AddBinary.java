package lintcode;

/**
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 */
import java.math.BigInteger;

public class AddBinary {
	public static void main(String args[]) {
		String binnum1 = "11";
		String binnum2 = "1";
		AddBinary ab = new AddBinary();

		System.out.println(ab.addBinary(binnum1, binnum2));

	}

	public String addBinary(String a, String b) {
		BigInteger ia = new BigInteger(a, 2);// 2进制string转换为BigInteger
		BigInteger ib = new BigInteger(b, 2);
		BigInteger sum = ia.add(ib);
		String ss = sum.toString(2);// BigInteger转换为2进制string
		return ss;
	}
}
