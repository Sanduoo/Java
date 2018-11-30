package com.sxt.IO;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *ByteArrayInputStream
 *字节数组输入流 
 *四个步骤：
 *1、创建源			字节数组不要太大
 *2、选择流
 *3、操作
 *4、释放资源		可以不用，有GC垃圾回收机制
 *
 * @author SanDuo
 *
 */
public class IOTest07 {
	public static void main(String[] args) {
		//创建源
		byte[] src = "Talk is cheap,show me the code.".getBytes();
		//选择流
		InputStream iStream = null;
		//操作
		iStream = new ByteArrayInputStream(src);
		byte[ ] flush = new byte[4];
		int len = -1;
		try {
			while ((len=iStream.read(flush))!=-1) {
				String str = new String(flush, 0, len);
				System.out.println(str);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//释放资源
	}
	
}
