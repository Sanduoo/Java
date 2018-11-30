package com.sxt.IO2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;

/**
 * 转换流：InputStreamReader  OutputStreamWriter
 * 1、以字符流的形式操作字节流（纯文本）
 * 2、指定字符集
 * 
 * @author SanDuo
 *
 */
public class ConvertTest01 {
	public static void main(String[] args) {
		//操作网络流			下载百度的源代码
		try ( BufferedReader reader =
				new BufferedReader(
						new InputStreamReader(
								new URL("http://www.baidu.com").openStream(),"UTF-8"));			//打开网络字节流
				BufferedWriter writer =
						new BufferedWriter(
								new OutputStreamWriter(
										new FileOutputStream("baidu.html"),"UTF-8"));
			){
			String line =null;
			while ((line=reader.readLine())!=null) {
//				System.out.println(line);
				writer.write(line);				//字符集不统一
				writer.newLine();
				
			}
			writer.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void test2() {
		//操作网络流			下载百度的源代码
		try ( InputStreamReader is =
				new InputStreamReader( new URL("http://www.baidu.com").openStream(),"UTF-8");			//打开网络字节流
				){
			int temp;
			while ((temp=is.read())!=-1) {
				System.out.print((char)temp);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void test() {
		//操作网络流			下载百度的源代码
		try ( InputStream is = new URL("http://www.baidu.com").openStream();			//打开网络字节流
				){
			int temp;
			while ((temp=is.read())!=-1) {
				System.out.print((char)temp);				//出现乱码原因：字=字节数不够出现乱码
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}


//TODO:  184
