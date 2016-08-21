package lintcode;

import java.math.MathContext;
import java.util.Arrays;

public class Sqrt {
	public static void main(String[] args) {
		Sqrt m = new Sqrt();
		int n = 16;// 2147483647

		System.out.println(m.sqrt(n));

	}

	// float SqrtByBisection(float n) //用二分法
	// {
	// if(n<0) //小于0的按照你需要的处理
	// return n;
	// float mid,last;
	// float low,up;
	// low=0,up=n;
	// mid=(low+up)/2;
	// do
	// {
	// if(mid*mid>n)
	// up=mid;
	// else
	// low=mid;
	// last=mid;
	// mid=(up+low)/2;
	// }while(abs(mid-last) > eps);//精度控制
	// return mid;
	// }

	// public int sqrt(int x) {
	// int i = 1;
	// double d =x;
	// if (x < 0) {
	// return -1;
	// }
	// if (x == 0) {
	// return 0;
	// }
	//
	// for (; i*i <=x; i++) {
	// if (i * i == x ) {
	// break;
	// }
	// if((i+1) *( i+1) > d){
	// break;
	// }
	//
	//
	// }
	// return i;
	//
	// }

	// public int sqrt(int x) {//newton
	//
	// int i = 1;
	// while(Math.abs(i*i-x) > 1)
	// {
	// i = (i+x/i)/2;
	// }
	//
	// return i;
	//
	// }

	public static int sqrt(int x) {
		double diff = 0.01; // 误差
		int low = 0;
		int high = x;

		while (low <= high) {
			// 注意越界！所以用double来存
			double mid = low + (high - low) / 2;
			if (Math.abs(mid * mid - x) <= diff) {
				return (int) mid;
			} else if (x > mid * mid + diff) {
				low = (int) mid + 1;
			} else if (x < mid * mid - diff) {
				high = (int) mid - 1;
			}
		}

		// 当找不到时候，这是low,high指针已经交叉，取较小的，即high
		return high;
	}

}
