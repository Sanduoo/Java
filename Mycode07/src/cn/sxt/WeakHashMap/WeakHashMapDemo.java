package cn.sxt.WeakHashMap;

import java.util.WeakHashMap;

/**
 * WeakHashMap 键为弱类型，gc运行立即回收
 * @author Admin
 *
 */
public class WeakHashMapDemo {
	public static void main(String[] args) {
		WeakHashMap<String,String> map = new WeakHashMap();
//		测试数据
		map.put("景航", "健身");				//常量池对象不会回收
		map.put("治浩", "锻炼");
		map.put("三多", "跑步");
		map.put(new String("唐瑞"), "撸铁");			//被回收
		
//		通知回收
		System.gc();
		System.runFinalization();
		System.out.println(map.size());
	}
}
