package cn.sxt.HashtableAndHashMap;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * 使用Properties读取配置文件
 * 资源配置文件：
 * 存储
 *  1、.properties
 * 		void load(InputStream inStream) 从输入字节流读取属性列表（键和元素对）。 
 * 		void load(Reader reader) 以简单的线性格式从输入字符流读取属性列表（关键字和元素对）。
 * 2、.xml 
 * 		void loadFromXML(InputStream in) 将指定输入流中的XML文档表示的所有属性加载到此属性表中。
 *
 * @author Admin
 *
 */
public class Demo3 {
public static void main(String[] args) throws FileNotFoundException, IOException {
	Properties pro = new Properties();
//	读取
//	pro.load(new FileReader("E:/others/sd.properties"));				绝对路径
//	相对路径
	pro.load(new FileReader("src/cn/sxt/HashtableAndHashMap/sd.properties"));
	System.out.println(pro.getProperty("users","bjsxt"));
	System.out.println(pro.getProperty("user","bjsxt"));
}
}
