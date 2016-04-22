package cn.cxx.myCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Testequals {
public static void main(String[] args) {
	List<String> list=new ArrayList<String>();
	String s1=new String("aaa");
	String s2=new String("aaa");
	list.add(s1);
	list.add(s2);
	System.out.println(list.size());
	Map<String, String> map=new HashMap<String, String>();
	//
	map.put(s1,"gg");
	map.put(s2,"aa");
	map.hashCode();
	System.out.println(map.get("aaa")+" "+map.size());//override,equals=true-->same hashcode
}
}
