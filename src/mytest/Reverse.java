package mytest;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse re = new Reverse();
		char[] arr = new char[] { 'a', 'b', 'c' };
		System.out.println(arr);
		System.out.println(re.reverse(arr));
	}

	public char[] reverse(char ch[]) {
		char[] ch2 = new char[ch.length];
		for (int i = ch.length - 1; i > -1; i--) {
			ch2[ch.length - 1 - i] = ch[i];
		}
		return ch2;

	}

}
