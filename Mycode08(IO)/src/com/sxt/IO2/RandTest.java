package com.sxt.IO2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 随机读取和写入流 RandomAccessFile
 * @author SanDuo
 *
 */
public class RandTest {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile(new File("c:/1/1.text"),"r");
		int beginPos = 2;
		int actualSize = 1026;
		raf.seek(beginPos);
		//操作分段读取
		byte[ ] flush = new byte[1024];
		int len = -1;
		while ((len=raf.read(flush))!=-1) {
			if (actualSize>len) {
				System.out.println( new String(flush,0,len));
				actualSize-=len;
			}else {
				System.out.println(new String(flush,0,actualSize));
				break;
			}
		}
	}
	public static void Test2(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile(new File("c:/1/1.text"),"r");
		int beginPos = 2+1026;
		int actualSize = 1026;
		raf.seek(beginPos);
		//操作分段读取
		byte[ ] flush = new byte[1024];
		int len = -1;
		while ((len=raf.read(flush))!=-1) {
			if (actualSize>len) {
				System.out.println( new String(flush,0,len));
				actualSize-=len;
			}else {
				System.out.println(new String(flush,0,actualSize));
				break;
			}
		}
	}
	public static void Test() throws IOException {
		RandomAccessFile raf = new RandomAccessFile(new File("c:/1/1.text"),"r");
		//随机读取
		raf.seek(0);
		//读取
		
		//操作分段读取
		byte[ ] flush = new byte[1024];
		int len = -1;
		while ((len=raf.read(flush))!=-1) {
			System.out.println(new String(flush,0,len));
		}
		
		
		raf.close();
	}
}
