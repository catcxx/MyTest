package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GetZhishu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetZhishu Ge = new GetZhishu();
		// System.out.println(GetZhishu.getZhishu(180));
		Ge.getZhishu(180);
	}

	/**
	 * 质因数分解
	 * 
	 * @param l
	 */
	public static void getZhishu(long l) {
		List<Integer> list = new ArrayList<Integer>();
		boolean isPrime; // 定义布尔变量判断是否素数.是:true;否:false
		for (; l >= 2l;) {

			for (int i = 2; i <= 100000; i++) {
				isPrime = true;
				int k = (int) Math.sqrt(i);
				for (int j = 2; j <= k; j++) {
					if (i % j == 0) {
						isPrime = false; // 如果能够有数整除i,那么就不是素数.
						break;
					}
				}
				if (isPrime && (l % i == 0)) {
					// System.out.println(l/i);
					// System.out.println(i);
					list.add(i);
					l = l / i;
				}
			}
		}

		Collections.sort(list);
		for (Integer i : list) {
			System.out.println(i);
		}
	}

}
