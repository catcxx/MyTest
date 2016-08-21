package concurrenttest;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ע�⣬��ʵ�ֲ���ͬ���ġ��������߳�ͬʱ����һ����ϣӳ�䣬����������һ���̴߳ӽṹ���޸��˸�ӳ�䣬��������
 * �����ⲿͬ�������ṹ�ϵ��޸���ָ��ӻ�ɾ��һ������ӳ���ϵ���κβ��������ı���ʵ���Ѿ������ļ�������ֵ���ǽṹ�ϵ��޸ġ���
 * ��һ��ͨ������Ȼ��װ��ӳ��Ķ������ͬ����������ɡ���������������Ķ�����Ӧ��ʹ�� Collections.synchronizedMap
 * ����������װ����ӳ�䡣����ڴ���ʱ�����һ�������Է�ֹ��ӳ���������ķ�ͬ�����ʣ�������ʾ��
 * 
 * Map m = Collections.synchronizedMap(new HashMap(...));�����д���ġ�collection
 * ��ͼ�����������صĵ��������ǿ���ʧ�� �ģ��ڵ���������֮������ӽṹ�϶�ӳ������޸ģ�����ͨ������������� remove
 * �����������κ�ʱ���κη�ʽ���޸ģ������������׳�
 * ConcurrentModificationException����ˣ���Բ������޸ģ��������ܿ�ͻ���ȫʧ�ܣ�
 * ����ð�ڽ�����ȷ����ʱ�䷢�����ⲻȷ����Ϊ�ķ��ա�
 * 
 * ע�⣬�������Ŀ���ʧ����Ϊ���ܵõ���֤��һ����˵�����ڷ�ͬ���Ĳ����޸�ʱ�������������κμ���ı�֤������ʧ�ܵ����������Ŭ���׳�
 * ConcurrentModificationException����ˣ���д�����ڴ��쳣�ĳ���������Ǵ���ģ���ȷ�����ǣ�
 * �������Ŀ���ʧ����ΪӦ�ý����ڼ��������
 * 
 * ����ʧ�ܣ����ڷǲ���������˵��������е���ʱ������iterator����ʱ��iterator������һ���̣߳����������̣߳���Collection��
 * ���нṹ�޸ģ��޸��������˼����е����ݣ���������������ϸ�֪�������������׳� ConcurrentModificationException
 * �쳣�������ǵ�����ɺ�Ÿ���������ˣ��������ʧ�ܡ�����iterator�����޸��򲻻����������⣬��iterator.move();
 * Ҳ����˵�漰���˶���̼߳��ͬ������
 * 
 * @author cxx
 *
 */

public class ConcurrentHashMapIterator {
	public static void main(String[] args) {

		Hashtable<String, String> table = new Hashtable<String, String>();
		table.put("a", "vb");
		table.put("s", "er");
		table.put("d", "fg");
		table.remove("d");
		Iterator<Entry<String, String>> iterator = table.entrySet().iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next().getValue());
			iterator.remove();// ����iteratorֱ�ӽ����޸� ��������
			// table.put("c", "wc");ֱ�Ӵ�hashtable��ɾ���ݾͻᱨ��
			// table.remove("d");ֱ�Ӵ�hashtable��ɾ���ݾͻᱨ�� hashtable��hashmap�ȷǲ�������
			// ����ڵ������������������ݣ�
		}

		System.out.println("-----------");

		HashMap<String, String> hashmap = new HashMap<String, String>();
		hashmap.put("a", "vb");
		hashmap.put("s", "er");
		hashmap.put("d", "fg");
		Iterator<Entry<String, String>> iterators = hashmap.entrySet().iterator();

		while (iterators.hasNext()) {
			System.out.println(iterators.next().getValue());
			iterators.remove();// ����
			// hashmap.remove("d");//ֱ�Ӵ�hashtable��ɾ���ݾͻᱨ��
			// hashtable��hashmap�ȷǲ������ϣ�����ڵ������������������ݣ������ʧ�� (һ��⵽�޸ģ��������쳣)
		}

		System.out.println("-----------");

		ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>();
		map.put("a", "vb");
		map.put("s", "er");
		map.put("d", "fg");
		Iterator<Entry<String, String>> mapiterator = map.entrySet().iterator();

		while (mapiterator.hasNext()) {
			System.out.println(mapiterator.next().getValue());
			map.remove("d");// ���� �������ϲ����ڿ���ʧ������
			map.put("c", "wc");// ���� �������ϲ����ڿ���ʧ������
		}
		System.out.println("-----------");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getValue() + ", " + entry.getKey());
		}
		System.out.println("-----------");
		for (Map.Entry<String, String> entry : table.entrySet()) {
			System.out.println(entry.getValue() + ", " + entry.getKey());
		}
	}
}
