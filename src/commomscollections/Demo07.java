package commomscollections;

import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.bidimap.DualHashBidiMap;
import org.apache.commons.collections4.bidimap.DualTreeBidiMap;

/**
 ˫��Map Ҫ�����ֵ�������ظ�
 BidiMap  inverseBidiMap()
 1��DualTreeBidiMap :����
 2��DualHashBidiMap :����
 * @author Administrator
 *
 */
public class Demo07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//hashMap();
		treeMap();
	}
	/**
	 * �����˫��Map
	 */
	public static void treeMap(){
		System.out.println("=====�����˫��Map====");
		BidiMap<String,String> map =new DualTreeBidiMap<String,String>();
		map.put("bj", "bj@test.com");
		map.put("sxt", "sxt@qq.com");	
		//�����鿴
		MapIterator<String,String> it =map.inverseBidiMap().mapIterator();
		while(it.hasNext()){
			String key =it.next();
			String value =it.getValue();
			System.out.println(key+"-->"+value);
		}
	}

	/**
	 * �����˫��Map
	 */
	public static void hashMap(){
		System.out.println("=====�����˫��Map====");
		BidiMap<String,String> map =new DualHashBidiMap<String,String>();
		map.put("bj", "bj@test.com");
		map.put("sxt", "sxt@qq.com");
		//��ת
		System.out.println(map.inverseBidiMap().get("sxt@qq.com"));
		//�����鿴
		MapIterator<String,String> it =map.inverseBidiMap().mapIterator();
		while(it.hasNext()){
			String key =it.next();
			String value =it.getValue();
			System.out.println(key+"-->"+value);
		}
	}

}
