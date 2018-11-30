package cn.sxt.oo2;

/**
 * 测试封装
 * @author Administrator
 *   private-default-protected-public
 */

public class TestEncapsulation {
	public static void main(String[] args) {
		
		Human h = new Human();
		h.age = 22;
		h.name = "三多";
		h.height = 170;
		
		h.sayAge();
		
		Person4Encapsulation p4 = new Person4Encapsulation();
		/*	p4.age = 22;*/ 				//age被私有只能通过
		p4.setAge(23);
		
		p4.getName();
		
		System.out.println(p4.getAge());
		
	}
}


class Boy extends Human{
	public void sayHello() {
		System.out.println(age);			//子类无法使用父类的私有属性和方法
	}
}