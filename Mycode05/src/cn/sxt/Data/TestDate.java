package cn.sxt.Data;

import java.util.Date;

/**
 * ����Dateʱ���ࣨjava.util.Date��
 * @author Admin
 *�ӱ�׼��Ԫ1970.1.1 0:00��ʼ
 */
public class TestDate {
	public static void main(String[] args) {
		
		//Note: Date���ʾ�ض���ʱ�̣�����Ϊ���롣
		Date d = new Date();
		
		long t = System.currentTimeMillis();
		System.out.println(t);				//��ǰʱ��
		
		Date d2 = new Date(1000);				//һǧ����
		System.out.println(d2.toGMTString());				//������ʹ��toGMTString
		
		System.out.println(d2.getTime());
		d2.setTime(2000);
		
		System.out.println(d.getTime()<d2.getTime());
		
		
	}
}
