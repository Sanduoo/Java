package cn.sxt.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * 测试Set得常勇方法
 * @author Admin
 *无序，不重复
 */
public class TestSet {

	public static void main(String[] args) {
		Set set = new HashSet<>();
		
		//Note: add调用了Map方法（把对象作为Map中的一个Key），所以不能重复
		set.add("aaa");
		set.add("bbb");
		set.add(new String("aaa"));				//equals值与aaa相等，无法添加
		System.out.println(set.size());
		System.out.println(set.contains("aaa"));
		System.out.println(set.remove("aaa"));
	}
}
