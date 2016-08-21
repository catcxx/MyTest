package LeetCode;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class reverseBits {

	public static void main(String[] args) {
		reverseBits rb = new reverseBits();
		rb.reverseBits(1);// 1 (00000000000000000000000000000001)
	}

	// public int reverseBits(int n) {
	// String op = String.format("%32s", Integer.toBinaryString(n)).replace(' ',
	// '0');
	// op = new StringBuilder(op).reverse().toString();
	//// int num = Integer.parseInt(op,2);//int num =
	// Integer.parseUnsignedInt(op,2); java8
	// int num=0;
	// for(int i=0;i<32;i++){
	// int binchar=0;
	// if(op.charAt(i)=='0'){
	//
	// }else if(op.charAt(i)=='1'){
	// binchar=1;
	// }
	// num = (int) (binchar*Math.pow(2, 32-1-i))+num;
	// }
	// System.out.println(num);
	// return num;
	// }

	public double reverseBits(int n) {
		String op = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
		// op = new StringBuilder(op).reverse().toString();
		// int num = Integer.parseInt(op,2);//int num =
		// Integer.parseUnsignedInt(op,2); java8
		double num = 0;
		for (int i = 0; i < 32; i++) {
			int binchar = 0;
			if (op.charAt(i) == '0') {

			} else if (op.charAt(i) == '1') {
				binchar = 1;
			}
			num = ((binchar * Math.pow(2, i)) + num);
		}
		System.out.println(num);
		return num;
	}

	/**
	 * like reversing a string. we swap the bits in (0,N-1),(1,N-2)...... we do
	 * it with XOR
	 * 
	 */
	// public int reverseBits(int y) {
	// // INT_SIZE=32 in general
	// int INT_SIZE = Integer.SIZE;
	//
	// for (int i = 0; i < INT_SIZE / 2; i++) {
	// int j = INT_SIZE - 1 - i;
	//
	// int low = (y >> i) & 1;
	// int high = (y >> j) & 1;
	//
	// int A = 1 << i;
	// int B = 1 << j;
	//
	// if ((high ^ low) == 1) {
	// y = y ^ (A | B);
	// }
	// }
	// return y;
	// }

	// public int reverseBits(int n) {
	//
	// int res=0;
	// for(int i=0;i<32;i++){
	// res= ( res << 1 ) | ( n & 1 );
	// n = n >> 1;
	// }
	// return res;
	// }

	// public int reverseBits(int n) {
	// if(n>=2147483647||n<-2147483647){
	// return 0;
	// }
	// Integer ch = new Integer(n);//43261596 00000010100101000001111010011100
	// String s = Integer.toBinaryString(ch);
	// StringBuilder sbb=null;
	// if(s.length()<32){
	// String sb = null;
	// for(int i=0;i<32-s.length();i++){
	// sb = sb+"0";
	// }
	// sbb = new StringBuilder(sb.substring(4)+s);
	// }
	// System.out.println(ch+" "+sbb);
	// sbb.reverse();
	// String ssbb = new String(sbb);
	// int rb=0;
	// int decimal=0;
	// for(int i=0;i<32;i++){
	// char binchar = ssbb.charAt(i);
	// decimal = (int) (decimal+Math.pow(2, i)*binchar);
	// }
	//
	//// rb = Integer.parseInt(ssbb,2);//二进制string转为十进制int
	//// BigInteger sb = new BigInteger(ssbb, 2);
	// rb = decimal;
	// System.out.println(rb+" "+ssbb);
	// return rb;
	// }

	/**
	 * 10=>2
	 */
	// public String toBinary(int n){
	// StringBuilder temp = new StringBuilder();
	// while(n/2 >=1 || n%2 == 1){//除2取余， (|| n%2 == 1) 在次为了补上最后一个0或者1
	// temp.append(n%2);
	// n = n/2;
	// }
	// return temp.reverse().toString();
	// }

}
