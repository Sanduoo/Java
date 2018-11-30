package cn.sxt.HashtableAndHashMap;

import java.io.IOException;
import java.util.Properties;

/**
 * 使用类相对路径读取配置文件
 * bin
 * @author Admin
 *
 */
public class Demo04 {
	public static void main(String[] args) throws IOException {
		Properties pro = new Properties();
//		类相对路径 /-bin
		pro.load(Demo04.class.getResourceAsStream("/cn/sxt/HashtableAndHashMap/sd.properties"));
		pro.load(Thread.currentThread().getContextClassLoader().getResourceAsStream(""));				//类加载器  " "表示bin
		System.out.println(pro.getProperty("user","bjsxt"));
	}
}
