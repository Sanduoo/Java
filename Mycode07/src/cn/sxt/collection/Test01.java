package cn.sxt.collection;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * ����List�еĻ�������
 * @author Admin
 *
 */
public class Test01 {
	public static void main(String[] args) {
		
		//Note: 
		//			ArayList: �ײ�ʵ�������飻���Բ�ѯ�죻�޸ġ����롢ɾ�������̲߳���ȫ��Ч�ʸ�
		//			LinkList:  �ײ�ʵ�����������Բ�ѯ�����޸ġ����롢ɾ���죻�̲߳���ȫ��Ч�ʸ�
		//			Vector:   �̰߳�ȫ��Ч�ʵ�
		List list = new ArrayList();
		
		list.add("aaa");
		list.add(new Date());
		list.add(new Dog());
		list.add(1234);				//��װ��ģ��Զ�װ�䣡
		
//		System.out.println(list.size());
		
		/**�����Ƿ�Ϊ��**/
		System.out.println(list.isEmpty());				//boolean isEmpty() ����˼��ϲ�����Ԫ�أ��򷵻� true ��  
/*		
		list.remove(new Date());				//hashcode��equals
		System.out.println(list.size());
*/		
		List list2 = new ArrayList();
		list2.add("bbb");
		list2.add("ccc");
/**		
		list.addAll(list2);
		System.out.println(list.size());
		
		
		/**��˳���йصĲ���**/
/*		String string = (String) list.get(0);
		System.out.println(string);
		list.set(1, "aba"); 
		list.remove(0);
**/		
		System.out.println("######");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}

class Dog{
	
}