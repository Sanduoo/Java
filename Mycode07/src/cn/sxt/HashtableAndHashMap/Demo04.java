package cn.sxt.HashtableAndHashMap;

import java.io.IOException;
import java.util.Properties;

/**
 * ʹ�������·����ȡ�����ļ�
 * bin
 * @author Admin
 *
 */
public class Demo04 {
	public static void main(String[] args) throws IOException {
		Properties pro = new Properties();
//		�����·�� /-bin
		pro.load(Demo04.class.getResourceAsStream("/cn/sxt/HashtableAndHashMap/sd.properties"));
		pro.load(Thread.currentThread().getContextClassLoader().getResourceAsStream(""));				//�������  " "��ʾbin
		System.out.println(pro.getProperty("user","bjsxt"));
	}
}
