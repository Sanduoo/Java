package com.sxt.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * ��һ����������������
 * 1������Դ
 * 2��ѡ����
 * 3������
 * 4���ͷ���Դ
 * @author Administrator
 *
 */
public class IOTest01 {

	public static void main(String[] args) {
		//����Դ
		File src = new File("C:\\WeChat Files\\IOTest.txt");
		//ѡ����
		try {
			InputStream iStream = new FileInputStream(src);
			//����
			int date1 = iStream.read();			//��һ������h
			int date2 = iStream.read();			//��һ������e
			int date3 = iStream.read();			//��һ������l
			int date4 = iStream.read();			//��һ������l
			int date5 = iStream.read();			//��һ������0
			int date6 = iStream.read();			//�ļ���βĬ��
			
			System.out.print((char)date1);
			System.out.print((char)date2);
			System.out.print((char)date3);
			System.out.print((char)date4);
			System.out.print((char)date5);
			System.out.print((char)date6);
			
			//�ͷ���Դ
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
