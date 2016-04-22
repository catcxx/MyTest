package mytest;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class testgeneric {

	@Test
	public void test2(){
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(78);
		list2.add(79);
	//	list.add("a");
		
		for(int i=0;i<=list2.size();i++){
			int score = (Integer)list2.get(i);
			System.out.println(score);
		}
	}
	
	
	
	@Test
	public void test1(){
		List list1 = new ArrayList();
		list1.add(78);
		list1.add(79);
		list1.add("akj");
		
		for(int i=0;i<list1.size();i++){
			int score = (Integer)list1.get(i);
			System.out.println("score:"+score);
		}
	}

}
