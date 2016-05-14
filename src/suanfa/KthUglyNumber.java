package suanfa;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ����2���ҳ���n������
 * 
 * @author Administrator
 *
 */
public class KthUglyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(doit(7));
		nthUglyNumber(7);
		findKth(7);
	}

	/**
	 * ʱ�临�Ӷ�O(N),������������3����������3��5��7��Ϊ�������� q3,q5,q7������������3��5��7
	 * ֮��ÿ������ҵ���������ͷ����С���������Ϊ3����3�Ƴ����� q3����q3���3*3����q5���3*5,q7�����3*7
	 * ��ʱ��֪q3{3*3},q5{5,3*5},q7{7,3*7} ��һ���ҵ���С��Ϊ5���ظ��������裬��5��q5�Ƴ������5*5��
	 * q5����Ϊ5*3�Ѿ���ӹ����Բ���Ҫ��ӵ�q3�� ��5*7��ӵ�q7�����q3{3*3},q5{3*5,5*5},q7{7,3*7,5*7}
	 * �����ҵ���k����
	 */
	public static int findKth(int k) {
		// write code here
		if (k < 0) {
			return 0;
		}
		int val = 0;
		Queue<Integer> q3 = new LinkedList<Integer>();
		Queue<Integer> q5 = new LinkedList<Integer>();
		Queue<Integer> q7 = new LinkedList<Integer>();
		q3.add(1);
		for (int i = 0; i <= k; i++) {
			int v3 = q3.size() > 0 ? q3.peek() : Integer.MAX_VALUE;
			int v5 = q5.size() > 0 ? q5.peek() : Integer.MAX_VALUE;
			int v7 = q7.size() > 0 ? q7.peek() : Integer.MAX_VALUE;
			val = Math.min(v3, Math.min(v5, v7));

			if (val == v3) {
				q3.remove();
				q3.add(val * 3);
				q5.add(val * 5);
			} else if (val == v5) {
				q5.remove();
				q5.add(val * 5);
			} else if (val == v7) {
				q7.remove();
			}
			q7.add(val * 7);
		}
		return val;
	}

	/**
	 * ����һ������Ϊn������uglyNumbers�����ڴ�С����˳��洢n�������������е�����Ϊ1������һ������Ϊ1
	 * 
	 * ������������idx2��idx3��idx5�洢�±꣬��ʼֵ��Ϊ0
	 * 
	 * �ҳ�����uglyNumbers[idx2]*2��uglyNumbers[idx3]*3��uglyNumbers[idx5]*5����Сֵ��
	 * ��Сֵ��Ϊ��һ��������ͬʱ������Сֵ��Ӧ���±꣬����������ͬʱΪ��Сֵ�������ǵ��±궼Ҫ����
	 * 
	 * �ҵ���n������ʱ��ѭ������
	 * 
	 * @param n
	 * @return
	 */
	public static int nthUglyNumber(int n) {

		int[] uglyNumbers = new int[n];
		uglyNumbers[0] = 1;
		// System.out.println("uglyNumbers[0]:1");

		int idx2 = 0;
		int idx3 = 0;
		int idx5 = 0;

		int counter = 1;
		while (counter < n) {

			// System.out.println("-----------");
			// System.out.println("idx2:" + idx2 + ";ugly[idx2]:" +
			// uglyNumbers[idx2]);
			// System.out.println("idx3:" + idx3 + ";ugly[idx3]:" +
			// uglyNumbers[idx3]);
			// System.out.println("idx5:" + idx5 + ";ugly[idx5]:" +
			// uglyNumbers[idx5]);
			// System.out.println("idx2:" + idx2 + ";idx3:" + idx3 + ";idx5:" +
			// idx5);

			int min = minOf(uglyNumbers[idx2] * 2, uglyNumbers[idx3] * 3, uglyNumbers[idx5] * 5);

			if (min == uglyNumbers[idx2] * 2) {
				// System.out.println("min==ugly[idx2]*2:" + uglyNumbers[idx2] *
				// 2);
				// System.out.println("idx2:" + idx2 + "��" + (idx2 + 1));
				idx2++;
			}

			if (min == uglyNumbers[idx3] * 3) {
				// System.out.println("min==ugly[idx3]*3:" + uglyNumbers[idx3] *
				// 3);
				// System.out.println("idx3:" + idx3 + "��" + (idx3 + 1));
				idx3++;
			}

			if (min == uglyNumbers[idx5] * 5) {
				// System.out.println("min==ugly[idx5]*5:" + uglyNumbers[idx5] *
				// 5);
				// System.out.println("idx5:" + idx5 + "��" + (idx5 + 1));
				idx5++;
			}

			uglyNumbers[counter] = min;
			// System.out.println("uglyNumbers[" + counter + "]:" + min);
			counter++;
		}

		// System.out.println("-----------");
		System.out.println("return:" + uglyNumbers[n - 1]);

		return uglyNumbers[n - 1];
	}

	/**
	 * ��������������С������
	 * 
	 * @param a
	 *            ����a
	 * @param b
	 *            ����b
	 * @param c
	 *            ����c
	 * @return a��b��c����С������
	 */
	private static int minOf(int a, int b, int c) {
		int temp = a < b ? a : b;
		return temp < c ? temp : c;
	}

	//////////////////////

	/**
	 * KthUglyNumber 1,2,3,4,5,6,8,9...
	 * 
	 * @param k
	 * @return
	 */
	public static int doit(int k) {
		int counter = 0;
		int i = 1;
		if (k < 1) {
			return 0;
		}
		for (;; i++) {
			if (isUgly(i)) {
				counter++;
				if (counter == k) {
					return i;
				}
			}
		}

	}

	/**
	 * UglyNumber?
	 * 
	 * @param num
	 * @return
	 */
	public static boolean isUgly(int num) {
		if (num <= 0)
			return false;
		while (num % 2 == 0) {
			num /= 2;
		}
		while (num % 3 == 0) {
			num /= 3;
		}
		while (num % 5 == 0) {
			num /= 5;
		}
		return num == 1;
	}

}
