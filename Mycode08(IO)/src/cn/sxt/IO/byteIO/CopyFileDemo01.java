package cn.sxt.IO.byteIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 拷贝文件
 * 1、建立联系-File对象-源头-目的地
 * 2、选择流
 * 					文件输入流-InputStream  FileInputStream
 * 					文件输出流-OutputStream  FileOutputStream
 * 3、操作-拷贝
 * 					byte[] flush = new byte[1024];
 * 					int len = 0;
 * 					while(-1!=(len=输入流.read(flush))｛
 * 						输出流.write(flush,0,len);
 * 					｝
 * 					输出流.flush;
 * 4、释放资源-关闭两个源
 * @author Administrator
 *
 */
public class CopyFileDemo01 {

	public static void main(String[] args) throws IOException {
		
		//1、建立联系
		File src = new File("c:/WeChat Files/test.txt");				//文件必须存在
		File dest = new File("c:/WeChat Files/test2.txt");			//不存在则创建
		
		//2、选择流
		InputStream iStream = new FileInputStream(src);			//输入流
		OutputStream oStream = new FileOutputStream(dest);//输出流
		
		//3、拷贝
		byte[] flush = new byte[1024];
		int len = 0;
		while (-1!=(len=iStream.read(flush))) {				//读取
			oStream.write(flush, 0, len);				//从0位开始
		}
		if (-1==(len=iStream.read(flush))) {				
			System.out.println("文件无内容");
		}
		oStream.flush();			//将字节流写入oStream流
		
		//4、释放资源-关闭流（先开后关）
		iStream.close();
		oStream.close();
	}
}
