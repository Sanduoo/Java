package cn.sxt.HashMap;

import java.awt.RenderingHints.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * this is a cat and that is a mice and where is the food?
 * 统计每个单词出现的次数
 * 存储的Map中
 * key：String
 * value：自定义类型
 * 
 * “分拣”思路
 * 1、为所有的key创建容器，存放对应的value
 * 2、第一次创建容器并存放值value；第二次，直接使用容器存放值
 * 
 * @author Admin
 *
 */
public class Demo01 {
	
	
	public static void main(String[] args) {
		String string="this is a cat and that is a mice and where is the food";
		/*分割字符串*/
		String[ ] strArray = string.split(" ");
		/*储存到Map中*/
		Map<String, Letter> letters = new HashMap<String,Letter>();
		
		//思路二
		for (String temp : strArray) {				//遍历存放
			
			Letter coLetter = null;
			//1、为当前key创建容器
			if (null==(coLetter=letters.get(temp))) {				//如果不存在该key的容器，则创建一个容器
				coLetter.setCount(1);
				letters.put(temp, coLetter);
			}else {
				//第二次，直接使用容器存放值
				coLetter.setCount(coLetter.getCount()+1);				//存入一个key后count+1
			}
		}
		
		//输出Map的值
		Set<String> keys = letters.keySet();
		for (String key : keys) {
			Letter coLetter = letters.get(key);
			System.out.println("字母："+key+"，次数"+coLetter.getCount());
		}
		
	}
/**	
	public static void test1() {

		//*思路一
		for (String temp : strArray) {				//遍历存放
			
			//1、为所有key创建容器
			if (!letters.containsKey(temp)) {				//如果不存在该key的容器，则创建一个容器
				letters.put(temp, key);
			}
			//第二次，直接使用容器存放值
			Letter coLetter = letters.get(temp);							//直接使用容器
			coLetter.setCount(coLetter.getCount()+1);				//存入一个key后count+1
		}
		
		//输出Map的值
		Set<String> keys = letters.keySet();
		for (String key : keys) {
			Letter coLetter = letters.get(key);
			System.out.println("字母："+key+"，次数"+coLetter.getCount());
		}
	}
	
**/
	
	
}
