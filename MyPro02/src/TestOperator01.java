
/**
 * 测试算术运算符
 * @author Administrator
 *
 */

public class TestOperator01 {
	public static void main(String[] args) {
		byte a = 1;
		int b = 2;
		long b2 = 3;
		
		/*byte c = a+b;*/				//报错int 比 byte大
		long c2 = b+b2;
		float f1 = 3.1F;
		float d = b+b2;
		
		/*float d2 = f1 + 6.2;*/				//报错6.2是double，结果是double
		
		//Note：取余数、取模，符号与左数有关与右数无关
		System.out.println(9%-5);
		
		/**测试自增自减*/
		int x = 3;
		int y = x++;				//x先赋值再自增,y=3
		System.out.println("x = "+x+"\ny = "+y);
		x = 3;
		y = ++x;				//x先自增再赋值,y=4
		System.out.println("x = "+x+"\ny = "+y);
		
		/**扩展运算符*/
		int m = 3;
		int n = 4;
		m+=n;				//相当于m=m+n;m=3+4
		System.out.println("m="+m+"\nn="+n);
		m = 3;
		m*=n+3;				//相当于m=m*(n+3);m=3*(4+3)
		System.out.println("m="+m+"\nn="+n);
		
	}
}
