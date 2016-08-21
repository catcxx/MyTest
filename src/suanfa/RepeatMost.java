package suanfa;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 数组中重复最多的数
 * 
 * @author Administrator
 *
 */
public class RepeatMost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 1, 2, 2, 4, 4, 4, 4, 5, 5, 6, 6, 6 };
		System.out.println(doit(arr));
		System.out.println(doit1(arr));
	}

	/**
	 * 数组中重复最多的数
	 * 
	 * @param arr
	 * @return
	 */
	public static int doit(int[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		int most = 0;
		int res = 0;
		Iterator<Entry<Integer, Integer>> iter = map.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry<Integer, Integer> entry = iter.next();
			int key = entry.getKey();
			int value = entry.getValue();
			if (value > most) {
				res = key;
				most = value;
			}
		}
		return res;
	}

	/**
	 * 数组中重复最多的数
	 * 
	 * @param arr
	 * @return
	 */
	public static int doit1(int[] arr) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		int most = 0;
		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			if (map.get(arr[i]) > most) {
				res = arr[i];
				most = map.get(arr[i]);
			}
		}
		return res;

	}

}
