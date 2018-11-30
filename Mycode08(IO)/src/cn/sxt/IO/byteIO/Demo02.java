package cn.sxt.IO.byteIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 写出文件
 * 1、建立联系-File对象-目的地
 * 2、选择流-文件输出流-OutputStream  FileOutputStream
 * 3、操作-write+flush
 * 4、释放资源-关闭
 * @author Administrator
 *
 */
public class Demo02 {

	public static void main(String[] args) {
		//1、建立联系-File对象-目的地
		File dest = new File("c:/WeChat Files/test.txt");
		//2、选择流-文件输入流-OutputStream  FileOutputStream
		OutputStream oStream= null;
		try {
			
			oStream = new FileOutputStream(dest,true);		//以追加形式写出文件（true追加，false覆盖）
			//3、操作-write+flush
			String str = "Sanduoo is good boy \r\n";
			//字符串转字节数组
			byte[ ] data = str.getBytes();
			oStream.write(data,0,data.length);
			oStream.flush(); 			//强制刷新出去（手动Flush 好习惯！）
			
		} catch (FileNotFoundException e) {
			System.out.println("文件未找到");
			e.printStackTrace();
		}
		catch (IOException e) {
			System.out.println("文件写出失败");
			e.printStackTrace();
		}finally {
			//4、释放资源-关闭
			if (null!=oStream) {
				try {
					oStream.close();
				} catch (IOException e) {
					System.out.println("关闭输出流失败");
					e.printStackTrace();
				}
			}
		}
	}
}
