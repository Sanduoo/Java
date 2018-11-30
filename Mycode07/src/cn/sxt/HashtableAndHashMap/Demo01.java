package cn.sxt.HashtableAndHashMap;

import java.util.Properties;

/**
 * Properties资源配置文件的读写
 * 1、key与value只能为字符串
 * 2、存储与读取
 * 		setProperty(String key, String value)
 * 		getProperty(String key, String defaultValue)
 * @author Admin
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		Properties pro = new Properties();				//只能存储字符串
//		存储
		pro.setProperty("driver","oracle.jdbc.driver.OracleDriver");//00:10   163
//		pro.setProperty("url","jdbc:oracle:thin:@localhost:1521:orcl");
		pro.setProperty("user","SanDuoo");
		pro.setProperty("pwd","1234");
//		获取
		String url = pro.getProperty("url","test");
		System.out.println(url);
	}
}
