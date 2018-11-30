package cn.sxt.collection;

import java.util.HashMap;
import java.util.Map;

/**
 *测试Map的基本用法 
 * @author Admin
 *Map底层实现，数组+链表
 */
public class TestMap {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("李云龙", new Wife("秀芹"));
		map.put("李大钊", new Wife("陈独秀"));
		
		/**Map常用方法 **/
		map.remove("李云龙");				//移除
		map.containsKey("李云龙");		//key中是否存在李云龙
		map.containsValue("秀芹");		//value中是否存在秀芹
		map.size();
		map.isEmpty();
		map.putAll(null);
		map.clear();
		
		Wife wife =(Wife)map.get("李云龙");
		System.out.println(wife.name);
	}
}


class Wife{
	String name;
	public Wife (String name) {
		this.name = name; 
	}
}