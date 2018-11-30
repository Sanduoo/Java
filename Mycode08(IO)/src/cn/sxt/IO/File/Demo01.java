package cn.sxt.IO.File;

import java.io.File;

/**
 * 两个常量
 * 1、路径分隔符  ;
 * 2、名称分隔符\(windows)		/(Linux等)
 * @author Admin
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		System.out.println(File.pathSeparator);		//分隔连续多个路径字符串的分隔符：;
		System.out.println(File.separator); 				//统一路径字符串中的目录分隔符：\
		
//		路径的表示方式
		String path = "E://others//1.txt";
		path = "E:"+File.separator+"others"+File.separator+"1.txt";			//动态路径（服务器）
		path = "E:/others/1.txt";
		
		File src = new File(path);
		System.out.println(System.getProperty("user.dir"));
		System.out.println(src.getAbsolutePath());
	
	}
}
