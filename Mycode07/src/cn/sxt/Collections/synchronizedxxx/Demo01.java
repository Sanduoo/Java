package cn.sxt.Collections.synchronizedxxx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ʹ��Collections����ͬ�� ����
 * 				synchronizedList()
 * 				synchronizedSet()
 *  			synchronizedMap()
 * @author Admin
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
//		list����ͬ��
		List<String> synlist = Collections.synchronizedList(list);				//synchronizedList(list)����һ���µ�list
		System.out.println("�̰߳�ȫ��list�������");
	}

}
