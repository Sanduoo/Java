package cn.sxt.IO.byteIO;

import java.io.UnsupportedEncodingException;

/**
 * ���룺�ֽ�-->�ַ���
 * @author Administrator
 *
 */
public class ContentDecode {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String msg = "��ǿ����������гChina";
		//���룺�ֽ�����
		byte[ ] dates = msg.getBytes();
		System.out.println("Ĭ��ΪGBK�ַ����ĳ���"+dates.length);
		
		//���룺�ַ���String(byte[] bytes,int offset,int lenght,String charsetName)
		msg = new String(dates,0,dates.length,"GBK");
		System.out.println(msg);
		
		//����
		//1���ֽ�������
		msg = new String(dates,0,dates.length-8,"GBK");
		System.out.println(msg);
		
		//2���ַ�����ͳһ
		msg = new String(dates,0,dates.length,"UTF8");
		System.out.println(msg);
		//172
	}
}
