package cn.sxt.IteratorCollection;

/**
 * 简化迭代器原理
 * hashnext
 * next
 * @author Admin
 *
 */
public class MyArrayList {
	private String[] elem = {"a","b","c","d"};
	/*简化迭代器原理*/
	private int size = elem.length;
	

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
	
	/*删除元素*/
	public void remove() {
		
	}
	

	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();
		while (list.hasNext()) {
			System.out.println(list.next());
			
		}
	}
}
