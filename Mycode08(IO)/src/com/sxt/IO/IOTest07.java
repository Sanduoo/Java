package com.sxt.IO;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *ByteArrayInputStream
 *�ֽ����������� 
 *�ĸ����裺
 *1������Դ			�ֽ����鲻Ҫ̫��
 *2��ѡ����
 *3������
 *4���ͷ���Դ		���Բ��ã���GC�������ջ���
 *
 * @author SanDuo
 *
 */
public class IOTest07 {
	public static void main(String[] args) {
		//����Դ
		byte[] src = "Talk is cheap,show me the code.".getBytes();
		//ѡ����
		InputStream iStream = null;
		//����
		iStream = new ByteArrayInputStream(src);
		byte[ ] flush = new byte[4];
		int len = -1;
		try {
			while ((len=iStream.read(flush))!=-1) {
				String str = new String(flush, 0, len);
				System.out.println(str);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//�ͷ���Դ
	}
	
}