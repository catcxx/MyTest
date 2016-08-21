package suanfa;

/**
 * 三个数里最大的/最小的
 * 
 * @author Administrator
 *
 */
public class ThreeMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] maxmin = maxmin(2, 1, 3);
		System.out.println(maxmin[0] + " " + maxmin[1]);
	}

	/**
	 * 三个数里最大的/最小的
	 * 
	 * @param i
	 * @param j
	 * @param k
	 * @return
	 */
	public static int[] maxmin(int i, int j, int k) {
		int[] maxmin = new int[2];
		maxmin[0] = i;// max
		if (maxmin[0] < j) {
			maxmin[0] = j;
		}
		if (maxmin[0] < k) {
			maxmin[0] = k;
		}

		maxmin[1] = i;// min
		if (maxmin[1] > j) {
			maxmin[1] = j;
		}
		if (maxmin[1] > k) {
			maxmin[1] = k;
		}
		return maxmin;

	}

}
