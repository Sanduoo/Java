package com.sxt.IO2;

public class DecorateTest01 {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.say();
		
		//装饰
		Amplifier ap = new Amplifier(p);
		ap.say();
		
	}
}

interface Say{
	void say();
}

class Person implements Say{
	private int voice = 10;
	public void say() {
		System.out.println("人的声音为" +this.getVoice());
	}
	public int getVoice() {
		return voice;
	}
	public void setVoice(int voice) {
		this.voice = voice;
	}
}

class Amplifier implements Say{
	private Person p;
	Amplifier(Person p) {
		// TODO Auto-generated constructor stub
		this.p = p;
	}
	public void say() {
		System.out.println("人的声音为" +p.getVoice()*10);
		System.out.println("噪声");
	}
}



