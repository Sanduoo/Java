
/**
 * 测试自动类型转化
 * 容量小的向容量大的转化
 * @author Administrator
 *
 */

public class TestTypeConvert {
	public static void main(String[] args) {
		
		int a = 324;
		long b = a;
		double d =b;
		
		/*a = b;							报错：long不能转化为int
		long e = 3.23;				报错：3.23是double类型，double比long范围大*/
		
		float f = 234324L;			//long类型可以转化为float类型
		
		/*特例  byte存储整型数据，占据1个字节(8 bits)，能够存储的数据范围是-128～+127*/
		byte b2 = 123;
		
	}
}
