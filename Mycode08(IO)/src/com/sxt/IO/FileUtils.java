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
		
//		�ļ����ļ�
		try {
			InputStream iStream = new FileInputStream("c://1//1.txt");
			OutputStream oStream = new FileOutputStream("c://1//1-copy.txt");
			copy(iStream, oStream);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		�ļ����ֽ�����
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
		
//		�ֽ����鵽�ļ�
		
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
	 * �Խ����������
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
			System.out.println("�����ɹ�");
			oStream.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(iStream, oStream);
		}
	}
	
	/**
	 * �ͷ���Դ
	 * ָ����
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
	 * �ͷ���Դ
	 * ��ָ����
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
