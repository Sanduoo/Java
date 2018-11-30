package cn.sxt.HashtableAndHashMap;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * ʹ��Properties������ļ�
 * ��Դ�����ļ���
 * �洢
 * 1��.properties
 * 		store(OutputStream out, String comments)
 * 		store(Writer writer, String comments)
 * 2��.xml
 * 		storeToXML(OutputStream os, String comment)
 * 		storeToXML(OutputStream os, String comment, String encoding)
 * @author Admin
 *
 */
public class Demo02 {
	public static void main(String[] args) throws FileNotFoundException, IOException {				//���ʱ�쳣��������ļ�������
		Properties pro = new Properties();				//ֻ�ܴ洢�ַ���
//		�洢
		pro.setProperty("driver","oracle.jdbc.driver.OracleDriver");
		pro.setProperty("url","jdbc:oracle:thin:@localhost:1521:orcl");
		pro.setProperty("user","SanDuoo");
		pro.setProperty("pwd","1234");
//		�洢��e:/others		����·�� ָ���̷���/
//		pro.store(new FileOutputStream(new File("E:/others/sd.properties")), "sd����");
//		pro.storeToXML(new FileOutputStream(new File("E:/others/sd.xml")), "sd����");
//		���·��  Ĭ�ϵ�ǰ����
		pro.store(new FileOutputStream(new File("src/cn/sxt/HashtableAndHashMap/sd.properties")), "sd����");
	}
}
