package cn.sxt.collection;

import java.util.HashMap;

/**
 * 自定义HashSet
 * 
 * @author Admin
 *
 */
public class MyHashSet {
	
	HashMap map;
	private static final Object PRESENT =new Object();
	
	public MyHashSet() {
		map = new HashMap();
	}
	
	public int size() {
		return map.size();
	}
	
	public void add(Object o) {
		map.put(o,PRESENT);				//Set不可重复，就是利用了Map里对象的不可重复！
	}
	
	
	public static void main(String[] args) {
		
		MyHashSet s = new MyHashSet();
		s.add("aaa");
		s.add(new String("aaa"));
		System.out.println(s.size());
//		System.out.println(s);
		
	}
	
	
}
