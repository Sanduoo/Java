package cn.sxt.IO.byteIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * �����ļ�
 * 1��������ϵ-File����-Դͷ-Ŀ�ĵ�
 * 2��ѡ����
 * 					�ļ�������-InputStream  FileInputStream
 * 					�ļ������-OutputStream  FileOutputStream
 * 3������-����
 * 					byte[] flush = new byte[1024];
 * 					int len = 0;
 * 					while(-1!=(len=������.read(flush))��
 * 						�����.write(flush,0,len);
 * 					��
 * 					�����.flush;
 * 4���ͷ���Դ-�ر�����Դ
 * @author Administrator
 *
 */
public class CopyFileDemo01 {

	public static void main(String[] args) throws IOException {
		
		//1��������ϵ
		File src = new File("c:/WeChat Files/test.txt");				//�ļ��������
		File dest = new File("c:/WeChat Files/test2.txt");			//�������򴴽�
		
		//2��ѡ����
		InputStream iStream = new FileInputStream(src);			//������
		OutputStream oStream = new FileOutputStream(dest);//�����
		
		//3������
		byte[] flush = new byte[1024];
		int len = 0;
		while (-1!=(len=iStream.read(flush))) {				//��ȡ
			oStream.write(flush, 0, len);				//��0λ��ʼ
		}
		if (-1==(len=iStream.read(flush))) {				
			System.out.println("�ļ�������");
		}
		oStream.flush();			//���ֽ���д��oStream��
		
		//4���ͷ���Դ-�ر������ȿ���أ�
		iStream.close();
		oStream.close();
	}
}
