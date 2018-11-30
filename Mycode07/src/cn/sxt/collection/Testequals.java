package cn.sxt.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Testequals {
	public static void main(String[] args) {
		List list = new ArrayList<>();
		String s1 = new String("aaa");
		String s2= new String("aaa");
		list.add(s1);   
		list.add(s2);
		System.out.println(list.size());
		
		/**MapÅĞ¶ÏÖØ¸´ÒÀÀµÓÚequals**/
		Map map = new HashMap<>();
		map.put(s1, "AAA");
		map.put(s2,"BBB");
		System.out.println(map.get("aaa"));				//Êä³ö£ºs1¸²¸ÇÁËs2
	}
}
