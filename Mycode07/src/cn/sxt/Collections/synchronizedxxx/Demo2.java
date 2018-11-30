package cn.sxt.Collections.synchronizedxxx;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/**
 * 只读设置
 *  	1、emptyxxx() 空的不变的集合
 *  			emptyList()
 *    			emptyMap()
 *      		emptySet()
 *  	2、singletonxxx() 一个元素不可变的集合
 *    			singleton(T o)
 *  			singletonList(T o)
 *    			singletonMap(K key,V value)
 *  	3、unmodifiable() 不可变容器
 *  			unmodifiableList(List<? extend T> list)
 *  			unmodifiableSet(Set<? extend T> s)
 *  			unmodifiableMap(Map<? extend K,? extend V> m)
 * @author Admin
 *
 */
public class Demo2 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("aaa", "aaa");
		map.put("bbb", "bbb");
//		只读控制
		Map<String,String> map2 = Collections.unmodifiableMap(map);
//		map2.put("a", "b");			异常不可操作
		System.out.println(map2.size());
		
//		只能包含一个元素的容器测试
		List<String> list = Collections.singletonList(new String());
		list.add("a");
//		list.addAll("b");
	}
	public static Set<String> oper(Set<String> set) {
		if (null==set) {
			return Collections.EMPTY_SET;				//外部获取避免NullPointerException
		}
//		操作
		return set;
	}
}
