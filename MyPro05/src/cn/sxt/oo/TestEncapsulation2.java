package cn.sxt.oo;

import cn.sxt.oo2.*;


public class TestEncapsulation2 {
	public static void main(String[] args) {
		
		Human h = new Human();
		h.age = 13;
		/*h.name = "Èý¶à";*/
		
		h.sayAge();
	}
}


class Gril extends Human{
	void sayGood() {
		System.out.println(height);
	}
}