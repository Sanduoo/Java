
/**
 * 理解类和对象/实例
 * @author Administrator
 *
 */

public class SxtStu {
	
	/**属性fields**/
	int id;
	int age;
	String name;
	Computer comp;
	
	/**方法**/
	void study() {
		System.out.println("我在认真学习！使用电脑："+comp.brand);			//comp是对象可以通过“ . ”来访问对象的相关属性
	}
	
	void play() {
		System.out.println("我在玩游戏：狗熊与贪官！");
	}
	
/**
//构造方法（系统默认创建）用于创建这个类的对象，无参的构造可以由系统自动创建
Student(){				//大小写保持一样
}
**/

	//Note: main方法；程序执行的入口必须要有
	//Note: javac  SxtStu.java                 java SxtStu
	public static void main(String[] args) {
		SxtStu stu = new SxtStu();							//创建一个对象
		System.out.println(stu);
		stu.play();
		stu.id=1001;
		stu.name="三多";
		stu.age=22;
		
		Computer c1 = new Computer();				//创建一个Computer类的新的对象c1，并把字符串”外星人“赋给brand
		c1.brand = "神船";
		stu.comp = c1;											//把c1个stu的comp
		stu.study();
		
	}
}

class Computer{
	String brand;
}