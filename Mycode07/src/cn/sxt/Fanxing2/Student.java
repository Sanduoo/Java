package cn.sxt.Fanxing2;

import javax.swing.text.html.parser.DTD;

/**
 * 
 * 泛型的擦除：
 * 		1、继承|实现声明不指定类型
 * 		2、使用时不指定类型
 * 统一Object对待
 * 		1、编译器的警告——消除使用Object
 * 		2、不完全等同于Object，编译不会类型检查
 * @author Admin
 *
 * @param <T>
 */
public class Student<T> {
	
	private T javaScore;
	private T oracleScore;
	
/*
 	泛型声明时字母不能使用 静态属性|静态方法上	
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
		
		Student student1 = new Student<>();				//消除警告使用Object
		Student<Object> student= new Student<Object>();
		
/*		Note: 擦除不会类型检查
		test(student);	
*/
		test(student1);				//student1相当于Object，但不完全等同于Object
		test1(student);
		test1(student1);
		
	}
	
	public static void test(Student<Integer> a) {
		
	}
	
	public static void test1(Student<?> a) {
		
	}
}
