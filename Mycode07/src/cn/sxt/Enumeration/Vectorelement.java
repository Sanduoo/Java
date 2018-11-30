package cn.sxt.Enumeration;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Enumeration的使用
 * 		1、判断hasMoreElements
 * 		2、获取nextElement()
 * 
 * Vector的element()方法
 * @author Admin
 *
 */
public class Vectorelement {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<>();
		vector.add("Javase");
		vector.add("html");
		vector.add("oracle");
		
//		遍历该Vector
		Enumeration<String> en = vector.elements();
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement()); 				//依次输出
			
		}
	}
}
