
/*
 * 浮点型变量
 */

/*
 * float和double精度问题：
 * 
 * 一、范围
 * float和double的范围是由指数的位数来决定的。 
	float的指数位有8位，而double的指数位有11位，分布如下： 
	float： 
	1bit（符号位） 
	8bits（指数位） 
	23bits（尾数位） 
	double： 
	1bit（符号位）
	11bits（指数位） 
	52bits（尾数位）
	
	二、精度
	float和double的精度是由尾数的位数来决定的。
	浮点数在内存中是按科学计数法来存储的，其整数部分始终是一个隐含着的“1”，由于它是不变的，故不能对精度造成影响。 
	float：2^23 = 8388608，一共七位，这意味着最多能有7位有效数字，但绝对能保证的为6位，也即float的精度为6~7位有效数字； 
	double：2^52 = 4503599627370496，一共16位，同理，double的精度为15~16位。 
	单精度类型（float）和双精度类型(double)存储 
 */

import java.math.*;

public class TestprimitiveDateType2 {
	public static void main(String[] args) {
		
		float a= 3.14F;
		double b = 6.28;
		double c = 628E-2;				//E-2  =  10^-2 = 0.01
		
		System.out.println("c = "+c);				//C = 628*0.01=6.28
		
		//Note: 浮点数是不精确的一定不要用比较！
		float f = 0.1F;
		double d = 1.0/10;
		System.out.println(f==d);				//结果为false，float精度没有double高
		
		float d1 = 423432423F;
		float d2 = d1 + 1;			
		if (d1==d2) {
			System.out.println("d1==d2");				//输出结果为d1==d2（float的精度为6~7位有效数字）
		}else {
			System.out.println("d1!=d2");
		}
		
		//Note: 使用精确的浮点运行，推荐使用BigDecimal
		
		System.out.println("###################");
		BigDecimal bd = BigDecimal.valueOf(1.0);
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		System.out.println(bd);				//0.5
		System.out.println(1.0-0.1-0.1-0.1-0.1-0.1);				//0.500000000000000001
		
		BigDecimal bd2 = BigDecimal.valueOf(0.1);
		BigDecimal bd3 = BigDecimal.valueOf(1.0/10.0);
		
		System.out.println(bd2.equals(bd3));
		
	}
}
