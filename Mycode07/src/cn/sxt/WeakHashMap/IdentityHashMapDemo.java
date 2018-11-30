package cn.sxt.WeakHashMap;

import java.util.IdentityHashMap;

/**
 * IdentityHashMap  键比较地址去重
 * @author Admin
 *
 */
public class IdentityHashMapDemo {

	public static void main(String[] args) {
		IdentityHashMap<String,String> map = new IdentityHashMap<>();
//		常量池中的“a”
		map.put("a", "a1");			
		map.put("a", "a2");
		System.out.println(map.size());				//a1,a2同一地址
		map.put(new String("a"), "a3");
		map.put(new String("a"), "a4");
		System.out.println(map.size());				//a3,a4不同地址
	}

}
