package cn.sxt.Fanxing3;

/**
 * 通配符？的使用
 * @author Admin
 *
 */
public class Student<T> {
	T score;
	
	
	public static void main(String[] args) {
		
		//Note: ?  只能用在声明类型及声明方法参数上，不能用在声明类上
		Student<?> stu = new Student<String>();
		//Note: ?  表示类型不定，使用时确定类型
		test(new Student<Integer>());
		test2(new Student<Apple>());
		
		//test3(new Student<Apple>());
		//test3(stu);				使用时指定类型
		test3(new Student<Fruit>());
		test3(new Student<Object>());
	}
	
	public static void test(Student<?> stu) {
		
	}
	
	//?  extends     <=上限		指定类型自身或子类
	//?  super 	   		>=下限 	指定类型自身或父类
	public static void test2(Student<? extends Fruit> stu) {
		
	}
	
	public static void test3(Student<? super Fruit> stu) {
		
	}
}
