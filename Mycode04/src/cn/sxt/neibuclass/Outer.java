package cn.sxt.neibuclass;

import java.awt.Shape;

public class Outer {
	public static void main(String[] args) {
		Face f = new Face();
		Face.Nose n = f.new Nose();								//�����ڲ������ʱӦ�ȴ����ⲿ�����x.new Abcd();
		n.breath();
		Face.Ear e = new Face.Ear();
		e.listen();
	}
}

class Face{
	int type = 1;
	String shape = "������";
	static String color = "����";
	
	/*		�ڲ���		*/
	class Nose{
		String type = "123";
		
		void breath() {
			System.out.println(this.type);							//�����ڲ����type��this.type
			System.out.println(Face.this.type); 				//�����ⲿ���type��Face.this.type
			System.out.println(shape );
			System.out.println("������");							
		}
	}
	
	/*		��̬�ڲ��ࣺ�����ⲿ��ľ�̬��Ա		*/
	static class Ear{
		 void listen() {
		/*	 System.out.println(Shape);*/						//��̬�ڲ����Ա���ܷ����ⲿ���ʵ������(��ͨ����)������
			 System.out.println(color);							//��̬�ڲ����Ա���Է����ⲿ��� ��̬���� ʵ������������
			 System.out.println("��������");
			 
		 }
	}
}