package cn.cxx.myCollection;

import java.util.LinkedList;

/**
 * testmap02
 * @author Administrator
 *
 */
public class testmap02 {
	
	LinkedList[] arr=new LinkedList[999];//array and linkedlist
	int size;
	
	
	public void put(Object key,Object value){
		
		myEntry e=new myEntry(key,value);
		
		int hash = key.hashCode();
		hash=hash<0?-hash:hash;//negetive
		
		int a=hash%arr.length;//
		if(arr[a]==null){
			LinkedList list=new LinkedList();
			arr[a]=list;
			list.add(e);
		}else{
			
			LinkedList list=arr[a];
			for (int i = 0; i < list.size(); i++) {
				myEntry e2=(myEntry) list.get(i);
				if(e2.key.equals(key)){
					e2.value=value;//same key ,then override
					return;
				}
			}
			arr[a].add(e);
			
		}
		
	}
	
	public Object get(Object key){
		int a=key.hashCode()%arr.length;
		if(arr[a]!=null){
		LinkedList list=arr[a];
		for (int i = 0; i < list.size(); i++) {
			myEntry e=(myEntry) list.get(i);
			if(e.key.equals(key)){
				return e.value;
			}
		}
		list.get(a);
		}
		return null;
	}
	
	public static void main(String[] args) {
		testmap02 map =new testmap02();
		map.put("w", new Wife("hj"));//key,,value
		map.put("w",  new Wife("pl"));//
		map.put("s",  new Wife("pl"));
		Wife w=(Wife)map.get("w");//get value via key
		
		System.out.println(w.name);
		
	}
}
