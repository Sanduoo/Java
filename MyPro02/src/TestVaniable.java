
/**
 * 测试变量
 * @author Admin
 *
 */

public class TestVaniable {
	
	int a;					//成员变量，从属于对象；成员变量会自动被初始化
	static int size;				//静态变量，从属于类
	
	public static void main(String[] args) {
		
		/**语句块*/
		{
			int age;				//局部变量，从属于语句块
			age = 18;
		}
		
		int salary = 3000;				//局部变量，从属于方法
		
		int gao = 13;
		System.out.println(gao);
		
		//Note: int j = i+5;	//编译出错，变量i还未被初始化
		int i;
		
	}
	

}
