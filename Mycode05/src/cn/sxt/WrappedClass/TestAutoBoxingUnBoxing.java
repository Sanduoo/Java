package cn.sxt.WrappedClass;

/**
 * 测试自动装箱和拆箱
 * @author Admin
 *
 */
public class TestAutoBoxingUnBoxing {
	public static void main(String[] args) {
//		Integer a = new Integer(1000);
		Integer a = 1000;				//自动装箱：编译器自动Integer a = new Integer(1000);
		
		Integer b = 1500;
		int c = b;							//自动拆箱：编译器自动b.intValue;
		System.out.println(c);
		
/*		Integer d = null;
		int f = d;
		System.out.println(f);
*/
		
		Integer d = 1234;
		Integer d2= 1234;
		System.out.println(d==d2);
		System.out.println(d.equals(d2));				//equals只比较两个对象的值
		
		System.out.println("————");
		
		Integer d3 = 123;
		Integer d4 = 123;
		System.out.println(d3==d4);						//[-128,127]之间的数，仍当作基本数据类型(int)处理
		System.out.println(d3.equals(d4));
		
	}
}
