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
		ps.print("打印流");
		
		ps = new PrintStream(new BufferedOutputStream(new FileOutputStream("print.txt")),true);
		ps.print(false);
		ps.print("打印流");
		ps.close();
		
		//重定向输出端
		System.setOut(ps);
		System.out.println("change");
		//重定向回控制台
		System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(FileDescriptor.out)),true));
		System.out.println("i am backing....");
		
		
	
		
		
	}
}
