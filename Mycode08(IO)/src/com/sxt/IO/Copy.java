package com.sxt.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * �ļ��ֽ����������ʵ���ļ�����
 * @author Administrator
 *
 */
public class Copy {

	public static void main(String[] args) {

		Copy("C://1//1.txt", "C://1//111.txt");
	}
	
	public static void Copy(String srcPath,String destPath) {
		//����Դ
		File src = new File(srcPath);				//Դͷ
		File dest = new File(destPath);			//Ŀ�ĵ�
		//ѡ����
		
		try (BufferedReader reader = new BufferedReader(new FileReader(src));
				BufferedWriter writer  = new BufferedWriter(new FileWriter(dest));){
			
			//����
			String line = null;
			while ((line=reader.readLine())!=null) {
				writer.append(line);
				writer.newLine();
			}
			writer.flush();
			System.out.println("�����ɹ�");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

//TODO 176