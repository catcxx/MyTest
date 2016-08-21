package concurrenttest;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注意，此实现不是同步的。如果多个线程同时访问一个哈希映射，而其中至少一个线程从结构上修改了该映射，则它必须
 * 保持外部同步。（结构上的修改是指添加或删除一个或多个映射关系的任何操作；仅改变与实例已经包含的键关联的值不是结构上的修改。）
 * 这一般通过对自然封装该映射的对象进行同步操作来完成。如果不存在这样的对象，则应该使用 Collections.synchronizedMap
 * 方法来“包装”该映射。最好在创建时完成这一操作，以防止对映射进行意外的非同步访问，如下所示：
 * 
 * Map m = Collections.synchronizedMap(new HashMap(...));由所有此类的“collection
 * 视图方法”所返回的迭代器都是快速失败 的：在迭代器创建之后，如果从结构上对映射进行修改，除非通过迭代器本身的 remove
 * 方法，其他任何时间任何方式的修改，迭代器都将抛出
 * ConcurrentModificationException。因此，面对并发的修改，迭代器很快就会完全失败，
 * 而不冒在将来不确定的时间发生任意不确定行为的风险。
 * 
 * 注意，迭代器的快速失败行为不能得到保证，一般来说，存在非同步的并发修改时，不可能作出任何坚决的保证。快速失败迭代器尽最大努力抛出
 * ConcurrentModificationException。因此，编写依赖于此异常的程序的做法是错误的，正确做法是：
 * 迭代器的快速失败行为应该仅用于检测程序错误。
 * 
 * 快速失败：对于非并发集合来说，在其进行迭代时，例如iterator迭代时，iterator是另起一个线程，若有其他线程（如Collection）
 * 进行结构修改（修改了增减了集合中的内容），这个迭代会马上感知到，并且立即抛出 ConcurrentModificationException
 * 异常，而不是迭代完成后才告诉你出错了，引起快速失败。若用iterator进行修改则不会出现这个问题，如iterator.move();
 * 也就是说涉及到了多个线程间的同步问题
 * 
 * @author cxx
 *
 */

public class ConcurrentHashMapIterator {
	public static void main(String[] args) {

		Hashtable<String, String> table = new Hashtable<String, String>();
		table.put("a", "vb");
		table.put("s", "er");
		table.put("d", "fg");
		table.remove("d");
		Iterator<Entry<String, String>> iterator = table.entrySet().iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next().getValue());
			iterator.remove();// 采用iterator直接进行修改 程序正常
			// table.put("c", "wc");直接从hashtable增删数据就会报错
			// table.remove("d");直接从hashtable增删数据就会报错 hashtable，hashmap等非并发集合
			// 如果在迭代过程中增减了数据，
		}

		System.out.println("-----------");

		HashMap<String, String> hashmap = new HashMap<String, String>();
		hashmap.put("a", "vb");
		hashmap.put("s", "er");
		hashmap.put("d", "fg");
		Iterator<Entry<String, String>> iterators = hashmap.entrySet().iterator();

		while (iterators.hasNext()) {
			System.out.println(iterators.next().getValue());
			iterators.remove();// 正常
			// hashmap.remove("d");//直接从hashtable增删数据就会报错
			// hashtable，hashmap等非并发集合，如果在迭代过程中增减了数据，会快速失败 (一检测到修改，马上抛异常)
		}

		System.out.println("-----------");

		ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>();
		map.put("a", "vb");
		map.put("s", "er");
		map.put("d", "fg");
		Iterator<Entry<String, String>> mapiterator = map.entrySet().iterator();

		while (mapiterator.hasNext()) {
			System.out.println(mapiterator.next().getValue());
			map.remove("d");// 正常 并发集合不存在快速失败问题
			map.put("c", "wc");// 正常 并发集合不存在快速失败问题
		}
		System.out.println("-----------");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getValue() + ", " + entry.getKey());
		}
		System.out.println("-----------");
		for (Map.Entry<String, String> entry : table.entrySet()) {
			System.out.println(entry.getValue() + ", " + entry.getKey());
		}
	}
}
