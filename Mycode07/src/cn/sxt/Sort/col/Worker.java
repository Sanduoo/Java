package cn.sxt.Sort.col;


public class Worker implements Comparable<Worker>{
	private String type;				//工种
	private double salary;			//工资
	
	public Worker() {
		// TODO Auto-generated constructor stub
	}
	public Worker(String type, double salary) {
		super();
		this.type = type;
		this.salary = salary;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
//	按工资排序-升
	@Override
	public int compareTo(Worker o) {
		return this.salary>o.salary?1:(this.salary==o.salary?0:-1);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "工种："+this.type+"工资："+this.salary+"\n";
	}
}
