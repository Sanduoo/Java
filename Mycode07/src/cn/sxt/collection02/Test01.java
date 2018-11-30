package cn.sxt.collection02;
/**
 * Javabean
 */
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test01 {
	public static void main(String[] args) throws Exception {
		
		Employee e = new Employee(0301,"三多",20000,"项目部","2018-8");
		Employee e2 = new Employee(0302,"四多",20001,"项目部","2018-7");
		Employee e3 = new Employee(0303,"五多",20002,"项目部","2018-6");
		
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(e);
		list.add(e2);
		list.add(e3);
		
		printEmpName(list);
		
	}
	
	public static void printEmpName(List<Employee> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName());;
		}
	}
	
}
