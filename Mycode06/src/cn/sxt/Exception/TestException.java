package cn.sxt.Exception;

import java.util.Scanner;

/**
 * 测试异常
 * @author Admin
 *
 *RuntimeException: 
 *		ArithmeticException：运算条件异常
 *		NullPointerException：空指针异常
 *		ClassCastException: 类型转换异常
 *		ArraylandexOutOfBoundsException: 访问的元素下标越界
 *		NumberFormatException：数字格式异常
 *
 *子类重写父类方法时，不可抛出父类异常类或上层类
 */
public class TestException {
	public static void main(String[] args) {
		
		/*
		 * ArithmeticException：运算条件异常
		 * 原因除数为0等
		 * int i = 1/0;				//unchecked
		 */
		

		/**try-catch：手动处理异常**/
		try {
			Thread.sleep(30);				//checked		
		} catch (InterruptedException e) {
			e.printStackTrace();				//printStackTrace()：用来跟踪异常时间发生时堆栈的内容	print:打印	Stack:	堆栈Trace:轨迹		打印错误堆栈轨迹
		}finally {
			System.out.println("try-catch-finaly");
		}
		

		/*
		 * NullPointerException：空指针异常
		 * 原因：对象是null，调用了对象方法的属性！
		 */
/*		Computer c = null;
		if (c!=null) {
			c.start();				//Dead code:无用代码
		}
*/
		
		/*
		 * NumberFormatException：数字格式异常
		 *原因：字符串中有多种格式的字符
		 */
		String string = "1234abcd";
		Integer integer = new Integer(string);				//将string转为数字
		
		/*
		 * InputMismatchException
		 *  原因：未按要求类型输入
		 */
/*		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println(a);
*/		
	}
}

class Computer{
	void start() {
		System.out.println("计算机启动！");
	}
}

/*
 * ClassCastException: 类型转换异常
 */
/*
class Man{
	private static final String Man = "man";
	void test2(Object object) {
		if (object!=Man) {
			Man man = (Man) object;
		}
	}
}
*/