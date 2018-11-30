
/**
 * 测试关系运算符
 * @author Administrator
 *
 */

public class TestOperator02 {
	public static void main(String[] args) {
		int a = 3;
		System.out.println(a==3);
		System.out.println(a!=3);
		
		
		char b = 'a';
		char b2 = 'c';
		System.out.println((int)b);				//强制转换成int类型
		System.out.println(0+b);				//强制转换成int类型
		System.out.println((int)b2);
		System.out.println(b<b2);
		
	}
}
