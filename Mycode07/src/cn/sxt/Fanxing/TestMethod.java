package cn.sxt.Fanxing;

import java.io.Closeable;
import java.io.IOException;

/**
 * ���ͷ���<��ĸ> : ֻ�ܷ��ʶ������Ϣ�������޸�
 * 
 * ���η�<��ĸ>�������� ����������ĸ����
 * ��
 * @author Admin
 *
 */
public class TestMethod {
	public static void main(String[] args) {
		test("a"); 				//T-->String
		
	}
	
	/**���ͷ���**/
	public static <T> void test (T a) {
		System.out.println(a);
	}
	
	/**extends��ʾ<=**/
	public static <T extends Closeable> void test (T... a) {
		for(T temp:a) {
			try {
				if (null!=temp) {
					temp.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
