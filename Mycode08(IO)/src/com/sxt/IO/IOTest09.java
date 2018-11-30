package com.sxt.IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOTest09 {
	public static void main(String[] args) {
		byte[] dates = fileToByteArray("C://1//1.png") ;
		System.out.println(dates.length);
		 byteArrayToFile(dates,"C://1//2.png");
	}
	
	/*
	 * 1��ͼƬ��ȡ������
	 * 		1��ͼƬ������		FileInputStream
	 * 		2�������ֽ�����		ByteOutputStream
	 */
	public static byte[] fileToByteArray(String filePath) {
		//����Դ
		File src = new File(filePath);
		//ѡ����
		InputStream iStream = null;
		ByteArrayOutputStream boStream = null;
		try {
			iStream = new FileInputStream(src);
			boStream = new ByteArrayOutputStream();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//����
		byte[] flush = new byte[1024];
		int len = -1;
		try {
			while ((len=iStream.read(flush))!=-1) {
				boStream.write(flush,0,len);				//д�뵽�ֽ�������
			}
			boStream.flush();
			return boStream.toByteArray();
		} catch (IOException e) {
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
	 * 1�������ȡ��ͼƬ
	 * 		1���ֽ����鵽����		ByteInputStream
	 * 		2������ͼƬ		FileOutputStream
	 */
	public static void byteArrayToFile(byte[ ] src,String filePath) {
		//����Դ
		File dest = new File(filePath);
		//ѡ����
		InputStream iStream = null;
		OutputStream oStream = null;
//		ByteArrayInputStream biStream = null; 
		try {
			oStream = new FileOutputStream(dest);
			iStream = new ByteArrayInputStream(src);
			//����
			byte[] flush = new byte[1024];
			int len = -1;
			while ((len=iStream.read(flush))!=-1) {
				oStream.write(flush, 0, len);				//д�����ļ�
				
			}
			System.out.println("�����ɹ�");
			oStream.flush();
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
//TODO 179