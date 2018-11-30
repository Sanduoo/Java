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
public class IOTest02 {

	public static void main(String[] args) {
		//����Դ
		File src = new File("C:\\WeChat Files\\IOTest.txt");
		InputStream iStream = null;				//���������򣬱���iStream.close()����
		//ѡ����
		try {
			iStream = new FileInputStream(src);
			//����
			int temp;
			while ((temp=iStream.read())!=-1) {
				System.out.println((char)temp);
			}
			//�ͷ���Դ
			iStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (null!=iStream) {				//����������ɹ����ùر�
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
