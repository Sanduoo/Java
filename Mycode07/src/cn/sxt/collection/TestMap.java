package cn.sxt.collection;

import java.util.HashMap;
import java.util.Map;

/**
 *����Map�Ļ����÷� 
 * @author Admin
 *Map�ײ�ʵ�֣�����+����
 */
public class TestMap {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("������", new Wife("����"));
		map.put("�����", new Wife("�¶���"));
		
		/**Map���÷��� **/
		map.remove("������");				//�Ƴ�
		map.containsKey("������");		//key���Ƿ����������
		map.containsValue("����");		//value���Ƿ��������
		map.size();
		map.isEmpty();
		map.putAll(null);
		map.clear();
		
		Wife wife =(Wife)map.get("������");
		System.out.println(wife.name);
	}
}


class Wife{
	String name;
	public Wife (String name) {
		this.name = name; 
	}
}