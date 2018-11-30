package cn.sxt.collection;

import java.util.LinkedList;

/**
 * 自定义实现Map功能
 * @author Admin
 *Map:存放键值对，根据键对象找值对象，键不能重复
 */
public class MyMap {
	
	LinkedList[ ] arr = new LinkedList[999];
	int size;
	

	
	public void put(Object key,Object value) {
		
		Entry e = new Entry(key, value);
		
		int hash = key.hashCode();
		hash = hash<0?-hash:hash;				//如果hash<0，则加-号
		
		// TODO 1.1 获得键的hashcode，提高查询效率
		int a =hash%arr.length;
		
		if (arr[a]==null) {
			LinkedList linkList = new LinkedList();				//建链表
			arr[a] = linkList;
			linkList.add(e);														//丢数组
		}else {
			LinkedList list = arr[a];
			for (int i = 0; i < list.size(); i++) {
				Entry entry = (Entry) list.get(i);
				if (entry.key.equals(key)) {
					entry.value = value;					//键值重复直接覆盖
					return ;
				}
			}
			arr[a].add(e);
		}
	}
/*				
		for (int i=0;i<size;i++) {
			if (arr[i].key.equals(key)) {				//equals: 比较对象；如果arr[i].key==key，找到key
				try {
					throw new Exception("键重复");
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
			if (arr[i].key.equals(key)) {				//equals: 比较对象；如果arr[i].key==key，找到key
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
			if (arr[i].key.equals(key)) {				//equals: 比较对象；如果arr[i].key==key，找到key
				return true;
			}
		}
		return false;
	}
	
	public boolean containsValue(Object value) {
		for (int i=0;i<size;i++) {
			if (arr[i].key.equals(value)) {				//equals: 比较对象；如果arr[i].key==key，找到key
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

