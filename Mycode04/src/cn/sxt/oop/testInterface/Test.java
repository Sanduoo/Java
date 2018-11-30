package cn.sxt.oop.testInterface;

public class Test {
	public static void main(String[] args) {
		/*Flyable f = new Flyable() ;*/					//不能创建新的接口对象
		Flyable f = new Stone();							//可以创建接口子类对象
		f.fly();
	
	}
}
