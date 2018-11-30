package com.sxt.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * FileReader�����ַ��ļ�
 * �ַ���
 * @author q
 *
 */
public class IOTest05 {

	public static void main(String[] args) {
		//����Դ
		File src = new File("C://1//src.txt");
		//ѡ����
		Reader reader = null;
		try {
			reader = new FileReader(src);
			//����
			char[] flush = new char[1024];				//��������
			int len =-1;										//���ճ��ȣ���Ϊ-1��
			while ((len=reader.read(flush))!=-1) {
				//�ַ�����-->�ַ���
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
			if (reader!=null) {
				try {
					reader.close();				//�ͷ���Դ
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
}