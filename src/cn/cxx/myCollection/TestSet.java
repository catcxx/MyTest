package cn.cxx.myCollection;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
public static void main(String[] args) {
	Set set = new HashSet();
	set.add("sss");
	set.add("ssa");
	set.add("sss");
	set.add(new String("sss"));
	System.out.println(set.size());
	System.out.println(set.contains("sss"));
}
}
