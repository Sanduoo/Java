package cn.sxt.Fanxing;

/**
 * ��ȡֵ
 * 1.��Ҫǿ������ת�� 
 * 2.�ֶ����ͼ�飺����ת������  java.lang.ClassCastException
 * @author Admin
 *
 */
public class App {
	public static void main(String[] args) {
		
		//Note: Object-->Integer-->�Զ�װ��
		Object object = 80;
		int score = (int)object;
		System.out.println(score);
		
		//Note: �������� int-->Integer-->Object
		Student student = new Student(80, 90);
/*		student.getJavase();*/
		
		int javaseScore = (Integer)student.getJavase();
		String oracleScore = null;
		if (student.getOracle() instanceof String) {
			oracleScore = (String)student.getOracle();
		}
		System.out.println("����Ϊ��"+javaseScore+","+oracleScore);
	}
}
