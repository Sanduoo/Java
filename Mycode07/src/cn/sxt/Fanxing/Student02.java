package cn.sxt.Fanxing;

import javax.swing.text.html.parser.DTD;

/**
 * �����ࣺ����ʱʹ�÷���
 * ��ĸ��
 * 		T	Type��ʾ����
 * 		K V  �ֱ�����ֵ�е�Key Value
 * 		E ����Element��Ԫ�أ�
 * 		����ʾ��ȷ��������
 * 
 * ʹ��ʱȷ������
 * 
 * ע�⣺
 * 1.����ֻ��ʹ���������ͣ������û�������
 * 2.��������ʱ��ĸ����ʹ�� ��̬����|��̬������
 * 
 * @author Admin
 *
 * @param <T>
 */
public class Student02<T1,T2> {
	
	private T1 javaScore;
	private T2 oracleScore;
	
/*
 	��������ʱ��ĸ����ʹ�� ��̬����|��̬������	
	private static T1 t;
*/	
	
	public T1 getJavaScore() {
		return javaScore;
	}
	public void setJavaScore(T1 javaScore) {
		this.javaScore = javaScore;
	}
	public T2 getOracleScore() {
		return oracleScore;
	}
	public void setOracleScore(T2 oracleScore) {
		this.oracleScore = oracleScore;
	}


	public static void main(String[] args) {
		
		/**ʹ��ʱָ������(��������)**/
		Student02<String,Integer> student02 = new Student02<>();
		//1.��ȫ�����ͼ��
		student02.setJavaScore("����");
		//2.ʡ�ġ�������ת��
		Integer integer = student02.getOracleScore();				//�Զ�����
	
	
	}
}
