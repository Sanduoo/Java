package cn.sxt.oop.testInterface;

public interface Flyable {
	
	int MAX_SPEED = 11000;
	int MIN_HEIGHT = 1;
	void fly();															//public abstract void 
	
}

interface Attack{
	void attack();
}
class Plane implements Flyable{
	@Override
	public void fly() {
		System.out.println("�ɻ������������ڷ�");
	}
}

class Man implements Flyable{
	@Override
	public void fly() {
	System.out.println("���������ɣ�");
		
	}
}

class Stone implements Flyable,Attack{
	
	int weight;
	
	@Override
	public void attack() {
		System.out.println("ʯͷ�ӳ�ȥ");
	}
	@Override
	public void fly() {
		System.out.println("�����ӳ�ȥ�ɣ�");
	}
}