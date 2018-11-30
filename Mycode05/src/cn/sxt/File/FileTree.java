package cn.sxt.File;

import java.io.File;

/**
 * 树状结构展示特定文件夹及其子文件夹
 * @author Admin
 *使用递归来做
 */
public class FileTree {
	public static void main(String[] args) {
		
		/**输入要展示的文件夹路径**/
		File f = new File("E:/BaiduNetdisk");
		printFile(f,0);
		
	}
	
	
	static void printFile(File file,int level) {
		
		for (int i = 0; i < level; i++) {
			System.out.print("——");
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
