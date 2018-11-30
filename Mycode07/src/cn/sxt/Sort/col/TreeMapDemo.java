package cn.sxt.Sort.col;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		Person p1 = new Person("老李",50);
		Person p2 = new Person("小李",100);
		Person p3 = new Person("三多",80);
		
		TreeMap<Person,String> map = new TreeMap<>(
				new java.util.Comparator<Person>() {				//比较器
					public int compare(Person o1,Person o2) {
						return o1.getHandsome()-o2.getHandsome();
			}
		});
		map.put(p1, "三多");
		map.put(p2, "三多");
		map.put(p3, "三多");
		
//		查看键
		Set<Person> persons = map.keySet();
		System.out.println(persons);
	}
}
