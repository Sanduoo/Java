package cn.sxt.IO.byteIO;

import java.io.UnsupportedEncodingException;

/**
 * ���룺�ַ���-->�ֽ�
 * @author Administrator
 *
 */
public class ContentEncode {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String msg = "��ǿ����������г";
		String a = "һ";
		//���룺�ֽ�����
//		byte[ ] dates = msg.getBytes("UTF-8");
		byte[ ] dates = msg.getBytes();
		System.out.println("UTF-8���볤��:"+a.getBytes("UTF-8").length);
		System.out.println("GBK���볤��:"+a.getBytes("GBK").length);
		System.out.println("GB2312���볤��:"+a.getBytes("GB2312").length);
		System.out.println("Ĭ��ΪGBK�ַ���"+dates.length);
		
		//���룺�����ַ���
//		System.out.println("UTF-8���볤��"+a.getBytes(UTF-8));
	}
}
