package cn.sxt.collection02;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 容器存储数据
 * @author Admin
 *
 */

/**Javabean，实体类 (只有属性，setter。getter方法)**/
public class Employee {
	
	private int id;
	private String name;
	private int salary;
	private String department;
	private Date hieeDate;
	
	
	
	
	public Employee(int id, String name, int salary, String department, String hieeDate) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
		
		DateFormat format = new SimpleDateFormat("yyyy-MM");
		try {
			this.hieeDate = format.parse(hieeDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getHieeDate() {
		return hieeDate;
	}
	public void setHieeDate(Date hieeDate) {
		this.hieeDate = hieeDate;
	}
	
	
		
	
	
	
}
