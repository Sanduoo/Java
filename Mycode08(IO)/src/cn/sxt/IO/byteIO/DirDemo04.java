package cn.sxt.IO.byteIO;

import java.io.File;

/**
 * 获取文件夹的大小
 * 递归：文件夹中的文件相加
 * @author Administrator
 *
 */
public class DirDemo04 {

	public static void main(String[] args) {
		File src = new File("C:\\WeChat Files");
		count(src);
		System.out.println(len);
	}
	private static long len=0;
	public static void count(File src) {
		if (null!=src&&src.exists()) {
			if (src.isFile()) {
				len+=src.length();
			}else {
				for(File s:src.listFiles()) {
					count(s);
				}
			}
		}
//		System.out.println(len);
	}
}
