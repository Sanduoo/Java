package cn.sxt.IO.byteIO;

import java.io.File;

public class DirDemo01 {

	public static void main(String[] args) {
		File dir = new File("c:/WeChat Files");
		
		//�¼�����list
		String[] subNames = dir.list();
		for(String s:subNames) {
			System.out.println("�¼�����"+s);
		}
		
		//�¼������ļ����ļ��У�
		File[] subFile = dir.listFiles();
		for(File s:subFile) {
			System.out.println("�¼�����"+s);
		}
		
		//�����̷�
		File[] subRoot = dir.listRoots();
		for(File s:subRoot) {
			System.out.println("�����̷�"+s);
		}
		
	}
}
