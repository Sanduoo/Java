package cn.sxt.HashMap;

import java.util.ArrayList;
import java.util.List;

/**
 * 班级
 * @author Admin
 *
 */
public class Classroom {
	private String no;
	private List<Student>students;				//学生列表
	private double total;				//总分
	
	//生成空构造器
	public Classroom() {
		students = new ArrayList<Student>();				//为每个班都创建一个列表，相当于每个班都有一个容器
	}
	
	public Classroom(String no) {
		this();
		this.no = no;
	}

	//Getter,Setter构造方法
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
