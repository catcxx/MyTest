package LeetCode;

public class countPrimes {

	public static void main(String[] args) {
		countPrimes cp = new countPrimes();
		long startMili = System.currentTimeMillis();// 当前时间对应的毫秒数
		System.out.println(cp.countPrimes(1500000));
		long endMili = System.currentTimeMillis();
		System.out.println("总耗时为：" + (endMili - startMili) + "毫秒");
	}

	// //总耗时为：13毫秒 O(nloglogn) and extra O(n) memory ,Sieve of Eratosthenes
	public int countPrimes(int n) {
		boolean[] isPrime = new boolean[n];
		for (int i = 2; i < n; i++) {
			isPrime[i] = true;
		}
		// Loop's ending condition is i * i < n instead of i < sqrt(n)
		// to avoid repeatedly calling an expensive function sqrt().
		for (int i = 2; i * i < n; i++) {
			if (!isPrime[i])
				continue;
			for (int j = i * i; j < n; j += i) {
				isPrime[j] = false;
			}
		}
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (isPrime[i])
				count++;
		}
		return count;
	}

	// //总耗时为：1263毫秒 cxx O(n2) --改为i * i <= num 总耗时为：476毫秒
	// public int countPrimes(int n){
	// int count=0;
	// for(int i=2;i<n;i++){
	// if(isPrime(i)){
	// count++;
	// };
	// }
	// return count;
	// }
	// public boolean isPrime(int num) {
	// for(int i = 2; i*i <= num; i++) { // Loop's ending condition is i * i <=
	// num
	// if(num % i == 0) {
	// return false;
	// }
	// }
	// return true;
	// }

	// //总耗时为：502毫秒 O(n1.5)
	// public int countPrimes(int n) {
	// int count = 0;
	// for (int i = 1; i < n; i++) {
	// if (isPrime(i)) count++;
	// }
	// return count;
	// }
	//
	// private boolean isPrime(int num) {
	// if (num <= 1) return false;
	// // Loop's ending condition is i * i <= num instead of i <= sqrt(num)
	// // to avoid repeatedly calling an expensive function sqrt().
	// for (int i = 2; i * i <= num; i++) {
	// if (num % i == 0) return false;
	// }
	// return true;
	// }

}
