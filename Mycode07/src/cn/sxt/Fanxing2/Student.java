package cn.sxt.Fanxing2;

import javax.swing.text.html.parser.DTD;

/**
 * 
 * ���͵Ĳ�����
 * 		1���̳�|ʵ��������ָ������
 * 		2��ʹ��ʱ��ָ������
 * ͳһObject�Դ�
 * 		1���������ľ��桪������ʹ��Object
 * 		2������ȫ��ͬ��Object�����벻�����ͼ��
 * @author Admin
 *
 * @param <T>
 */
public class Student<T> {
	
	private T javaScore;
	private T oracleScore;
	
/*
 	��������ʱ��ĸ����ʹ�� ��̬����|��̬������	
	private static T t;
*/	
	
	public T getJavaScore() {
		return javaScore;
	}
	public void setJavaScore(T javaScore) {
		this.javaScore = javaScore;
	}
	public T getOracleScore() {
		return oracleScore;
	}
	public void setOracleScore(T oracleScore) {
		this.oracleScore = oracleScore;
	}


	public static void main(String[] args) {
		
		Student student1 = new Student<>();				//��������ʹ��Object
		Student<Object> student= new Student<Object>();
		
/*		Note: �����������ͼ��
		test(student);	
*/
		test(student1);				//student1�൱��Object��������ȫ��ͬ��Object
		test1(student);
		test1(student1);
		
	}
	
	public static void test(Student<Integer> a) {
		
	}
	
	public static void test1(Student<?> a) {
		
	}
}
