package cn.sxt.collection02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test02 {
	
	public static void main(String[] args) {
		
		/**һ��map�����Ӧһ�м�¼**/
		Map map = new HashMap();
		map.put("id",0301);
		map.put("name","����");
		map.put("salary",20000);
		map.put("department","��Ŀ��");
		map.put("hireDate","2018-8");
		
		Map map2 = new HashMap();
		map2.put("id",0302);
		map2.put("name","�Ķ�");
		map2.put("salary",20001);
		map2.put("department","��Ŀ��");
		map2.put("hireDate","2018-7");
		
		Map map3 = new HashMap();
		map3.put("id",0303);
		map3.put("name","���");
		map3.put("salary",20002);
		map3.put("department","��Ŀ��");
		map3.put("hireDate","2018-6");
		
		List<Map> list = new ArrayList<Map>();
		
		list.add(map);
		list.add(map2);
		list.add(map3);
		
		printEmp(list);
		
	}
	
	public static void printEmp(List<Map> list) {
		for (int i = 0; i < list.size(); i++) {
			Map tempMap = list.get(i);
			System.out.println(tempMap.get("name")+"--"+tempMap.get("salary"));
		}
	}
}
