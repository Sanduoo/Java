package cn.sxt.IO.File;

import java.io.File;
import java.util.Arrays;

/**
 * 输出子孙级文件目录|文件的名称（绝对路径）
 * 1、listFile（）
 * 2、递归
 * @author Admin
 * 
 * 
 *
 */
public class Demo05 {
	public static void main(String[] args) {
		String path = "C:\\WeChat Files\\1";
		File parent = new File(path);
		printName(parent);
		
		File[ ] roots = File.listRoots();				//调用根路径
		System.out.println(Arrays.toString(roots));
		for(File temp : roots) {
			printName(temp);
		}
	}
	
//	输出路径
	public static void printName(File src) {
		//递归体
		if (null==src || ! src.exists()) {
			return;
		}
		System.out.println(src.getAbsolutePath());
		//递归头
		if (src.isDirectory()) {				//判断是否是文件夹
			for(File sub : src.listFiles()) {
				printName(sub);
			}
		}
	}
}
