package cn.sxt.IO.byteIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 1、递归查找子孙级文件|文件夹
 * 2、文件-直接复制copyFile ；文件夹-直接创建mkdirs（）
 * @author Administrator
 *
 */
public class CopyDir {
      /**
       * 
       * @param args
       */
	public static void main(String[] args)  {
		String srcPath = "c:/WeChat Files/a";				//源目录
		String destPath = "c:/WeChat Files/b";	         //目标目录
        
  		try {
			FileUtil.copyDir(srcPath, destPath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void copyDir(String srcPath,String destPath) {
		File src = new File(srcPath);
		File dest = new File(destPath);		
		copyDir(src, dest);
	}
	
	/**
	 * 拷贝文件夹
	 * @param src	源File对象
	 * @param dest 目标File对象
	 */
	public static void copyDir(File src,File dest) {

		if (src.isDirectory()) {				//判断是否为文件夹
			dest= new File(dest,src.getName());				//构建文件夹对象
		}else if (src.isFile()) {
			copyDirDetail(src,dest);
		}
	}
	
	/**
	 * 拷贝文件夹细节
	 * @param src
	 * @param dest
	 */
	public static void copyDirDetail(File src,File dest) {
		
		if (src.isFile()) {				//判断src是否为文件
			try {
				FileUtil.copyFile(src, dest);
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else if (src.isDirectory()) {
			dest.mkdirs();				//构建文件夹
			//获取下一级目录|文件
			for(File sub:src.listFiles()) {
				copyDirDetail(sub, new File(dest, src.getName()));
			}
		}
	}
	
}
