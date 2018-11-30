package cn.sxt.collection;

import java.util.LinkedList;

/**
 * �Զ���ʵ��Map����
 * @author Admin
 *Map:��ż�ֵ�ԣ����ݼ�������ֵ���󣬼������ظ�
 */
public class MyMap {
	
	LinkedList[ ] arr = new LinkedList[999];
	int size;
	

	
	public void put(Object key,Object value) {
		
		Entry e = new Entry(key, value);
		
		int hash = key.hashCode();
		hash = hash<0?-hash:hash;				//���hash<0�����-��
		
		// TODO 1.1 ��ü���hashcode����߲�ѯЧ��
		int a =hash%arr.length;
		
		if (arr[a]==null) {
			LinkedList linkList = new LinkedList();				//������
			arr[a] = linkList;
			linkList.add(e);														//������
		}else {
			LinkedList list = arr[a];
			for (int i = 0; i < list.size(); i++) {
				Entry entry = (Entry) list.get(i);
				if (entry.key.equals(key)) {
					entry.value = value;					//��ֵ�ظ�ֱ�Ӹ���
					return ;
				}
			}
			arr[a].add(e);
		}
	}
/*				
		for (int i=0;i<size;i++) {
			if (arr[i].key.equals(key)) {				//equals: �Ƚ϶������arr[i].key==key���ҵ�key
				try {
					throw new Exception("���ظ�");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		}
		arr[size++] = e;
	}
*/	
	public Object get(Object key) {

		int a= key.hashCode()%arr.length;
		if (arr[a]!=null) {
			LinkedList list = arr[a];
			for (int i = 0; i < list.size(); i++) {
				Entry entry = (Entry) list.get(i);
				if (entry.key.equals(key)) {
					return entry.value;
				}
			}
		}
		return null;
		
/*		for (int i=0;i<size;i++) {
			if (arr[i].key.equals(key)) {				//equals: �Ƚ϶������arr[i].key==key���ҵ�key
				return arr[i].value;
			}
		}
		return null;
	
		
		return arr[key.hashCode()%999];
*/			
	}
/*	
	public boolean containsKey(Object key) {
		for (int i=0;i<size;i++) {
			if (arr[i].key.equals(key)) {				//equals: �Ƚ϶������arr[i].key==key���ҵ�key
				return true;
			}
		}
		return false;
	}
	
	public boolean containsValue(Object value) {
		for (int i=0;i<size;i++) {
			if (arr[i].key.equals(value)) {				//equals: �Ƚ϶������arr[i].key==key���ҵ�key
				return true;
			}
		}
		return false;
	}
*/	
	
	public static void main(String[] args) {
		MyMap m = new MyMap();
		m.put("li",new Wife("il") );
		m.put("aas", new Wife("saa"));
		m.put("we", new Wife("ew"));
		m.put("we", new Wife("eew"));
		Wife w = (Wife)m.get("we");
		System.out.println(w.name);
	}
}


class Entry{
	Object key;
	Object value;
	
	public Entry(Object key, Object value) {
		super();
		this.key = key;
		this.value = value;
		
	}
	
}

