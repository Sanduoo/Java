package cn.sxt.Collections.synchronizedxxx;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/**
 * ֻ������
 *  	1��emptyxxx() �յĲ���ļ���
 *  			emptyList()
 *    			emptyMap()
 *      		emptySet()
 *  	2��singletonxxx() һ��Ԫ�ز��ɱ�ļ���
 *    			singleton(T o)
 *  			singletonList(T o)
 *    			singletonMap(K key,V value)
 *  	3��unmodifiable() ���ɱ�����
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
//		ֻ������
		Map<String,String> map2 = Collections.unmodifiableMap(map);
//		map2.put("a", "b");			�쳣���ɲ���
		System.out.println(map2.size());
		
//		ֻ�ܰ���һ��Ԫ�ص���������
		List<String> list = Collections.singletonList(new String());
		list.add("a");
//		list.addAll("b");
	}
	public static Set<String> oper(Set<String> set) {
		if (null==set) {
			return Collections.EMPTY_SET;				//�ⲿ��ȡ����NullPointerException
		}
//		����
		return set;
	}
}
