package cn.sxt.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * ����Set�ó��·���
 * @author Admin
 *���򣬲��ظ�
 */
public class TestSet {

	public static void main(String[] args) {
		Set set = new HashSet<>();
		
		//Note: add������Map�������Ѷ�����ΪMap�е�һ��Key�������Բ����ظ�
		set.add("aaa");
		set.add("bbb");
		set.add(new String("aaa"));				//equalsֵ��aaa��ȣ��޷����
		System.out.println(set.size());
		System.out.println(set.contains("aaa"));
		System.out.println(set.remove("aaa"));
	}
}
