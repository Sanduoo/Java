
/**
 * 位运算符
 * @author Administrator
 *
 */

public class TestOperator04 {
	public static void main(String[] args) {
		
		int a = 3;
		int b = 4;
		System.out.println(a&b);				//与操作
		System.out.println(a|b);					//或操作
		System.out.println(a^b);				//异或操作
		System.out.println(~a);					//取反
		
		/**移位运算*/
		int c = 3<<2;
		System.out.println(c);					//3<<2=3*2*2
		System.out.println(12>>2);			//12>>2=12/2/2
		
	}
}
