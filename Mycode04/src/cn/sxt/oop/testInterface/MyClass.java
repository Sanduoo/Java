package cn.sxt.oop.testInterface;
/**
 * �ӿ�ʵ��
 * @author Admin
 *
 */
public class MyClass implements MyInterface {
	public static void main(String[] args) {
		System.out.println(MyInterface.MAX_GREAD);
	}
	
	
	@Override
	public void test01() {
		System.out.println(MyInterface.MAX_GREAD);
		System.out.println("test01");
	}
	
	@Override
	public int test02(int a,int b) {
		System.out.println("MyClass.test02()");
	 	return a;
	}
}
