
/**
 * 字符串运算符
 * @author Administrator
 *
 */

public class TestOperator05 {
	public static void main(String[] args) {
		
		String a = "3";
		int b = 4;
		int c = 5;
		char d = 'a';
		System.out.println(a+b);				//输出字符串34
		System.out.println(a+c);				//输出字符串35
		
		System.out.println(b+c);				//输出数值4+5
		
		System.out.println(a+b+c);			//输出字符串345
		System.out.println(b+c+a);			//输出数值4+4，字符串3
		System.out.println(b+a+c);			//输出字符串435
		
		System.out.println(d+4);				//char在加法中做整数来运算，a在ASCII码中是97,97+4=101
		
		//Note: "+"遇字符串时做连接符；遇数值时做算术符号
		
	}
}
