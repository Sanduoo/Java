package cn.sxt.Sort.innerType;



/**
 * ���������������͵ıȽϣ�comparTo����
 * ������С��integer float double ֱ�ӱȽϻ����������ʹ�С
 * �ַ����Ƚϵ�Unicode��֮��
 * �ַ�����
 * 		1.�������һ��������һ����ʼ��ʼ���Ӵ������س���֮��
 * 		2.���򷵻ص�һ������ȵ�Unicode��֮��
 * 
 * @author Admin
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		Integer a;				//���ݻ����������ʹ�С
		Character ch;		//����Unicode����˳��
		String str ="abc";
		String str2 = "abcd";
		System.out.println(str.compareTo(str2)); 			//�ַ��������Ȳ�ͬ�ȳ���
		str2 = "abe";
		System.out.println(str.compareTo(str2)); 			//�ַ�����������ͬ�����ص�һ������ȵ�Unicode��֮��
		
		java.util.Date date;				//�������ڵĳ����������Ƚϣ�D1<D2 -1;D1==D2 0��D1>D2 1
		
	}
}
