package com.sxt.IO2;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 文件字节输入流
 * @author Administrator
 *
 */
public class BufferedTest01 {

	public static void main(String[] args) {
		//创建源
		File src = new File("C:\\1\\1.txt");
		//选择流
		InputStream iStream = null;
		try {
			iStream = new BufferedInputStream(new FileInputStream(src)) ;
			//操作
			byte[] flush = new byte[3];				//缓冲容器
			int len =-1;										//接收长度（空为-1）
			while ((len=iStream.read(flush))!=-1) {
				//字节数组-->字符串解码
				String str = new String(flush, 0, len);
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (iStream!=null) {
				try {
					iStream.close();				//释放资源
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
