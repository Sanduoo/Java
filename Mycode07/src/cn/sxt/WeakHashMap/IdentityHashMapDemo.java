package cn.sxt.WeakHashMap;

import java.util.IdentityHashMap;

/**
 * IdentityHashMap  ���Ƚϵ�ַȥ��
 * @author Admin
 *
 */
public class IdentityHashMapDemo {

	public static void main(String[] args) {
		IdentityHashMap<String,String> map = new IdentityHashMap<>();
//		�������еġ�a��
		map.put("a", "a1");			
		map.put("a", "a2");
		System.out.println(map.size());				//a1,a2ͬһ��ַ
		map.put(new String("a"), "a3");
		map.put(new String("a"), "a4");
		System.out.println(map.size());				//a3,a4��ͬ��ַ
	}

}
