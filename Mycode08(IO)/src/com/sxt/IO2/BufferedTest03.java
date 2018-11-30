package com.sxt.IO2;

import java.io.BufferedReader;
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
public class BufferedTest03 {

	public static void main(String[] args) {
		//����Դ
		File src = new File("C://1//src.txt");
		//ѡ����
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(src)) ;
			//����
			String line;
			while ((line=reader.readLine())!=null) {
				//�ַ�����-->�ַ���
				System.out.println(line);
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
