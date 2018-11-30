package cn.sxt.IteratorCollection;

import java.util.Iterator;

/**
 * �򻯵�����ԭ��   ����ӿ��ṩ����
 * hashnext
 * next
 * @author Admin
 *
 */
public class MyArrayList3 implements java.lang.Iterable<String>{
	private String[] elem = {"a","b","c","d"};
	/*�򻯵�����ԭ��*/
	private int size = elem.length;
	
	
	/*�����ڲ���*/
	public Iterator<String> iterator(){
		return new Iterator<String>() {
			private int cursor = -1;				//�α�ָ���-1��ʼ
			/*�ж��Ƿ������һ��Ԫ��*/
			public boolean hasNext() {
				return cursor+1<size;
			}
			
			/*��ȡ��һ��Ԫ��*/
			public String next() {
				cursor ++;				//�ƶ�һ��
				return elem [cursor];
			}
		};
	}

	public static void main(String[] args) {
		MyArrayList3 list = new MyArrayList3();
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			it.remove(); 				//���ڲ鿴Ԫ��ʱ��ͬʱɾ��Ԫ��
		}
		
		it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("��ǿfor,����ʵ��java.lang.Iterable�ӿڣ���дIterable");
		for(String temp: list) {
			System.out.println(temp);
		}
		
	}
}
