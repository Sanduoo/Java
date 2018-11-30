package cn.sxt.oo2;

/**
 * ���Զ�̬
 * 
 * @author Administrator
 *
 */

public class TestPolym {
	public static void main(String[] args) {
		
		Animal a =new Animal();
		animalCry(a);
		
		Dog d = new Dog();						//��̬��ͨ����������ָ��������� 
		animalCry(d);
		
		animalCry(new Cat());
		
		
		Animal d2 = new Dog();				//��ת�ͣ�����Dog�Զ�תΪ����Animal����
		animalCry(d2);
		
		Dog d3 = (Dog) d2;						//��ת�ͣ�����Animal��d2�������ǿ��ת�ͳ�����Dogd3
		d3.seeDoor();
		
		Animal c = new Cat();
		Dog d4 = (Dog) c;  						//����ת���������벻�������б���
		d4.seeDoor();
	}
	
	static void animalCry(Animal a) {
		a.shout();
	}
	
}


class Animal{												//�����final�����಻�ܱ��̳�
	public void shout() {								//���෽����final�����಻����д
		System.out.println("����һ����");
	}
}


class Dog extends Animal{
	public void shout() {
		System.out.println("��������");
	}
	
	public void seeDoor() {
		System.out.println("���ţ�");
	}
}


class Cat extends Animal{
	public void shout() {
		System.out.println("��������");
	}
}