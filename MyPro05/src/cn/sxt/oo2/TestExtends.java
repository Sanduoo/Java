package cn.sxt.oo2;

/**
 * ���Լ̳�
 * @author Administrator
 *
 */

public class TestExtends {
	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.name = "����";
		stu.height = 170;
		stu.rest();
		
		Student stu2 = new Student("�ڷ�",19,"ϴ���շ�רҵ");
		
		System.out.println(stu2 instanceof Student); 					//�ж�stu2�Ƿ���Student�Ķ���
		System.out.println(stu2 instanceof Person); 						//�ж�stu2�Ƿ���Person�Ķ���
		System.out.println(stu2 instanceof Object);
		System.out.println(new Person() instanceof Student);
		
	}
}


class Person  /*extends Object*/{
	String name;
	int height;
	
	public void rest() {
		System.out.println("��Ϣһ�����");
	}
}


class Student extends Person{
	String major;
	
	public void study() {
		System.out.println("ѧϰ��Сʱ��");
	}
	
	public Student(String name,int height,String major) {
		this.major = major;
		this.name = name;
		this.height = height;
	}
	
	public Student() {
	}
}