package com.sxt.IO2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * FileWriter�����ַ��ļ�
 * @author q
 *
 */
public class BufferedTest04 {
	public static void main(String[] args) {
		//����Դ
		File src = new File("C://1//dest.txt");		//�����ڿ��Դ���
		//ѡ����
		BufferedWriter writer =null;
		try {
			writer = new BufferedWriter(new FileWriter(src)) ;
			
			//����
			/**
			 д��һ
			String msg = "SanDuo is a good boy";
			char[] flush= msg.toCharArray();				//���ַ������ַ�������ʽ���뻺���ֽ�������
			writer.write(flush, 0, flush.length);				//�������ַ�����д���ļ���
			writer.flush();												//д����ɺ�ˢ�£��ͷ��ڴ�ռ�
			**/
			
			/**
			 д����
			String msg = "SanDuo is a good boy";
			writer.writer(msg);
			writer.writer("add");
			writer.flush();												//д����ɺ�ˢ�£��ͷ��ڴ�ռ�
			**/
			
			//д����
			writer.append("SanDuo is a good boy");
			writer.newLine();
			writer.append("You are right");
			System.out.println("д��ɹ�");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//�ͷ���Դ
			if (null!=writer) {
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}