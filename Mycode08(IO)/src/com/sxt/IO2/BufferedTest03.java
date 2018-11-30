package com.sxt.IO2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * FileReader处理字符文件
 * 字符流
 * @author q
 *
 */
public class BufferedTest03 {

	public static void main(String[] args) {
		//创建源
		File src = new File("C://1//src.txt");
		//选择流
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(src)) ;
			//操作
			String line;
			while ((line=reader.readLine())!=null) {
				//字符数组-->字符串
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
					reader.close();				//释放资源
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
}
