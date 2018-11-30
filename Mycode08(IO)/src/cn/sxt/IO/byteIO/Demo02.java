package cn.sxt.IO.byteIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * д���ļ�
 * 1��������ϵ-File����-Ŀ�ĵ�
 * 2��ѡ����-�ļ������-OutputStream  FileOutputStream
 * 3������-write+flush
 * 4���ͷ���Դ-�ر�
 * @author Administrator
 *
 */
public class Demo02 {

	public static void main(String[] args) {
		//1��������ϵ-File����-Ŀ�ĵ�
		File dest = new File("c:/WeChat Files/test.txt");
		//2��ѡ����-�ļ�������-OutputStream  FileOutputStream
		OutputStream oStream= null;
		try {
			
			oStream = new FileOutputStream(dest,true);		//��׷����ʽд���ļ���true׷�ӣ�false���ǣ�
			//3������-write+flush
			String str = "Sanduoo is good boy \r\n";
			//�ַ���ת�ֽ�����
			byte[ ] data = str.getBytes();
			oStream.write(data,0,data.length);
			oStream.flush(); 			//ǿ��ˢ�³�ȥ���ֶ�Flush ��ϰ�ߣ���
			
		} catch (FileNotFoundException e) {
			System.out.println("�ļ�δ�ҵ�");
			e.printStackTrace();
		}
		catch (IOException e) {
			System.out.println("�ļ�д��ʧ��");
			e.printStackTrace();
		}finally {
			//4���ͷ���Դ-�ر�
			if (null!=oStream) {
				try {
					oStream.close();
				} catch (IOException e) {
					System.out.println("�ر������ʧ��");
					e.printStackTrace();
				}
			}
		}
	}
}
