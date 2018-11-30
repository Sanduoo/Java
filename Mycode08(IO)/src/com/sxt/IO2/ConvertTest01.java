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
 * ת������InputStreamReader  OutputStreamWriter
 * 1�����ַ�������ʽ�����ֽ��������ı���
 * 2��ָ���ַ���
 * 
 * @author SanDuo
 *
 */
public class ConvertTest01 {
	public static void main(String[] args) {
		//����������			���ذٶȵ�Դ����
		try ( BufferedReader reader =
				new BufferedReader(
						new InputStreamReader(
								new URL("http://www.baidu.com").openStream(),"UTF-8"));			//�������ֽ���
				BufferedWriter writer =
						new BufferedWriter(
								new OutputStreamWriter(
										new FileOutputStream("baidu.html"),"UTF-8"));
			){
			String line =null;
			while ((line=reader.readLine())!=null) {
//				System.out.println(line);
				writer.write(line);				//�ַ�����ͳһ
				writer.newLine();
				
			}
			writer.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void test2() {
		//����������			���ذٶȵ�Դ����
		try ( InputStreamReader is =
				new InputStreamReader( new URL("http://www.baidu.com").openStream(),"UTF-8");			//�������ֽ���
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
		//����������			���ذٶȵ�Դ����
		try ( InputStream is = new URL("http://www.baidu.com").openStream();			//�������ֽ���
				){
			int temp;
			while ((temp=is.read())!=-1) {
				System.out.print((char)temp);				//��������ԭ����=�ֽ���������������
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}


//TODO:  184
