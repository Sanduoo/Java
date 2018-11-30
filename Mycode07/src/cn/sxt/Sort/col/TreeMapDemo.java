package cn.sxt.Sort.col;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		Person p1 = new Person("����",50);
		Person p2 = new Person("С��",100);
		Person p3 = new Person("����",80);
		
		TreeMap<Person,String> map = new TreeMap<>(
				new java.util.Comparator<Person>() {				//�Ƚ���
					public int compare(Person o1,Person o2) {
						return o1.getHandsome()-o2.getHandsome();
			}
		});
		map.put(p1, "����");
		map.put(p2, "����");
		map.put(p3, "����");
		
//		�鿴��
		Set<Person> persons = map.keySet();
		System.out.println(persons);
	}
}
