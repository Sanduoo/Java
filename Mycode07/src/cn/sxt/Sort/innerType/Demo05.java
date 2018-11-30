package cn.sxt.Sort.innerType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 使用Collections对容器的比较
 * 1、public statis <T extends Comparable<? super T>> void sort (List<T> list) void sort(List<T> list)
 * 2、public statis <T > void sort (List<T> list,Comparator <? super T> c)
 * @author Admin
 *
 */
public class Demo05 {
	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();
		list.add("a");
		list.add("abcd");
		list.add("abc");
		list.add("def");
		Collections.sort(list, new StringComp());
		System.out.println(list);
		
		list= new ArrayList<String>();
		list.add("a");
		list.add("abcd");
		list.add("abc");
		list.add("def");
		Collections.sort(list);
		System.out.println(list);
		//158
	}
}
