package com.sxt.IO2;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * �ļ��ֽ�������
 * @author Administrator
 *
 */
public class BufferedTest01 {

	public static void main(String[] args) {
		//����Դ
		File src = new File("C:\\1\\1.txt");
		//ѡ����
		InputStream iStream = null;
		try {
			iStream = new BufferedInputStream(new FileInputStream(src)) ;
			//����
			byte[] flush = new byte[3];				//��������
			int len =-1;										//���ճ��ȣ���Ϊ-1��
			while ((len=iStream.read(flush))!=-1) {
				//�ֽ�����-->�ַ�������
				String str = new String(flush, 0, len);
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (iStream!=null) {
				try {
					iStream.close();				//�ͷ���Դ
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
