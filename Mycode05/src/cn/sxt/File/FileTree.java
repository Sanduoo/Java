package cn.sxt.File;

import java.io.File;

/**
 * ��״�ṹչʾ�ض��ļ��м������ļ���
 * @author Admin
 *ʹ�õݹ�����
 */
public class FileTree {
	public static void main(String[] args) {
		
		/**����Ҫչʾ���ļ���·��**/
		File f = new File("E:/BaiduNetdisk");
		printFile(f,0);
		
	}
	
	
	static void printFile(File file,int level) {
		
		for (int i = 0; i < level; i++) {
			System.out.print("����");
		}
		System.out.println(file.getName());
		
		/****/
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (File temp : files) {
				printFile(temp, level+1);
			}
		}
		
	}
	
}
