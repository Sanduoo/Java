package cn.sxt.IO.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.imageio.stream.FileImageInputStream;

/**
 * 一、读取文件
 * 1、建立联系-file对象
 * 2、选择流-文件输入流InputStream、FileInputStream
 * 3、操作-byte[] car =new byte[1024];+read+读取大小
 * 				输出
 * 4、释放资源：关闭 
 * @author Administrator
 *
 */
public class ReadWriteFile {

	public static void main(String[] args) {
		//建立联系-file对象
		File src = new File("c:/WeChat Files/1.txt");
		//选择流-文件输入流InputStream、FileInputStream
		try {
			InputStream is = new FileInputStream(src);						//170-03.36
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
