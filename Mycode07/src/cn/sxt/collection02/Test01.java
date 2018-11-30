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
		
		Employee e = new Employee(0301,"����",20000,"��Ŀ��","2018-8");
		Employee e2 = new Employee(0302,"�Ķ�",20001,"��Ŀ��","2018-7");
		Employee e3 = new Employee(0303,"���",20002,"��Ŀ��","2018-6");
		
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
