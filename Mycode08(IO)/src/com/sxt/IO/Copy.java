package com.sxt.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 文件字节输入输出流实现文件拷贝
 * @author Administrator
 *
 */
public class Copy {

	public static void main(String[] args) {

		Copy("C://1//1.txt", "C://1//111.txt");
	}
	
	public static void Copy(String srcPath,String destPath) {
		//创建源
		File src = new File(srcPath);				//源头
		File dest = new File(destPath);			//目的地
		//选择流
		
		try (BufferedReader reader = new BufferedReader(new FileReader(src));
				BufferedWriter writer  = new BufferedWriter(new FileWriter(dest));){
			
			//操作
			String line = null;
			while ((line=reader.readLine())!=null) {
				writer.append(line);
				writer.newLine();
			}
			writer.flush();
			System.out.println("拷贝成功");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

//TODO 176