package cn.sxt.neibuclass;

import java.awt.Shape;

public class Outer {
	public static void main(String[] args) {
		Face f = new Face();
		Face.Nose n = f.new Nose();								//创建内部类对象时应先创建外部类对象；x.new Abcd();
		n.breath();
		Face.Ear e = new Face.Ear();
		e.listen();
	}
}

class Face{
	int type = 1;
	String shape = "瓜子脸";
	static String color = "红润";
	
	/*		内部类		*/
	class Nose{
		String type = "123";
		
		void breath() {
			System.out.println(this.type);							//访问内部类的type；this.type
			System.out.println(Face.this.type); 				//访问外部类的type；Face.this.type
			System.out.println(shape );
			System.out.println("呼吸！");							
		}
	}
	
	/*		静态内部类：看作外部类的静态成员		*/
	static class Ear{
		 void listen() {
		/*	 System.out.println(Shape);*/						//静态内部类成员不能访问外部类的实例方法(普通属性)！！！
			 System.out.println(color);							//静态内部类成员可以访问外部类的 静态属性 实例方法！！！
			 System.out.println("我在听！");
			 
		 }
	}
}