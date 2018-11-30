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
public class IOTest02 {

	public static void main(String[] args) {
		//创建源
		File src = new File("C:\\WeChat Files\\IOTest.txt");
		InputStream iStream = null;				//提升作用域，便于iStream.close()调用
		//选择流
		try {
			iStream = new FileInputStream(src);
			//操作
			int temp;
			while ((temp=iStream.read())!=-1) {
				System.out.println((char)temp);
			}
			//释放资源
			iStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (null!=iStream) {				//如果不创建成功则不用关闭
					iStream.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//174
		
		
	}
}
