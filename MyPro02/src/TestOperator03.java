
/**
 * 逻辑运算符
 * @author Administrator
 *
 */

public class TestOperator03 {
	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1&b2);				//&逻辑与
		System.out.println(b1|b2);				//|或操作
		System.out.println(b1^b2);				//^异或
		System.out.println(!b2);					//取反
		
		/**短路*/
		/*int c = 3/0;
		System.out.println(c);*/
		boolean b3 = 1>2&&2<(3/0);				//短路与，第一个操作数为false，则不需要计算后面的值
		System.out.println(b3);
		
	}
}
