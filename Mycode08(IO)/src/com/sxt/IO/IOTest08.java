package com.sxt.IO;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 *ByteArrayOutputStream
 *字节数组输出流 
 *四个步骤：
 *1、创建源			内部维护
 *2、选择流			不关联源
 *3、操作				写出内容
 *4、释放资源		可以不用，有GC垃圾回收机制
 *
 * @author SanDuo
 *
 */

public class IOTest08 {
	
	public static void main(String[] args) {
		//创建源
		byte[] dest = null;
		//选择流
		ByteArrayOutputStream oStream = null;
		oStream = new ByteArrayOutputStream();
		//操作(写出)
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
