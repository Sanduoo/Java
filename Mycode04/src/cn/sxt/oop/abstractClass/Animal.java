package cn.sxt.oop.abstractClass;
/**
 * ���󷽷���ֻ��������ʵ�֣�
 * @author Admin
 *������ֻ�ܱ������̳�
 *���󷽷����뱻����ʵ��
 */
public abstract class Animal {
	
	String str;
	
	public abstract void run() ;					//���󷽷������壺����������ƺͷ�����ʵ�ַ����ˣ�Ϊ�����ṩ��ģ�� 
	public void breath() {
		System.out.println("������");
	}
	
}

class Cat extends Animal{

	@Override
	public void run() {
		System.out.println("è��С��");
		
	}
	
}

class Dog extends Animal{
	public void run() {
		System.out.println("����");
	}
}