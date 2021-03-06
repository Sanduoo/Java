package com.sxt.IO2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * 数据流：
 * 1、先写出后读取
 * 2、读取的顺序与写出保持一致
 * 
 * DataOutputStream
 * DataInputStream
 * @author SanDuo
 *
 */
public class DataTest {
	public static void main(String[] args) {
		//写出
		ByteArrayOutputStream boStream = new ByteArrayOutputStream();
		DataOutputStream doStream = new DataOutputStream(new BufferedOutputStream(boStream));
		//操作数据类型+数组
		try {
			doStream.writeUTF("早上好");
			doStream.writeInt(18);
			doStream.writeBoolean(false);
			doStream.writeChar('a');
			doStream.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte[ ] datas = boStream.toByteArray();
		
		//读取
		DataInputStream diStream = new DataInputStream(new BufferedInputStream(new ByteArrayInputStream(datas)));
		
		//顺序与写出一致
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
