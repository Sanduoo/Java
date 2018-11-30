package cn.SanDuo.VisualizationCalendar;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * 可视化日历程序
 * @author Admin
 *
 */
public class VisualizationCalendar {
	public static void main(String[] args) {
		
		/**输入日期**/
		System.out.println("请输入日期（yyyy-MM-dd）");
		Scanner scanner = new Scanner(System.in);
		String temp = scanner.nextLine();
		
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			
			Date date = format.parse(temp);
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(date);
			int day = calendar.get(Calendar.DATE);
			calendar.set(Calendar.DATE, 1); 				//把日期设为一号
			
			int maxDate = calendar.getActualMaximum(Calendar.DATE);			//当月最大的日期
			
			/**星期栏**/
			System.out.println("日\t一\t二\t三\t四\t五\t六");
			
			/**日期栏**/
			
			for (int i = 1;i<calendar.get(Calendar.DAY_OF_WEEK);i++) {
				System.out.print("\t");
			}
			
			for (int i = 1; i <= maxDate; i++) {
				if (i==day) {
					System.out.print("*");
				}
				System.out.print(i+"\t");
				int w = calendar.get(Calendar.DAY_OF_WEEK);
				if (w==Calendar.SATURDAY) {
					System.out.println();
				}
				calendar.add(Calendar.DATE, 1);
			}
			
			
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
