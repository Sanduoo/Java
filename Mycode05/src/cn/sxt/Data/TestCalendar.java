package cn.sxt.Data;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * ����������
 * 
 * @author Admin
 *
 */
public class TestCalendar {
	public static void main(String[] args) {
		
		Calendar c = new GregorianCalendar();
		
/*		//Note: 0-һ�£�1-���¡�������
		c.set(2001, Calendar.FEBRUARY, 10, 12, 23,34);

		c.set(Calendar.YEAR, 2001);
		c.set(Calendar.MARCH, 1);
		c.set(Calendar.DATE, 11);				//δ��ʱ���������õ�ǰʱ��
		
		c.setTime(new Date());
*/
		
		Date date = c.getTime();
		System.out.println(date);
		System.out.println(c.get(Calendar.YEAR));
		
		/**�������ڼ���**/
		c.add(Calendar.YEAR, 30);				//��ǰʱ���30��
		c.add(Calendar.YEAR, -30);			//��ǰʱ�����ʮ��
		c.add(Calendar.MARCH, 30);			//��ǰʱ���30����
		System.out.println(c);
	}
}
