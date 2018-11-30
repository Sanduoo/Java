package cn.sxt.Fanxing3;

/**
 * 嵌套泛型
 * @author Admin
 *
 */
public class NestedGenerics<T> {
	T stu;
	
	public static void main(String[] args) {
		//泛型的嵌套
		NestedGenerics<Student<String>> room = new NestedGenerics<Student<String>>();
		//从内到外拆分
		room.stu = new Student<String>();
		Student<String> stu = room.stu;
		String score = stu.score;
		System.out.println(score);
	}
}
