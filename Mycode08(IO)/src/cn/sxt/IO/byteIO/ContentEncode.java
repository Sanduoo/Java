package cn.sxt.IO.byteIO;

import java.io.UnsupportedEncodingException;

/**
 * 编码：字符串-->字节
 * @author Administrator
 *
 */
public class ContentEncode {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String msg = "富强民主文明和谐";
		String a = "一";
		//编码：字节数组
//		byte[ ] dates = msg.getBytes("UTF-8");
		byte[ ] dates = msg.getBytes();
		System.out.println("UTF-8编码长度:"+a.getBytes("UTF-8").length);
		System.out.println("GBK编码长度:"+a.getBytes("GBK").length);
		System.out.println("GB2312编码长度:"+a.getBytes("GB2312").length);
		System.out.println("默认为GBK字符集"+dates.length);
		
		//编码：其他字符集
//		System.out.println("UTF-8编码长度"+a.getBytes(UTF-8));
	}
}
