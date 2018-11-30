package cn.sxt.IO.File;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

/**
 * 5、操作目录
	mkdir() 创建目录，必须确保 父目录存在，如果不存在，创建失败
	mkdirs() 创建目录，如果父目录链不存在一同创建
	list() 文件|目录 名字符串形式
	listFiles()
	static listRoots() 根路径
 * @author Admin
 *
 */
public class Demo04 {
	public static void main(String[] args) throws IOException {
		
		test1();
		String path = "c:/WeChat Files/1";
		File src = new File(path);
		if (src.isDirectory()) {
			System.out.println("===子目录|文件名===");
			String[ ] subName = src.list(); 
			for(String temp : subName){
				System.out.println(temp);
			}                                      
			System.out.println("===子目录|文件File对象===");
			File[ ] subFiles = src.listFiles();
			for(File temp : subFiles) {
				System.out.println(temp);
			}
			System.out.println("===子文件.java对象===");
			subFiles = src.listFiles(new FilenameFilter() {
				
				public boolean accept(File dir,String name) {
					return new File(dir,name).isFile()&&name.endsWith(".java");			//后缀名为Java的文件
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
