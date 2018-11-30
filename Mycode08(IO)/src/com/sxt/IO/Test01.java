package com.sxt.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


/**
 * 1���ݹ�������Ｖ�ļ�|�ļ���
 * 2���ļ�-ֱ�Ӹ���copyFile ���ļ���-ֱ�Ӵ���mkdirs����
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
	
		if (src.isDirectory()) {				//�ж��Ƿ�Ϊ�ļ���
			System.out.println("���ļ���");
			dest= new File(dest,src.getName());				//�����ļ��ж���
			copyDirDetail(src, dest);
		}else if (src.isFile()) {
			System.out.println("���ļ�");
			copyDirDetail(src,dest);
		}
	}
	
	
	public static void copyDirDetail(File src,File dest) {
		
		if (src.isFile()) {				//�ж�src�Ƿ�Ϊ�ļ�
			copyFile(src, dest);
//			copyDirDetail(src, dest);
		}else if (src.isDirectory()) {
			copyDir(src, dest);
		}
	}
	
	public static void copyDir(File src,File dest) {
		dest.mkdirs();				//�����ļ���
		//��ȡ��һ��Ŀ¼|�ļ�
		for(File sub:src.listFiles()) {
			copyDirDetail(sub, new File(dest, src.getName()));
		}
		System.out.println("�ļ��п����ɹ�");
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
			System.out.println("�ļ������ɹ�");
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