package cn.sxt.IO.byteIO;

/**
 * �ݹ飺�Լ����Լ�
 * �ݹ�ͷ����ʱ����
 * �ݹ��壺�ظ�����
 * @author Administrator
 *
 */
public class DirDemo02 {

	public static void main(String[] args) {
		printTen(1);
	}
	
	public static void printTen(int i) {
		//�ݹ�ͷ
		if (i>10) {
			return;
		}
		System.out.println(i);
		printTen(i+1);		//�ݹ���169
	}
}
