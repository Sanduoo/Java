package cn.sxt.IteratorCollection;

/**
 * �򻯵�����ԭ��
 * hashnext
 * next
 * @author Admin
 *
 */
public class MyArrayList {
	private String[] elem = {"a","b","c","d"};
	/*�򻯵�����ԭ��*/
	private int size = elem.length;
	

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
		
	}
	

	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();
		while (list.hasNext()) {
			System.out.println(list.next());
			
		}
	}
}
