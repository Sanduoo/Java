package cn.sxt.Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * ���ʹ���
 * @author Admin
 *
 */
public class TestTryCatch {
	public static void main(String[] args) {
		
		FileReader reader = null;
		try {
			reader = new FileReader("d:/a.txt");
			char temp = (char) reader.read();				//reader.read()  ��һ���ַ�
			char temp2 = (char)reader.read();				//����һ���ַ�
			char temp3 = (char) reader.read();
			char temp4 = (char) reader.read();
			char temp5 = (char) reader.read();
			char temp6 = (char) reader.read();
			char temp7 = (char) reader.read();
			char temp8 = (char) reader.read();
			System.out.println("�������ݣ�"+temp+temp2+temp3+temp4+temp5+temp6+temp7+temp8);
		/**���ļ�������**/
		} catch (FileNotFoundException e) {				//catch: ���Բ������쳣�����쳣���м̳й�ϵ��Խ�Ƕ�����࣬Խ�������棨FileNotFoundException��IOException�����ࣩ
			System.out.println("�ļ�û���ҵ�������");
			e.printStackTrace();
		/**����ȡ�ļ�����**/
		}catch (IOException e) {
			System.out.println("��ȡ�ļ����󣡣���");
		}finally {				//finaly: �д�Źر���Դ�Ĵ���
			System.out.println("������û���쳣���ҿ϶���ִ�У�����");
			try {
				if (reader!=null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}