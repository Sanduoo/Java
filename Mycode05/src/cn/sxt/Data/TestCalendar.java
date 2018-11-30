package cn.sxt.Data;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 测试日期类
 * 
 * @author Admin
 *
 */
public class TestCalendar {
	public static void main(String[] args) {
		
		Calendar c = new GregorianCalendar();
		
/*		//Note: 0-一月；1-二月、星期日
		c.set(2001, Calendar.FEBRUARY, 10, 12, 23,34);

		c.set(Calendar.YEAR, 2001);
		c.set(Calendar.MARCH, 1);
		c.set(Calendar.DATE, 11);				//未设时分秒则引用当前时间
		
		c.setTime(new Date());
*/
		
		Date date = c.getTime();
		System.out.println(date);
		System.out.println(c.get(Calendar.YEAR));
		
		/**测试日期计算**/
		c.add(Calendar.YEAR, 30);				//当前时间加30年
		c.add(Calendar.YEAR, -30);			//当前时间减三十年
		c.add(Calendar.MARCH, 30);			//当前时间加30个月
		System.out.println(c);
	}
}
