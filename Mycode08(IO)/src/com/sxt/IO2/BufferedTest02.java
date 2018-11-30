package com.sxt.IO2;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 文件字节输出流
 * @author Administrator
 *
 */
public class BufferedTest02 {

	public static void main(String[] args) {
		//创建源
		File src = new File("C:/1/dest.txt");		//不存在可以创建
		//选择流
		OutputStream oStream =null;
		try {
			oStream = new BufferedOutputStream(new FileOutputStream(src,true)) ;
			//操作
			String msg = "SanDuo is a good boy";
			byte[] flush= msg.getBytes();						//将字符串以字节形式存入缓存字节数组中
			oStream.write(flush, 0, flush.length);			//将缓冲字节数组写入文件中
			oStream.flush();										//写入完成后刷新，释放内存空间
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//释放资源
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