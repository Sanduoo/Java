package cn.sxt.WeakHashMap;

import java.util.WeakHashMap;

/**
 * WeakHashMap ��Ϊ�����ͣ�gc������������
 * @author Admin
 *
 */
public class WeakHashMapDemo {
	public static void main(String[] args) {
		WeakHashMap<String,String> map = new WeakHashMap();
//		��������
		map.put("����", "����");				//�����ض��󲻻����
		map.put("�κ�", "����");
		map.put("����", "�ܲ�");
		map.put(new String("����"), "ߣ��");			//������
		
//		֪ͨ����
		System.gc();
		System.runFinalization();
		System.out.println(map.size());
	}
}
