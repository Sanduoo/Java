package cn.sxt.HashMap;

import java.util.ArrayList;
import java.util.List;

/**
 * �༶
 * @author Admin
 *
 */
public class Classroom {
	private String no;
	private List<Student>students;				//ѧ���б�
	private double total;				//�ܷ�
	
	//���ɿչ�����
	public Classroom() {
		students = new ArrayList<Student>();				//Ϊÿ���඼����һ���б��൱��ÿ���඼��һ������
	}
	
	public Classroom(String no) {
		this();
		this.no = no;
	}

	//Getter,Setter���췽��
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
}
