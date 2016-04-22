package cn.cxx.myCollection;


public class Linkedlist {//LinkedList
 Node first;
 Node last;

private  int size;
public void add(Node node){
	Node n=new Node();
	
	if(first==null){
		
		n.setPrevious(null);
		n.setObj(node);
		n.setNext(null);
		
		first = n;
		last = n;
	}else{//add
		
		n.setPrevious(last);
		n.setObj(node);
		n.setNext(null);
		
		last.setNext(n);
		
		last=n;
		
	}
	size++;
}



public int size(){
	return size;
}

public Object get(int index){
	Node temp=null;
	if(first!=null){
		
		temp = first;
		for(int i=0;i<index;i++){
			temp=temp.next;
		}
		
	}
	return temp.obj;
}

public void remove(int index){
	Node temp=node(index);
	
	
	if(temp!=null){
		Node up = temp.previous;
		Node down =temp.next;
		up.next=down;
		down.previous=up;
		size--;
	}
}

public Node node(int index){
	Node temp = null;
if(first!=null){
		
		temp = first;
		for(int i=0;i<index;i++){
			temp=temp.next;
		}
		
	}
return temp;
}

public void add(int index,Object obj){
	Node temp=node(index);
	Node newNode=new Node();
	newNode.obj=obj;
	
	if(temp!=null){
		Node up = temp.previous;
		up.next=newNode;
		newNode.previous=up;
		
		newNode.next=temp;
		temp.previous=newNode;
		size++;
	}
}

public static void main(String[] args) {
	Linkedlist list = new Linkedlist();
	Node n1 = new Node(),n2 = new Node();
	Node n3 = new Node();
	list.add(n1);
	list.add(n2);
	list.add(1,"hh");
	list.add(n3);
	//list.remove(0);
	System.out.println(list.size);
	System.out.println(list.get(1));
}
}

