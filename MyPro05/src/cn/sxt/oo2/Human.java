package cn.sxt.oo2;

public class Human{
	public int age;			
	String name;  						//默认default可以被本包下面的类访问
	protected int height;			//可以被不同包的子类使用
	
	public void sayAge() {
		System.out.println(age);
	}
}