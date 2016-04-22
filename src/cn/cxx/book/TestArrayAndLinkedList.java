package cn.cxx.book;

import java.util.*;

public class TestArrayAndLinkedList {
  public static void main(String[] args) {
    List<Integer> arrayList = new ArrayList<Integer>();
    arrayList.add(1); // 1 is autoboxed to new Integer(1)
    arrayList.add(2);
    arrayList.add(3);
    arrayList.add(1);
    arrayList.add(4);
    arrayList.add(0, 10);
    arrayList.add(3, 30);

    System.out.println("A list of integers in the array list:");
    System.out.println(arrayList);

    LinkedList<Object> linkedList = new LinkedList<Object>(arrayList);
    linkedList.add(1, "red");
    linkedList.removeLast();
    linkedList.addFirst("green");

    System.out.println("Display the linked list forward:");
    ListIterator<Object> listIterator = linkedList.listIterator();
    while (listIterator.hasNext()) {
      System.out.print(listIterator.next() + " ");
    }
    System.out.println();
//
    System.out.println("Display the linked list backward:");
    listIterator = linkedList.listIterator(linkedList.size());
    while (listIterator.hasPrevious()) {
      System.out.print(listIterator.previous() + " ");
    }
    
    System.out.println();
    Collection<String> co = Arrays.asList("red","blue","red","zoo");
    Collection<String> co1 = Arrays.asList("red","blue","yellow");

    System.out.println("Display max :  "+Collections.max(co));
    
    System.out.println("Display frequency :  "+Collections.frequency(co, "red"));
    System.out.println("Display disjoint :  "+
    		Collections.disjoint(co, co1));//有相同的元素，返回FALSE；没有相同的元素，返回TRUE
    
    
    System.out.println("****************************************");
    
    List<String> co2 = Arrays.asList("red","blue","yellow");
    List<String> co3 = Arrays.asList("red","gold","green");
    List<String> co4 = Arrays.asList("red","gold","green");
    System.out.println("Display co2 :  "+co2);
    Collections.reverse(co2);
    System.out.println("Display co2 reverse :  "+co2);
    
    Collections.copy(co2, co3);//copy方法为浅复制，复制元素的引用。
    Collections.nCopies(2, co4);
    System.out.println("Display copy :  "+co2);
    System.out.println("Display ncopys " +co4);
    
  }
}

