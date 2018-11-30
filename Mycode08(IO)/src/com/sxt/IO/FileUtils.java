package com.sxt.IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileUtils {
	public static void main(String[] args) {
		
//		文件到文件
		try {
			InputStream iStream = new FileInputStream("c://1//1.txt");
			OutputStream oStream = new FileOutputStream("c://1//1-copy.txt");
			copy(iStream, oStream);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		文件到字节数组
		byte[] datas = null;
		try {
			InputStream iStream = new FileInputStream("c://1//1.txt");
			ByteArrayOutputStream oStream = new ByteArrayOutputStream();
			copy(iStream, oStream);
			datas = oStream.toByteArray();
			System.out.println(datas.length);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		字节数组到文件
		
		try {
			ByteArrayInputStream iStream = new ByteArrayInputStream(datas);
			OutputStream oStream = new FileOutputStream("c://1//1-copy.png");
			copy(iStream, oStream);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 对接输入输出流
	 * @param iStream
	 * @param oStream
	 */
	public static void copy(InputStream iStream,OutputStream oStream) {
		byte[ ] flush = new byte [1024];
		int len = -1;
		try {
			while ((len=iStream.read(flush))!=-1) {
				oStream.write(flush, 0, len);
			}
			System.out.println("拷贝成功");
			oStream.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(iStream, oStream);
		}
	}
	
	/**
	 * 释放资源
	 * 指定流
	 * @param iStream
	 * @param oStream
	 */
	public static void close(InputStream iStream,OutputStream oStream) {
		try {
			if (null!=oStream) {
				oStream.close();
			}
			if (null!=iStream) {
				iStream.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 释放资源
	 * 不指定流
	 * @param ios
	 */
	public static void close(Closeable... ios) {
		for(Closeable io:ios) {
			try {
				if (null!=io) {
					io.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
