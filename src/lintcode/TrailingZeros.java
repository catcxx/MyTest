package lintcode;

public class TrailingZeros {
	public static void main(String[] args) {
		TrailingZeros tz = new TrailingZeros();
		Long num = 5555550000000l;
		System.out.println(tz.trailingZeros(num));
	}

	/**
	 * Z = N/5 + N /(5*5) + N/(5*5*5).....知道N/(5的K次方)等于0 公式中
	 * N/5表示不大于N的数中能被5整除的数贡献一个5， N/(5*5)表示不大于N的数中能被25整除的数再共享一个5.......
	 * 
	 * @param n
	 * @return
	 */
	public long trailingZeros(long n) {
		int num = 0;

		while (n / 5 > 0) {
			num += n / 5;
			n = n / 5;
		}
		return num;
	}

	// public long trailingZeros(long n) {
	//
	// int num = 0, i;
	// for (i = 5; i <= n; i *= 5) {
	// num += n / i;
	// }
	// return num;
	// }

	// public long trailingZeros(long n) {
	// int num = 0;
	// for (int i = 5; i <= n; i++) {
	//
	// int temp = i;
	// while (temp % 5 == 0) {
	// num++;
	// temp /= 5;
	// }
	// }
	// return num;
	//
	// }

	// public long trailingZeros(long n) {
	// long res=1;
	// for(long i=2;i<=n;i=i+2){
	// res=res*i;
	// }
	// System.out.println(res);
	// int count=0;
	// while(res%10==0){
	// res=res/10;
	// count++;
	// }
	// return count;
	// }
}
