package cn.sxt.HashtableAndHashMap;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 使用Properties输出到文件
 * 资源配置文件：
 * 存储
 * 1、.properties
 * 		store(OutputStream out, String comments)
 * 		store(Writer writer, String comments)
 * 2、.xml
 * 		storeToXML(OutputStream os, String comment)
 * 		storeToXML(OutputStream os, String comment, String encoding)
 * @author Admin
 *
 */
public class Demo02 {
	public static void main(String[] args) throws FileNotFoundException, IOException {				//检查时异常（与外界文件关联）
		Properties pro = new Properties();				//只能存储字符串
//		存储
		pro.setProperty("driver","oracle.jdbc.driver.OracleDriver");
		pro.setProperty("url","jdbc:oracle:thin:@localhost:1521:orcl");
		pro.setProperty("user","SanDuoo");
		pro.setProperty("pwd","1234");
//		存储到e:/others		绝对路径 指定盘符：/
//		pro.store(new FileOutputStream(new File("E:/others/sd.properties")), "sd配置");
//		pro.storeToXML(new FileOutputStream(new File("E:/others/sd.xml")), "sd配置");
//		相对路径  默认当前工程
		pro.store(new FileOutputStream(new File("src/cn/sxt/HashtableAndHashMap/sd.properties")), "sd配置");
	}
}
