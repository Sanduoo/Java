package cn.sxt.Fanxing3;

/**
 * ͨ�������ʹ��
 * @author Admin
 *
 */
public class Student<T> {
	T score;
	
	
	public static void main(String[] args) {
		
		//Note: ?  ֻ�������������ͼ��������������ϣ�����������������
		Student<?> stu = new Student<String>();
		//Note: ?  ��ʾ���Ͳ�����ʹ��ʱȷ������
		test(new Student<Integer>());
		test2(new Student<Apple>());
		
		//test3(new Student<Apple>());
		//test3(stu);				ʹ��ʱָ������
		test3(new Student<Fruit>());
		test3(new Student<Object>());
	}
	
	public static void test(Student<?> stu) {
		
	}
	
	//?  extends     <=����		ָ���������������
	//?  super 	   		>=���� 	ָ�������������
	public static void test2(Student<? extends Fruit> stu) {
		
	}
	
	public static void test3(Student<? super Fruit> stu) {
		
	}
}
