package cn.sxt.oo2;

/**
 * ������д��Override)
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
		System.out.println("��...");
	}
	
	public void stop() {
		System.out.println("ֹͣ��");
	}
	
	public  Person whoIsPsg(){
		return new Person();
	}
}


class Horse extends Vehicle{
	/**������д���෽����Ҫ��һ��������ʽ��ͬ**/
	public void run() {		
		System.out.println("���㷭�ɣ��N�N�N...");
	}
	/**Student��PersonС��Ҫ��������෵��ֵ����/�����쳣����С�ڸ��෵��ֵ����**/
	public  Student whoIsPsg(){
		return new Student();
	}
	/**Ҫ�������������Ȩ�޴��ڵ��ڸ���**/
	
}



