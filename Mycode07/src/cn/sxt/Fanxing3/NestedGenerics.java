package cn.sxt.Fanxing3;

/**
 * Ƕ�׷���
 * @author Admin
 *
 */
public class NestedGenerics<T> {
	T stu;
	
	public static void main(String[] args) {
		//���͵�Ƕ��
		NestedGenerics<Student<String>> room = new NestedGenerics<Student<String>>();
		//���ڵ�����
		room.stu = new Student<String>();
		Student<String> stu = room.stu;
		String score = stu.score;
		System.out.println(score);
	}
}
