package cn.sxt.IO.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.imageio.stream.FileImageInputStream;

/**
 * һ����ȡ�ļ�
 * 1��������ϵ-file����
 * 2��ѡ����-�ļ�������InputStream��FileInputStream
 * 3������-byte[] car =new byte[1024];+read+��ȡ��С
 * 				���
 * 4���ͷ���Դ���ر� 
 * @author Administrator
 *
 */
public class ReadWriteFile {

	public static void main(String[] args) {
		//������ϵ-file����
		File src = new File("c:/WeChat Files/1.txt");
		//ѡ����-�ļ�������InputStream��FileInputStream
		try {
			InputStream is = new FileInputStream(src);						//170-03.36
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
