package com.sxt.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


/**
 * 1、递归查找子孙级文件|文件夹
 * 2、文件-直接复制copyFile ；文件夹-直接创建mkdirs（）
 * @author Administrator
 *
 */
public class Test01 {
      /**
       * 
       * @param args
       */
	public static void main(String[] args)  {
		
		File src = new File("c:/WeChat Files/a");
		File dest = new File("c:/WeChat Files/b");
	
		if (src.isDirectory()) {				//判断是否为文件夹
			System.out.println("是文件夹");
			dest= new File(dest,src.getName());				//构建文件夹对象
			copyDirDetail(src, dest);
		}else if (src.isFile()) {
			System.out.println("是文件");
			copyDirDetail(src,dest);
		}
	}
	
	
	public static void copyDirDetail(File src,File dest) {
		
		if (src.isFile()) {				//判断src是否为文件
			copyFile(src, dest);
//			copyDirDetail(src, dest);
		}else if (src.isDirectory()) {
			copyDir(src, dest);
		}
	}
	
	public static void copyDir(File src,File dest) {
		dest.mkdirs();				//构建文件夹
		//获取下一级目录|文件
		for(File sub:src.listFiles()) {
			copyDirDetail(sub, new File(dest, src.getName()));
		}
		System.out.println("文件夹拷贝成功");
	}
	public  static void copyFile(File src,File dest) {
		
		InputStream iStream = null;
		OutputStream oStream = null;
		try {
			iStream = new FileInputStream(src);
			oStream = new FileOutputStream(dest);
			byte[] flush = new byte [1024];
			int len = -1;
			while ((len=iStream.read(flush))!=-1) {
				oStream.write(flush, 0, len);
			}
			System.out.println("文件拷贝成功");
			oStream.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (null!=oStream) {
				try {
					oStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (null!=iStream) {
				try {
					iStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
}
