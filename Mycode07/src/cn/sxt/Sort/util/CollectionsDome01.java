package cn.sxt.Sort.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 1��binarySearch(List<? extends Comparable<? super T>> list, T key)		ʹ�ö��������㷨����ָ�������ָ���б�
 * Ҫ��list��������
 * 
 * 2��sort(List<T> list) ������Ԫ�ص�natural ordering		��ָ�����б��������
 * 		sort(List<T> list, Comparator<? super T> c) 		����ָ���ıȽ��������˳���ָ�����б��������
 * 
 * 3��reverse(List<?> list) 		��תָ���б���Ԫ�ص�˳��
 * 		shuffle(List<?> list) 		ʹ��Ĭ�ϵ����Դ�������ָ�����б�������˳��
 * 
 * 4��swap(List<?> list, int i, int j) 		����ָ���б���ָ��λ�õ�Ԫ��
 * 
 * @author Admin
 *
 */
public class CollectionsDome01 {
	public static void main(String[] args) {
		List<Integer> cards = new ArrayList<>();
		//shuffle ϴ�� ģ�⶷���� 
		for (int i = 0; i < 54; i++) {
			cards.add(i);
		}
//		ϴ��
		Collections.shuffle(cards);
//		���η���
		List<Integer> p1 = new ArrayList<>();
		List<Integer> p2 = new ArrayList<>();
		List<Integer> p3 = new ArrayList<>();
		List<Integer> last = new ArrayList<>();				//�����ŵ���
		for (int i = 0; i < 51; i+=3) {
			p1.add(cards.get(i));
			p2.add(cards.get(i+1));
			p3.add(cards.get(i+2));
//			last.add(cards.get(i+3));
		}
		last.add(cards.get(51));
		last.add(cards.get(52));
		last.add(cards.get(53));

		System.out.println("��һ���ˣ�"+p1);
		System.out.println("�ڶ����ˣ�"+p2);
		System.out.println("�������ˣ�"+p3);
		System.out.println("����Ϊ��"+last);
	}
	
//	��ת
	public static void test1() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println("��ת֮���list"+list);
	}
}


//161