package cn.sxt.IteratorCollection;

import java.util.Iterator;

/**
 * 简化迭代器原理   加入接口提供方法
 * hashnext
 * next
 * @author Admin
 *
 */
public class MyArrayList3 implements java.lang.Iterable<String>{
	private String[] elem = {"a","b","c","d"};
	/*简化迭代器原理*/
	private int size = elem.length;
	
	
	/*匿名内部类*/
	public Iterator<String> iterator(){
		return new Iterator<String>() {
			private int cursor = -1;				//游标指针从-1开始
			/*判断是否存在下一个元素*/
			public boolean hasNext() {
				return cursor+1<size;
			}
			
			/*获取下一个元素*/
			public String next() {
				cursor ++;				//移动一次
				return elem [cursor];
			}
		};
	}

	public static void main(String[] args) {
		MyArrayList3 list = new MyArrayList3();
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			it.remove(); 				//可在查看元素时，同时删除元素
		}
		
		it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("增强for,必须实现java.lang.Iterable接口，重写Iterable");
		for(String temp: list) {
			System.out.println(temp);
		}
		
	}
}
