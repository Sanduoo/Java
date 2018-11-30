package cn.sxt.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 定义一个Student类，属性：name姓名，classNumber班号，score成绩
 * 现在将若干Student对象放入List，请统计出每个班的总分和平均分，分别打印出来
 * @author Admin
 *
 */
public class MapDemo {
	public static void main(String[] args) {
		List<Student> list= new ArrayList<>();
		exam(list);
		
		//统计
		Map<String, Classroom> rooms = new HashMap<String,Classroom>();
		count(rooms,list);
		//打印
		printScore(rooms);
	}
	
	/*打印总分与平均分*/
	public static void printScore(Map<String, Classroom> rooms) {
		Set<Map.Entry<String, Classroom>> entrySet = rooms.entrySet(); 
		Iterator<Map.Entry<String, Classroom>> it = entrySet.iterator();
		while (it.hasNext()) {
			Map.Entry<String, Classroom> entry = it.next();
			Classroom room = entry.getValue();
			double avg = room.getTotal()/room.getStudents().size();
			System.out.println("班号为："+room.getNo()+"总分为："+room.getTotal()+"平均分："+avg);
		}
		
	}
	
	/*统计分数*/
	public static void count(Map<String, Classroom> rooms,List<Student> list) {
		for(Student student:list) {
			String no = student.getNumber();
			double score = student.getScore();
			/*根据班级编号  查看Map是否存在该班级   （分拣思路）*/
			Classroom room = rooms.get(no);
			if (room==null) {				//创建容器
				room = new Classroom(no); 
				rooms.put(no, room);
			}
			/*存储*/
			room.setTotal(room.getTotal()+score);		
			room.getStudents().add(student);				//加入学生
		}
	}
	
	/*现在将若干Student对象放入List*/
	public static void exam(List<Student> list) {
		list.add(new Student("三多","001" , 81));
		list.add(new Student("四多","001" , 82));
		list.add(new Student("五多","002" , 83));
		list.add(new Student("六多","002" , 84));
		list.add(new Student("七多","003" , 85));
		list.add(new Student("八多","003" , 86));
	}
	
}
