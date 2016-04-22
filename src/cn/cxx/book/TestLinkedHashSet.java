package cn.cxx.book;

/**
 * set不能重复
 * linkedhashset有顺序
 */
import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet {

	 public static void main(String[] args) {
		    // Create a linkedhash set
		    Set<String> set = new LinkedHashSet<String>();
		   
		    // Add strings to the set
		    set.add("London");
		    set.add("Paris");
		    set.add("New York");
		    set.add("San Francisco");
		    set.add("Beijing");
		    set.add("New York");
		    

		    System.out.println(set);

		    // Obtain an iterator for the hash set
//		    Iterator<String> iterator = set.iterator();
		//
//		    // Display the elements in the hash set
//		    while (iterator.hasNext()) {
//		      System.out.print(iterator.next().toUpperCase() + " ");
//		    }
		    
		    for(Object ob : set){
		    	System.out.print(ob.toString().toUpperCase()+" ,");
		    }
		    
		  }
	
}
