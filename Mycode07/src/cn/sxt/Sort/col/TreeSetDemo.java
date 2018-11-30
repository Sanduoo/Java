package cn.sxt.Sort.col;

import java.util.TreeSet;

/**
 * 提供了解耦的方式：”|业务排序类
 * 
 * TreeSet在添加数据时排序，数据再排序后再更改不会影响原来的顺序
 * 
 * 注意：
 * 使用时不要修改数据（使用final修饰）
 * @author Admin
 *
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		Person p1 = new Person("老李",50);
		Person p2 = new Person("小李",100);
		Person p3 = new Person("三多",80);
		
//		依次存放到TreeSet容器中，使用排序的业务类（匿名内部类）
		TreeSet<Person> person = new TreeSet<>(
				new java.util.Comparator<Person>() {				//比较器
					public int compare(Person o1,Person o2) {
						return o1.getHandsome()-o2.getHandsome();
					}
				}
				);
//		Note: 在添加数据时排序
		person.add(p1);
		person.add(p2);
		person.add(p3);
		
		System.out.println(person);
		
		//不能改变数据
//		p3.setHandsome(-100);
//		System.out.println(person);
	}
}
