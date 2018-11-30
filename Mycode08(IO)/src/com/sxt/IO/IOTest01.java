package com.sxt.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 第一个程序：理解操作步骤
 * 1、创建源
 * 2、选择流
 * 3、操作
 * 4、释放资源
 * @author Administrator
 *
 */
public class IOTest01 {

	public static void main(String[] args) {
		//创建源
		File src = new File("C:\\WeChat Files\\IOTest.txt");
		//选择流
		try {
			InputStream iStream = new FileInputStream(src);
			//操作
			int date1 = iStream.read();			//第一个数据h
			int date2 = iStream.read();			//第一个数据e
			int date3 = iStream.read();			//第一个数据l
			int date4 = iStream.read();			//第一个数据l
			int date5 = iStream.read();			//第一个数据0
			int date6 = iStream.read();			//文件结尾默认
			
			System.out.print((char)date1);
			System.out.print((char)date2);
			System.out.print((char)date3);
			System.out.print((char)date4);
			System.out.print((char)date5);
			System.out.print((char)date6);
			
			//释放资源
			iStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
