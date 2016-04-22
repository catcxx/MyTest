package cn.cxx.myCollection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class testst {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("red", "green", "blue");
		List<Integer> list2 = Arrays.asList(21, 67, 654);//aslist static
		Iterator<String> iterator1 = list1.iterator();
		Iterator<Integer> iterator2 = list2.iterator();
		
		List<String> list11 = Arrays.asList("red", "green", "blue");
		List<String> list111 = Arrays.asList("riiid", "green","fsd");
		
		while (iterator1.hasNext()) {
			System.out.print(iterator1.next().toUpperCase() + " ");
		}
		System.out.println();
		Collections.shuffle(list1);
		Collections.shuffle(list11);
		System.out.println("shuffle: "+list1 + " ");
		System.out.println("shuffle: "+list11 + " ");
		Collections.copy(list1, list111);
		System.out.println("copy: "+list1);
		
		while (iterator2.hasNext()) {
			System.out.print(iterator2.next() + " ");
		}
		System.out.println();
		
		List<Integer> list3 = new LinkedList<Integer>();
		list3.add(12);
		list3.add(2);
		list3.add(32);
		List<Integer> list4 = new LinkedList<Integer>();
		list4.add(12);
		list4.add(2);
		list4.add(32);
		
		System.out.println("list3: "+list3 + " ");
		System.out.println("index: "+Collections.binarySearch(list3, 2));
		Collections.sort(list3);
		System.out.println("sorted: "+list3 + " ");
		
		Collections.reverse(list3);
		System.out.println("reverse: "+list3);
		
		Collections.shuffle(list3,new Random(20));
		Collections.shuffle(list4,new Random(20));
		System.out.println("Random: "+list3);
		System.out.println("Random: "+list4);
	}
}
