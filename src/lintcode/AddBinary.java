package lintcode;

/**
 * ���������������ַ������������ǵĺͣ��ö����Ʊ�ʾ����
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
		BigInteger ia = new BigInteger(a, 2);// 2����stringת��ΪBigInteger
		BigInteger ib = new BigInteger(b, 2);
		BigInteger sum = ia.add(ib);
		String ss = sum.toString(2);// BigIntegerת��Ϊ2����string
		return ss;
	}
}
