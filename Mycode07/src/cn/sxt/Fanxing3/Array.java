package cn.sxt.Fanxing3;

/**
 * 没有泛型数组
 * 声明可以使用，但是创建失败
 * @author Admin
 *
 */
public class Array {

	public static void main(String[] args) {
		Integer[] arr = new Integer[4];
		Student<?>[] arr2 = new Student[10];
		
		MyArrayList<String> strList = new MyArrayList<String>();
		strList.add(0,"a");
		 String elem = strList.getElem(0);
		 System.out.println(elem);
	}

}

class MyArrayList<E>{
	Object[] cap = new Object[10];
	
	public void add(int index,E e) {
		cap[index] = e;
	}
	
	@SuppressWarnings("unchecked")
	public E[ ] getAll() {
		return (E[ ]) cap;
	}
	
	@SuppressWarnings("unchecked")
	public E getElem(int index) {
		return (E) cap[index];
	}
}