package com.sxt.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * �ļ��ֽ������
 * @author Administrator
 *
 */
public class IOTest04 {

	public static void main(String[] args) {
		//����Դ
		File src = new File("C:/WeChat Files/dest.txt");		//�����ڿ��Դ���
		//ѡ����
		OutputStream oStream =null;
		try {
			oStream = new FileOutputStream(src,true);
			//����
			String msg = "SanDuo is a good boy";
			byte[] flush= msg.getBytes();						//���ַ������ֽ���ʽ���뻺���ֽ�������
			oStream.write(flush, 0, flush.length);			//�������ֽ�����д���ļ���
			oStream.flush();										//д����ɺ�ˢ�£��ͷ��ڴ�ռ�
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//�ͷ���Դ
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
//TODO 175