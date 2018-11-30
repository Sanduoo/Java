package cn.sxt.IO.byteIO;

import java.io.UnsupportedEncodingException;

/**
 * 解码：字节-->字符串
 * @author Administrator
 *
 */
public class ContentDecode {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String msg = "富强民主文明和谐China";
		//编码：字节数组
		byte[ ] dates = msg.getBytes();
		System.out.println("默认为GBK字符集的长度"+dates.length);
		
		//解码：字符串String(byte[] bytes,int offset,int lenght,String charsetName)
		msg = new String(dates,0,dates.length,"GBK");
		System.out.println(msg);
		
		//乱码
		//1、字节数不够
		msg = new String(dates,0,dates.length-8,"GBK");
		System.out.println(msg);
		
		//2、字符集不统一
		msg = new String(dates,0,dates.length,"UTF8");
		System.out.println(msg);
		//172
	}
}
