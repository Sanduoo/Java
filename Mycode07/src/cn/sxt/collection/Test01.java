package cn.sxt.collection;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 测试List中的基本方法
 * @author Admin
 *
 */
public class Test01 {
	public static void main(String[] args) {
		
		//Note: 
		//			ArayList: 底层实现是数组；所以查询快；修改、插入、删除慢；线程不安全；效率高
		//			LinkList:  底层实现是链表；所以查询慢；修改、插入、删除快；线程不安全；效率高
		//			Vector:   线程安全；效率低
		List list = new ArrayList();
		
		list.add("aaa");
		list.add(new Date());
		list.add(new Dog());
		list.add(1234);				//包装类的：自动装箱！
		
//		System.out.println(list.size());
		
		/**数组是否为空**/
		System.out.println(list.isEmpty());				//boolean isEmpty() 如果此集合不包含元素，则返回 true 。  
/*		
		list.remove(new Date());				//hashcode和equals
		System.out.println(list.size());
*/		
		List list2 = new ArrayList();
		list2.add("bbb");
		list2.add("ccc");
/**		
		list.addAll(list2);
		System.out.println(list.size());
		
		
		/**跟顺序有关的操作**/
/*		String string = (String) list.get(0);
		System.out.println(string);
		list.set(1, "aba"); 
		list.remove(0);
**/		
		System.out.println("######");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}

class Dog{
	
}