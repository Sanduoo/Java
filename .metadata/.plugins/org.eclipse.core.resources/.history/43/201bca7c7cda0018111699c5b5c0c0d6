package com.sxt.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * FileWriter处理字符文件
 * @author q
 *
 */
public class IOTest06 {
	public static void main(String[] args) {
		//创建源
		File src = new File("C://1//dest.txt");		//不存在可以创建
		//选择流
		Writer writer =null;
		try {
			writer = new FileWriter(src,false);
			
			//操作
			/**
			 写法一
			String msg = "SanDuo is a good boy";
			char[] flush= msg.toCharArray();				//将字符串以字符数组形式存入缓存字节数组中
			writer.write(flush, 0, flush.length);				//将缓冲字符数组写入文件中
			writer.flush();												//写入完成后刷新，释放内存空间
			**/
			
			/**
			 写法二
			String msg = "SanDuo is a good boy";
			writer.writer(msg);
			writer.writer("add");
			writer.flush();												//写入完成后刷新，释放内存空间
			**/
			
			//写法三
			writer.append("SanDuo is a good boy").append("You are right");
			System.out.println("写入成功");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//释放资源
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
