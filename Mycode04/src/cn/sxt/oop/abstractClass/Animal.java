package cn.sxt.oop.abstractClass;
/**
 * 抽象方法（只声明，不实现）
 * @author Admin
 *抽象类只能被用来继承
 *抽象方法必须被子类实现
 */
public abstract class Animal {
	
	String str;
	
	public abstract void run() ;					//抽象方法的意义：将方法的设计和方法的实现分离了！为子类提供了模板 
	public void breath() {
		System.out.println("呼吸！");
	}
	
}

class Cat extends Animal{

	@Override
	public void run() {
		System.out.println("猫步小跑");
		
	}
	
}

class Dog extends Animal{
	public void run() {
		System.out.println("狗跑");
	}
}