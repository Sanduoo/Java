package cn.sxt.Data;

import java.util.Date;

/**
 * 测试Date时间类（java.util.Date）
 * @author Admin
 *从标准纪元1970.1.1 0:00开始
 */
public class TestDate {
	public static void main(String[] args) {
		
		//Note: Date类表示特定的时刻，精度为毫秒。
		Date d = new Date();
		
		long t = System.currentTimeMillis();
		System.out.println(t);				//当前时刻
		
		Date d2 = new Date(1000);				//一千毫米
		System.out.println(d2.toGMTString());				//不建议使用toGMTString
		
		System.out.println(d2.getTime());
		d2.setTime(2000);
		
		System.out.println(d.getTime()<d2.getTime());
		
		
	}
}
