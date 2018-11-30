
/**
 * 测试方法重载
 * @author Administrator
 *
 */

public class TestOverload {
	public static void main(String[] args) {
		
		System.out.println(add(2, 3));				//int,int
		System.out.println(add(3.0, 2.3));			//double,double
		System.out.println(add(3.2, 2));				//double,int
		System.out.println(add(2, 2.5));				//int,double
		System.out.println(add(2, 3, 4));				//int,int,int
		System.out.println(add(2.3, 2.3));			//double,double
		
		/*我们已经见过的方法重载*/
		System.out.println();				//0个参数
		System.out.println(1);			//参数是1个int类型
		System.out.println(3.2); 		//参数是1个double类型
		
	}
	
	/**求和的方法**/
	public static int add(int n1,int n2) {
		int sum = n1+n2;
		return sum;
	}
	
	//Note: 方法名相同，参数个数不同，构成重载
	public static int add(int n1,int n2,int n3) {
		int sum = n1+n2+n3;
		return sum;
	}
	
	//Note: 方法名相同，参数类型不同，构成重载
	public static double add(double n1,double n2) {
		double sum = n1+n2;
		return sum;
	}
	
	//Note: 方法名相同，参数顺序不同，构成重载
	public static double add(int n1,double n2) {
		double sum = n1 + n2;
		return sum;
	}
	
	//Note: 方法名相同，参数顺序不同，构成重载
	public static double add(double n1,int n2) {
		double sum = n1 +n2;
		return sum;
	}

					/**
					//编译错误：只有返回值相同，不构成方法重载
					public static double add(int n1,int n2) {
						double sum =n1+n2;
						return sum;
					}
					
					
					//编译错误：只有参数名称不同，不构成方法重载
					public static int add(int n2,int n1) {
						int sum= n1+n2;
						return sum;
					}
					**/
	
}
