package cn.sxt.Sort.col;

import java.util.TreeSet;

/**
 * �ṩ�˽���ķ�ʽ����|ҵ��������
 * 
 * TreeSet���������ʱ����������������ٸ��Ĳ���Ӱ��ԭ����˳��
 * 
 * ע�⣺
 * ʹ��ʱ��Ҫ�޸����ݣ�ʹ��final���Σ�
 * @author Admin
 *
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		Person p1 = new Person("����",50);
		Person p2 = new Person("С��",100);
		Person p3 = new Person("����",80);
		
//		���δ�ŵ�TreeSet�����У�ʹ�������ҵ���ࣨ�����ڲ��ࣩ
		TreeSet<Person> person = new TreeSet<>(
				new java.util.Comparator<Person>() {				//�Ƚ���
					public int compare(Person o1,Person o2) {
						return o1.getHandsome()-o2.getHandsome();
					}
				}
				);
//		Note: ���������ʱ����
		person.add(p1);
		person.add(p2);
		person.add(p3);
		
		System.out.println(person);
		
		//���ܸı�����
//		p3.setHandsome(-100);
//		System.out.println(person);
	}
}
