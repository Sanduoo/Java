package cn.sxt.IO.File;

import java.io.File;

/**
 * 相对路径与绝对路径构造File对象
 * 1、相对路径
 * 		File（String parent，String child）==>File（"E:/others"，"1.txt"）
 * 		File （File parent，String child）==>File （new File（"E:/others"），"1.txt"）
 * @author Admin
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		String parentPath = "E:/others";
		String name = "1.txt";
//		相对路径
		File src = new File(parentPath);
		src = new File(new File(parentPath),name);
		System.out.println(src.getName());
		System.out.println(src.getPath());
//		绝对路径
		System.out.println("======");
		src = new File("E:/others/1.txt");
		System.out.println(src.getName());
		System.out.println(src.getPath());
//		没有盘符  ：以user.dir构建
		System.out.println("######");
		src  = new  File("Test.txt");
		src = new File(".");				//点表示当前路径
		System.out.println(src.getName());				//返回名称
		System.out.println(src.getPath());				//如果是绝对路径，返回完整路径；否则相对路径
		System.out.println(src.getAbsolutePath());				//返回绝对路径（工作区路径）
	}
}
