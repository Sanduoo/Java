package cn.sxt.IO.byteIO;

import java.io.File;

public class DirDemo01 {

	public static void main(String[] args) {
		File dir = new File("c:/WeChat Files");
		
		//下级名称list
		String[] subNames = dir.list();
		for(String s:subNames) {
			System.out.println("下级名称"+s);
		}
		
		//下级对象（文件和文件夹）
		File[] subFile = dir.listFiles();
		for(File s:subFile) {
			System.out.println("下级对象"+s);
		}
		
		//所有盘符
		File[] subRoot = dir.listRoots();
		for(File s:subRoot) {
			System.out.println("所有盘符"+s);
		}
		
	}
}
