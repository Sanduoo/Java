package cn.sxt.oo2;

/**
 * 测试继承
 * @author Administrator
 *
 */

public class TestExtends {
	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.name = "三多";
		stu.height = 170;
		stu.rest();
		
		Student stu2 = new Student("腾飞",19,"洗碗烧饭专业");
		
		System.out.println(stu2 instanceof Student); 					//判断stu2是否是Student的对象
		System.out.println(stu2 instanceof Person); 						//判断stu2是否是Person的对象
		System.out.println(stu2 instanceof Object);
		System.out.println(new Person() instanceof Student);
		
	}
}


class Person  /*extends Object*/{
	String name;
	int height;
	
	public void rest() {
		System.out.println("休息一会儿！");
	}
}


class Student extends Person{
	String major;
	
	public void study() {
		System.out.println("学习两小时！");
	}
	
	public Student(String name,int height,String major) {
		this.major = major;
		this.name = name;
		this.height = height;
	}
	
	public Student() {
	}
}