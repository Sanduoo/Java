package cn.sxt.oo2;

/**
 * ���Է�װ
 * @author Administrator
 *   private-default-protected-public
 */

public class TestEncapsulation {
	public static void main(String[] args) {
		
		Human h = new Human();
		h.age = 22;
		h.name = "����";
		h.height = 170;
		
		h.sayAge();
		
		Person4Encapsulation p4 = new Person4Encapsulation();
		/*	p4.age = 22;*/ 				//age��˽��ֻ��ͨ��
		p4.setAge(23);
		
		p4.getName();
		
		System.out.println(p4.getAge());
		
	}
}


class Boy extends Human{
	public void sayHello() {
		System.out.println(age);			//�����޷�ʹ�ø����˽�����Ժͷ���
	}
}