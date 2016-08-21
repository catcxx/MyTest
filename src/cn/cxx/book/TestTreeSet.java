package cn.cxx.book;

/**
 * treeset,实现了SortedSet接口的一个具体类
 */
import java.util.*;

public class TestTreeSet {
	public static void main(String[] args) {
		// Create a hash set
		Set<String> set = new HashSet<String>();

		// Add strings to the set
		set.add("London");
		set.add("Paris");
		set.add("New York");
		set.add("San Francisco");
		set.add("Beijing");
		set.add("New York");

		TreeSet<String> treeSet = new TreeSet<String>(set);// 这样创建，元素只排序一次。效率较高
		System.out.println("Sorted tree set: " + treeSet);

		// Use the methods in SortedSet interface
		System.out.println("first(): " + treeSet.first());
		System.out.println("last(): " + treeSet.last());
		System.out.println("headSet(): " + treeSet.headSet("New York"));// new
																		// york之前的，不包括
		System.out.println("tailSet(): " + treeSet.tailSet("New York"));// new
																		// york之后的，包括new
																		// york

		// Use the methods in NavigableSet interface
		System.out.println("lower(\"P\"): " + treeSet.lower("P"));
		System.out.println("higher(\"P\"): " + treeSet.higher("P"));
		System.out.println("floor(\"P\"): " + treeSet.floor("P"));
		System.out.println("ceiling(\"P\"): " + treeSet.ceiling("P"));
		System.out.println("pollFirst(): " + treeSet.pollFirst());
		System.out.println("pollLast(): " + treeSet.pollLast());
		System.out.println("New tree set: " + treeSet);
	}
}
