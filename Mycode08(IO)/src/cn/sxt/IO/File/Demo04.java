package cn.sxt.IO.File;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

/**
 * 5������Ŀ¼
	mkdir() ����Ŀ¼������ȷ�� ��Ŀ¼���ڣ���������ڣ�����ʧ��
	mkdirs() ����Ŀ¼�������Ŀ¼��������һͬ����
	list() �ļ�|Ŀ¼ ���ַ�����ʽ
	listFiles()
	static listRoots() ��·��
 * @author Admin
 *
 */
public class Demo04 {
	public static void main(String[] args) throws IOException {
		
		test1();
		String path = "c:/WeChat Files/1";
		File src = new File(path);
		if (src.isDirectory()) {
			System.out.println("===��Ŀ¼|�ļ���===");
			String[ ] subName = src.list(); 
			for(String temp : subName){
				System.out.println(temp);
			}                                      
			System.out.println("===��Ŀ¼|�ļ�File����===");
			File[ ] subFiles = src.listFiles();
			for(File temp : subFiles) {
				System.out.println(temp);
			}
			System.out.println("===���ļ�.java����===");
			subFiles = src.listFiles(new FilenameFilter() {
				
				public boolean accept(File dir,String name) {
					return new File(dir,name).isFile()&&name.endsWith(".java");			//��׺��ΪJava���ļ�
				}
			});
			for(File temp : subFiles) {
				System.out.println(temp.getAbsolutePath());
			}
		}
		File src2 = new File("c:/WeChat Files/1.png");
		boolean flag = src2.createNewFile();
		System.out.println(flag);
	}
	public static void test1() {
		String path = "c:/WeChat Files/1/2.txt";
		File src = new File(path);
		src.mkdir();
	}
}
