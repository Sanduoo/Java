package cn.sxt.Fanxing;

import javax.swing.text.html.parser.DTD;

/**
 * 泛型类：声明时使用泛型
 * 字母：
 * 		T	Type表示类型
 * 		K V  分别代表键值中的Key Value
 * 		E 代表Element（元素）
 * 		？表示不确定的类型
 * 
 * 使用时确定类型
 * 
 * 注意：
 * 1.泛型只能使用引用类型，不能用基本类型
 * 2.泛型声明时字母不能使用 静态属性|静态方法上
 * 
 * @author Admin
 *
 * @param <T>
 */
public class Student02<T1,T2> {
	
	private T1 javaScore;
	private T2 oracleScore;
	
/*
 	泛型声明时字母不能使用 静态属性|静态方法上	
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
		
		/**使用时指定类型(引用类型)**/
		Student02<String,Integer> student02 = new Student02<>();
		//1.安全：类型检查
		student02.setJavaScore("优秀");
		//2.省心·：类型转换
		Integer integer = student02.getOracleScore();				//自动拆箱
	
	
	}
}
