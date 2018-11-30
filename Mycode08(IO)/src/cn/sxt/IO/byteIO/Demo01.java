package cn.sxt.IO.byteIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * ��ȡ�ļ�
 * 1��������ϵ-File����-Դͷ
 * 2��ѡ����-�ļ�������-InputStream  FileInputStream
 * 3������-byte [ ] car = new byte[1024]; +read+��ȡ��С
 * 			���
 * 4���ͷ���Դ-�ر�
 * @author Administrator
 *
 */
public class Demo01 {

	public static void main(String[] args) {
//		 1��������ϵ-File����
		File src = new File("c:/WeChat Files/11.txt");
//		 2��ѡ����-�ļ�������-InputStream  FileInputStream
		InputStream iStream = null;				//����������
		try {
			iStream = new FileInputStream(src);
//			3������-byte [ ] car = new byte[1024]; +read+��ȡ��С
			byte[] car = new byte[100];
			int len = 0;				//����ʵ�ʶ�ȡ��С
			//ѭ����ȡ
			try {
				while (-1!=(len=iStream.read(car))) {
					//���  �ֽ�����ת���ַ���
					String info = new String(car,0,len);
					System.out.println(info);
				}
			} catch (IOException e) {
				System.out.println("��ȡ�ļ�ʧ��");
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println("�ļ�������");
			e.printStackTrace();
		}finally {
			//4���ͷ���Դ-�Ͽ�����
			if (null!=iStream) {
				try {
					iStream.close();
				} catch (IOException e) {
					System.out.println("�ر��ļ������ʧ��");
					e.printStackTrace();
				}
			}
		}
		
	}
}
