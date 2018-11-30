package cn.sxt.oo2;

/**
 * 测试多态
 * 
 * @author Administrator
 *
 */

public class TestPolym {
	public static void main(String[] args) {
		
		Animal a =new Animal();
		animalCry(a);
		
		Dog d = new Dog();						//多态：通过父类引用指向子类对象 
		animalCry(d);
		
		animalCry(new Cat());
		
		
		Animal d2 = new Dog();				//上转型：子类Dog自动转为父类Animal对象
		animalCry(d2);
		
		Dog d3 = (Dog) d2;						//下转型：父类Animal中d2对象可以强制转型成子类Dogd3
		d3.seeDoor();
		
		Animal c = new Cat();
		Dog d4 = (Dog) c;  						//类型转换出错，编译不报错，运行报错
		d4.seeDoor();
	}
	
	static void animalCry(Animal a) {
		a.shout();
	}
	
}


class Animal{												//父类加final后子类不能被继承
	public void shout() {								//父类方法加final后，子类不能重写
		System.out.println("叫了一声！");
	}
}


class Dog extends Animal{
	public void shout() {
		System.out.println("汪汪汪！");
	}
	
	public void seeDoor() {
		System.out.println("看门！");
	}
}


class Cat extends Animal{
	public void shout() {
		System.out.println("喵喵喵！");
	}
}