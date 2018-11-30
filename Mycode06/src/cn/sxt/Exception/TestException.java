package cn.sxt.Exception;

import java.util.Scanner;

/**
 * �����쳣
 * @author Admin
 *
 *RuntimeException: 
 *		ArithmeticException�����������쳣
 *		NullPointerException����ָ���쳣
 *		ClassCastException: ����ת���쳣
 *		ArraylandexOutOfBoundsException: ���ʵ�Ԫ���±�Խ��
 *		NumberFormatException�����ָ�ʽ�쳣
 *
 *������д���෽��ʱ�������׳������쳣����ϲ���
 */
public class TestException {
	public static void main(String[] args) {
		
		/*
		 * ArithmeticException�����������쳣
		 * ԭ�����Ϊ0��
		 * int i = 1/0;				//unchecked
		 */
		

		/**try-catch���ֶ������쳣**/
		try {
			Thread.sleep(30);				//checked		
		} catch (InterruptedException e) {
			e.printStackTrace();				//printStackTrace()�����������쳣ʱ�䷢��ʱ��ջ������	print:��ӡ	Stack:	��ջTrace:�켣		��ӡ�����ջ�켣
		}finally {
			System.out.println("try-catch-finaly");
		}
		

		/*
		 * NullPointerException����ָ���쳣
		 * ԭ�򣺶�����null�������˶��󷽷������ԣ�
		 */
/*		Computer c = null;
		if (c!=null) {
			c.start();				//Dead code:���ô���
		}
*/
		
		/*
		 * NumberFormatException�����ָ�ʽ�쳣
		 *ԭ���ַ������ж��ָ�ʽ���ַ�
		 */
		String string = "1234abcd";
		Integer integer = new Integer(string);				//��stringתΪ����
		
		/*
		 * InputMismatchException
		 *  ԭ��δ��Ҫ����������
		 */
/*		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println(a);
*/		
	}
}

class Computer{
	void start() {
		System.out.println("�����������");
	}
}

/*
 * ClassCastException: ����ת���쳣
 */
/*
class Man{
	private static final String Man = "man";
	void test2(Object object) {
		if (object!=Man) {
			Man man = (Man) object;
		}
	}
}
*/