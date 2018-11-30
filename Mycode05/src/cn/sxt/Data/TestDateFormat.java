package cn.sxt.Data;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
	public static void main(String[] args) {
		
		//Note: SimpleDateFormat exends DateFormat;    abstract DateFormat
//		DateFormat df = new SimpleDateFormat("yyyy��MM��dd��");			//1970��01��02��
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss,���ڱ���ĵ�w��");				//��ʽ���ַ���
		Date d = new Date(123213123L);
//		System.out.println(d);
		String str = df.format(d);
		System.out.println(str);
		
		/**ʱ��ת��**/
		String str2 = "1977-07-07";
		DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date d2 = df2.parse(str2);
			System.out.println(d2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
}
