package cn.sxt.HashtableAndHashMap;

import java.util.Properties;

/**
 * Properties��Դ�����ļ��Ķ�д
 * 1��key��valueֻ��Ϊ�ַ���
 * 2���洢���ȡ
 * 		setProperty(String key, String value)
 * 		getProperty(String key, String defaultValue)
 * @author Admin
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		Properties pro = new Properties();				//ֻ�ܴ洢�ַ���
//		�洢
		pro.setProperty("driver","oracle.jdbc.driver.OracleDriver");//00:10   163
//		pro.setProperty("url","jdbc:oracle:thin:@localhost:1521:orcl");
		pro.setProperty("user","SanDuoo");
		pro.setProperty("pwd","1234");
//		��ȡ
		String url = pro.getProperty("url","test");
		System.out.println(url);
	}
}
