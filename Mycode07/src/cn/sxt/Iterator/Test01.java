package cn.sxt.Iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test01 {
	public static void main(String[] args) {
		List  list = new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		/**通过索引遍历list*/
		//Note: 适用于list的遍历方法
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		/*通过迭代器遍历list*/
		for(Iterator iterator = list.iterator();iterator.hasNext();) {
			String str = (String)iterator.next();
			System.out.println(str);
			
			iterator.remove();
			iterator.remove();
		}
		
		System.out.println(list.size()+"####");
		
		Set set = new HashSet<>();
		set.add("AAA");
		set.add("BBB");
		set.add("CCC");
		
		/*通过Iterator迭代器遍历Set*/
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			String str = (String) iterator.next();
			System.out.println(str);
		}
	
		
	}
}
