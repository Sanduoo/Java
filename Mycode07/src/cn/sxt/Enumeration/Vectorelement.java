package cn.sxt.Enumeration;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Enumeration��ʹ��
 * 		1���ж�hasMoreElements
 * 		2����ȡnextElement()
 * 
 * Vector��element()����
 * @author Admin
 *
 */
public class Vectorelement {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<>();
		vector.add("Javase");
		vector.add("html");
		vector.add("oracle");
		
//		������Vector
		Enumeration<String> en = vector.elements();
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement()); 				//�������
			
		}
	}
}
