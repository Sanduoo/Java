package cn.sxt.Collections.synchronizedxxx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 使用Collections管理同步 容器
 * 				synchronizedList()
 * 				synchronizedSet()
 *  			synchronizedMap()
 * @author Admin
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
//		list可以同步
		List<String> synlist = Collections.synchronizedList(list);				//synchronizedList(list)返回一个新的list
		System.out.println("线程安全的list制作完毕");
	}

}
