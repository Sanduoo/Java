
/*
 * 整型数据类型
 */

public class TestPrimitiveDateType {
	public static void main(String[] args) {
		
		/*测试整型变量*/
		int a = 15;
		int b = 015;				//以0开头是八进制（13）
		int c = 0x15;				//以0x开头是十六进制（21）
		int d = 0b1101;		//以0b开头是二进制（13）
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("d = "+d);
		
		byte age = 30;
		short salary = 30000;
		int population = 2000000000;						//整型常量默认是int类型
		long globalPopulation = 7400000000L;		//后面加L表示这是一个长整型long的常量
		
	}
}
