package cn.sxt.oo2;

/**
 * 测试重写（Override)
 * @author Administrator
 *
 */

public class TestOverride {
	public static void main(String[] args) {
		
		Horse h = new Horse();
		h.run();
		
	}
}


class Vehicle{
	public void run() {
		System.out.println("跑...");
	}
	
	public void stop() {
		System.out.println("停止！");
	}
	
	public  Person whoIsPsg(){
		return new Person();
	}
}


class Horse extends Vehicle{
	/**子类重写父类方法，要求一：方法形式相同**/
	public void run() {		
		System.out.println("四蹄翻飞，嘚嘚嘚...");
	}
	/**Student比Person小，要求二：子类返回值类型/声明异常类型小于父类返回值类型**/
	public  Student whoIsPsg(){
		return new Student();
	}
	/**要求三：子类访问权限大于等于父类**/
	
}



