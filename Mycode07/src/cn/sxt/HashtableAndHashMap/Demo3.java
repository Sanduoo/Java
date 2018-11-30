package cn.sxt.HashtableAndHashMap;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * ʹ��Properties��ȡ�����ļ�
 * ��Դ�����ļ���
 * �洢
 *  1��.properties
 * 		void load(InputStream inStream) �������ֽ�����ȡ�����б�����Ԫ�ضԣ��� 
 * 		void load(Reader reader) �Լ򵥵����Ը�ʽ�������ַ�����ȡ�����б��ؼ��ֺ�Ԫ�ضԣ���
 * 2��.xml 
 * 		void loadFromXML(InputStream in) ��ָ���������е�XML�ĵ���ʾ���������Լ��ص������Ա��С�
 *
 * @author Admin
 *
 */
public class Demo3 {
public static void main(String[] args) throws FileNotFoundException, IOException {
	Properties pro = new Properties();
//	��ȡ
//	pro.load(new FileReader("E:/others/sd.properties"));				����·��
//	���·��
	pro.load(new FileReader("src/cn/sxt/HashtableAndHashMap/sd.properties"));
	System.out.println(pro.getProperty("users","bjsxt"));
	System.out.println(pro.getProperty("user","bjsxt"));
}
}
