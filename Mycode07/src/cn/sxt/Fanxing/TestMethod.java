package cn.sxt.Fanxing;

import java.io.Closeable;
import java.io.IOException;

/**
 * 泛型方法<字母> : 只能访问对象的信息，不能修改
 * 
 * 修饰符<字母>返回类型 方法名（字母）｛
 * ｝
 * @author Admin
 *
 */
public class TestMethod {
	public static void main(String[] args) {
		test("a"); 				//T-->String
		
	}
	
	/**泛型方法**/
	public static <T> void test (T a) {
		System.out.println(a);
	}
	
	/**extends表示<=**/
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
