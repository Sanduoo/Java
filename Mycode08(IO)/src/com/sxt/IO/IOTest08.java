package com.sxt.IO;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 *ByteArrayOutputStream
 *�ֽ���������� 
 *�ĸ����裺
 *1������Դ			�ڲ�ά��
 *2��ѡ����			������Դ
 *3������				д������
 *4���ͷ���Դ		���Բ��ã���GC�������ջ���
 *
 * @author SanDuo
 *
 */

public class IOTest08 {
	
	public static void main(String[] args) {
		//����Դ
		byte[] dest = null;
		//ѡ����
		ByteArrayOutputStream oStream = null;
		oStream = new ByteArrayOutputStream();
		//����(д��)
		String msg = "show me the code";
		byte [] flush = msg.getBytes();
		oStream.write(flush, 0, flush.length);
		try {
			oStream.flush();
			dest=oStream.toByteArray();
			System.out.println(dest.length+"-->"+new String(dest,0,dest.length));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
