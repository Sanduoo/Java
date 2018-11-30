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
		System.out.println("飞机依靠发动机在飞");
	}
}

class Man implements Flyable{
	@Override
	public void fly() {
	System.out.println("跳起来，飞！");
		
	}
}

class Stone implements Flyable,Attack{
	
	int weight;
	
	@Override
	public void attack() {
		System.out.println("石头扔出去");
	}
	@Override
	public void fly() {
		System.out.println("被人扔出去飞！");
	}
}