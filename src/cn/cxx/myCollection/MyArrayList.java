package cn.cxx.myCollection;

import java.util.Date;

/**
 * 模拟产生jdk中提供的arraylist类
 * 
 * @author Administrator
 *
 */
public class MyArrayList {
	/**
	 * The value is used for object storage.
	 */
	private Object[] value;

	/**
	 * The size is the number of object used.
	 */
	private int size;

	public MyArrayList() {
		// value = new Object[16];
		this(16);
	}

	public MyArrayList(int size) {
		if (size < 0) {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		value = new Object[size];
	}

	public int size() {
		return size;
	}

	public void add(Object obj) {
		value[size] = obj;
		size++;
		if (size >= value.length) {// 扩容
			int newCapacity = value.length * 2;
			Object[] newList = new Object[newCapacity];
			// System.arraycopy(src, srcPos, dest, destPos, length);
			for (int i = 0; i < value.length; i++) {
				newList[i] = value[i];
			}
			value = newList;
		}
	}

	public void remove(int index) {
		if (index < 0 || index >= size)
			try {
				throw new Exception();

			} catch (Exception e) {
				e.printStackTrace();
			}
		int numMoved = size - index - 1;
		if (numMoved > 0)
			System.arraycopy(value, index + 1, value, index, numMoved);
		value[--size] = null; // clear to let GC do its work

	}

	private void rangeCheck(int index) {
		if (index < 0 || index >= size)
			try {
				throw new Exception();

			} catch (Exception e) {
				e.printStackTrace();
			}
	}

	public Object get(int index) {
		if (index < 0 || index > size - 1) {// [0,size-1]
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		return value[index];
	}

	public static void main(String[] args) {
		MyArrayList list = new MyArrayList(2);
		System.out.println("size:" + list.size());
		list.add("nnn");
		System.out.println("size:" + list.size());
		System.out.println("list.gte(0):" + list.get(0));
		list.add(new man("cxx"));
		list.add("d");

		man m = (man) list.get(1);
		String n = (String) list.get(2);
		System.out.println(n);
		System.out.println(m.getName());
		System.out.println(m.toString());// classname@对象地址

		System.out.println(list.size());

		list.remove(2);

		System.out.println(list.size());

	}
}
