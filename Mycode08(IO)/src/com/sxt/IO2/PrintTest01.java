package com.sxt.IO2;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintTest01 {
	public static void main(String[] args) throws FileNotFoundException {
		PrintStream ps = System.out;
		ps.print(false);
		ps.print("��ӡ��");
		
		ps = new PrintStream(new BufferedOutputStream(new FileOutputStream("print.txt")),true);
		ps.print(false);
		ps.print("��ӡ��");
		ps.close();
		
		//�ض��������
		System.setOut(ps);
		System.out.println("change");
		//�ض���ؿ���̨
		System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(FileDescriptor.out)),true));
		System.out.println("i am backing....");
		
		
	
		
		
	}
}