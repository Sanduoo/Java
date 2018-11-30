package cn.sxt.IteratorCollection;

import java.util.Iterator;

/**
 * �򻯵�����ԭ��   ����ӿ��ṩ����
 * hashnext
 * next
 * @author Admin
 *
 */
public class MyArrayList2 {
	private String[] elem = {"a","b","c","d"};
	/*�򻯵�����ԭ��*/
	private int size = elem.length;
	
	private  class MyIt implements Iterator<String> {
		
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
		
		/*ɾ��Ԫ��*/
		public void remove() {
			//û��ʵ��
		}

		
	}

	public Iterator<String> iterator(){
		return new MyIt();
	}

	public static void main(String[] args) {
		MyArrayList2 list = new MyArrayList2();
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
	}
}
