
/**
 * 当程序发生二义性是用this来区分局部变量和成员变量
 * @author Administrator
 *this不能用于static方法中
 */

public class TestThis {
	
	int a,b,c;							//成员变量
	
	TestThis(int a,int b){
		this.a = a;						//局部变量
		this.b = b;
	}
	
	TestThis(int a,int b,int c){
		
		this(a, b);						//调用构造器（必须位于构造方法的第一句）
		this.c = c;
	}
	
	void sing() {
		
	}
	
	void eat() {
		
		this.sing(); 						//调用本类中的sing();
		
		System.out.println("你妈妈喊你回家吃饭！");
		
	}
	
	public static void main(String[] args) {
		
		TestThis hi = new TestThis(2, 3);
		hi.eat();
		
	}
	
}
