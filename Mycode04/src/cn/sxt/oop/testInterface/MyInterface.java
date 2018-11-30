package cn.sxt.oop.testInterface;
/**
 * 测试接口
 * @author Admin
 *
 */
public interface MyInterface {
	 
	/*接口中只有：常量、抽象方法*/
	String MAX_GREAD = "BOSS";						//接口中常量定义是默认public static final String MAX_GREAD = "BOSS";
	int MAX_SPEED = 120;
	
	public void test01();										//只能用public和abstract
	public int test02(int a,int b) ;
		
	
	
}
