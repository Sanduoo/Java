package cn.sxt.oo2;

/**
 * 
 * @author Administrator
 *
 */

public class TestObject {
	public static void main(String[] args) {
		
		/**Object object;*/
		
		TestObject to = new TestObject();
		System.out.println(to.toString());
		
		Person2 p2 = new Person2("腾飞", 19);
		System.out.println(p2);
	}
	
	/**重写toString方法**/
	public String toString() {
		return "测试Object对象";
	}
}


class Person2{
	String name;
	int age;
	
	@Override  				//方法重写注解标识
	public String toString() {
		return name+"，年龄："+age;
	}
	
	public Person2(String name,int age) {
		this.age = age;
		this.name = name;
	}
}
