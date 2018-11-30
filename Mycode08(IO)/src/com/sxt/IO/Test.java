package com.sxt.IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

/**
 * 
 * @author q
 *
 */
public class Test {

	public static void main(String[] args) {
		byte [ ] dates =fileToByteArray("c://1//1.png");
		System.out.println(dates.length);
		byteArrayToFile(dates,"c://1//3.png");
		 
	}
	
	/*
	 * 图片-->程序				InputStream
	 * 程序-->字节数组		ByteOutputStream
	 * 
	 */
	public static byte[ ] fileToByteArray(String filePath) {
//		创建源
		File src = new File(filePath);
		
		InputStream iStream = null;
		ByteArrayOutputStream boStream = null;
		try {
			iStream = new FileInputStream(src);
			boStream = new ByteArrayOutputStream();
			byte[ ] flush = new byte[1024];
			int len = -1;
			while ((len=iStream.read(flush))!=-1) {
				boStream.write(flush, 0, len);
			}
			boStream.flush();
			return boStream.toByteArray();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (null!=iStream) {
				try {
					iStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return null;
		
				
	}
	
	/*
	 * 字节数组-->程序  ByteArrayInpuyStream
	 * 程序-->文件			OutputStream
	 * 
	 */
	public static void byteArrayToFile(byte[ ] src,String filePath) {
//		File dest = null;
		File dest = new File(filePath);
		ByteArrayInputStream biStream = null;
		OutputStream oStream = null;
		biStream = new ByteArrayInputStream(src);
		try {
			oStream = new FileOutputStream(dest);
			byte[ ] flush = new byte[1024];
			int len = -1;
			while ((len=biStream.read(flush))!=-1) {
				oStream.write(flush, 0, len);
			}
			System.out.println("拷贝成功");
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
		}
		
		
				
		
		
	}
}
