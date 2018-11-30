package com.sxt.IO2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * �ļ��ֽ����������ʵ���ļ�����
 * @author Administrator
 *
 */
public class BufferedCopy01 {

	public static void main(String[] args) {

		Copy("C://1//1.txt", "C://1//111.txt");
	}
	
	public static void Copy(String srcPath,String destPath) {
		//����Դ
		File src = new File(srcPath);				//Դͷ
		File dest = new File(destPath);			//Ŀ�ĵ�
		//ѡ����
		
		try (InputStream iStream = new FileInputStream(src);
				OutputStream oStream  = new FileOutputStream(dest);){
			
			//����
			byte[] flush = new byte[1024];
			int len = -1;
			while ((len=iStream.read(flush))!=-1) {
				oStream.write(flush, 0, flush.length);
			}
			oStream.flush();
			System.out.println("�����ɹ�");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

//TODO 176