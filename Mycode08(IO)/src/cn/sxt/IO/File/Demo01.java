package cn.sxt.IO.File;

import java.io.File;

/**
 * ��������
 * 1��·���ָ���  ;
 * 2�����Ʒָ���\(windows)		/(Linux��)
 * @author Admin
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		System.out.println(File.pathSeparator);		//�ָ��������·���ַ����ķָ�����;
		System.out.println(File.separator); 				//ͳһ·���ַ����е�Ŀ¼�ָ�����\
		
//		·���ı�ʾ��ʽ
		String path = "E://others//1.txt";
		path = "E:"+File.separator+"others"+File.separator+"1.txt";			//��̬·������������
		path = "E:/others/1.txt";
		
		File src = new File(path);
		System.out.println(System.getProperty("user.dir"));
		System.out.println(src.getAbsolutePath());
	
	}
}
