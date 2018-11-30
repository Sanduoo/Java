package com.sxt.IO2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * ��������
 * 1����д�����ȡ
 * 2����ȡ��˳����д������һ��
 * 
 * DataOutputStream
 * DataInputStream
 * @author SanDuo
 *
 */
public class DataTest {
	public static void main(String[] args) {
		//д��
		ByteArrayOutputStream boStream = new ByteArrayOutputStream();
		DataOutputStream doStream = new DataOutputStream(new BufferedOutputStream(boStream));
		//������������+����
		try {
			doStream.writeUTF("���Ϻ�");
			doStream.writeInt(18);
			doStream.writeBoolean(false);
			doStream.writeChar('a');
			doStream.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte[ ] datas = boStream.toByteArray();
		
		//��ȡ
		DataInputStream diStream = new DataInputStream(new BufferedInputStream(new ByteArrayInputStream(datas)));
		
		//˳����д��һ��
		try {
			String msg = diStream.readUTF();
			int age = diStream.readInt();
			boolean flag = diStream.readBoolean();
			char ch = diStream.readChar();
			System.out.println(msg+age+flag+ch);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}