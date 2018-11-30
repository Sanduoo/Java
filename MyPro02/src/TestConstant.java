

/**
 *测试常量
 * @author Administrator
 *
 */

public class TestConstant {
	public static void main(String[] args) {
		int age = 18;
		final String name = "gaoqi";
		/*name = "腾飞";*/
		System.out.print(name);
		
/*
 * exp2
 */
		//Note: PI = 3.14;PI被final（常量）修饰，不能再被赋值
		final double PI =3.14;
		double r = 4;
		double area = PI * r * r;					//圆的面积
		double circle = 2 * PI * r;				//圆的周长
		System.out.println("area = "+ area);
		System.out.println("circle = "+ circle);
		
	}
}
